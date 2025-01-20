package moe.mmio.nightly.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.ArrayList;

import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class BlockDungeonBrick extends Block {
  private IIcon Icon;

  public BlockDungeonBrick(Material material) {
    super(material.rock);
    this.setHardness(10.33f);
    this.setResistance(7.85f);
    this.setBlockName("dungeon_block");
    this.setHarvestLevel("pickaxe", 2);
    this.setBlockTextureName(NightlyMod.MODID + ":dungeon_block");
  }

  @Override
  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

    drops.add(new ItemStack(ModItems.dungeon_block, 1));

    return drops;
  }
}
