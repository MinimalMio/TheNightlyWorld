package moe.mmio.nightly.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.ArrayList;

import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class BlockMoonlightBrick extends Block {
  private IIcon Icon;

  public BlockMoonlightBrick(Material material) {
    super(material.rock);
    this.setHardness(7.85f);
    this.setResistance(7.85f);
    this.setBlockName("moonlight_brick_block");
    this.setHarvestLevel("pickaxe", 1);
    this.setBlockTextureName(NightlyMod.MODID + ":moonlight_brick_block");
  }

  @Override
  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

    drops.add(new ItemStack(ModItems.moonlight_brick_block, 1));

    return drops;
  }
}
