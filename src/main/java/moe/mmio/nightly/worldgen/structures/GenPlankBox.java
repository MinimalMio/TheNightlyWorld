package moe.mmio.nightly.worldgen.structures;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GenPlankBox implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
            IChunkProvider chunkProvider) {
        if (world.provider.dimensionId == 0) {
            int x = chunkX * 16 + random.nextInt(16);
            int z = chunkZ * 16 + random.nextInt(16);
            int y = world.getHeightValue(x, z);

            if (world.getBiomeGenForCoords(x, z).biomeName.equals("Plains") && random.nextDouble() < 0.0555) {
                genStructure(world, random, x, y, z);
            }
        }
    }
    
    private void genStructure(World world, Random random, int x, int y, int z) {
        // 顶部和底部平台
        for (int dx = -2; dx <= 2; dx++) {
            for (int dz = -2; dz <= 2; dz++) {
                world.setBlock(x + dx, y, z + dz, Blocks.planks);
                world.setBlock(x + dx, y + 4, z + dz, Blocks.planks);
            }
        }

        // 墙壁门口
        for (int dy = 1; dy <= 3; dy++) {
            for (int dx = -2; dx <= 2; dx++) {
                for (int dz = -2; dz <= 2; dz++) {
                    if (Math.abs(dx) == 2 || Math.abs(dz) == 2) {
                        // 四面门口
                        if (!(Math.abs(dx) == 2 && dz == 0 || Math.abs(dz) == 2 && dx == 0)) {
                            world.setBlock(x + dx, y + dy, z + dz, Blocks.planks);
                        }
                    }
                }
            }
        }

        // 中心的箱子
        world.setBlock(x, y + 1, z, Blocks.chest);
        TileEntityChest chest = (TileEntityChest)world.getTileEntity(x, y + 1, z);
        if (chest != null) {
            chest.setInventorySlotContents(0, new ItemStack(Items.iron_ingot, random.nextInt(5) + 1));
            chest.setInventorySlotContents(1, new ItemStack(ModItems.rag, random.nextInt(3) + 1));
        }
    }
}
