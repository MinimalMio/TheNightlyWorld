package moe.mmio.nightly.blocks;

import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;
import java.util.ArrayList;

public class BlockAbyssStone extends Block {
  private IIcon Icon;

  public BlockAbyssStone(Material material) {
    super(material.rock);
    this.setHardness(45.5f);
    this.setResistance(5000.0f);
    this.setBlockName("abyss_stone");
    this.setBlockTextureName(NightlyMod.MODID + ":abyss_stone");
    this.setHarvestLevel("pickaxe", 3);
    this.setLightLevel(0.5f);
  }

  @Override
  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

    drops.add(new ItemStack(ModItems.abyss_stone, 1));

    return drops;
  }
}
