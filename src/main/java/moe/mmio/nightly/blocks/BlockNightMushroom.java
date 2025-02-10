package moe.mmio.nightly.blocks;

import java.util.ArrayList;

import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.block.BlockMushroom;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockNightMushroom extends BlockMushroom {
    
    public BlockNightMushroom() {
        this.setHardness(0.5f);
        this.setResistance(0.1f);
        this.setBlockName("night_mushroom");
        this.setBlockTextureName(NightlyMod.MODID + ":night_mushroom");
        this.setHarvestLevel("hoe", 0);
        this.setLightLevel(0.2f);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

        drops.add(new ItemStack(ModItems.dungeon_block, 1));

        return drops;
    }
}
