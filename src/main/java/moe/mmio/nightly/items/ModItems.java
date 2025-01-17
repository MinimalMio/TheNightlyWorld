package moe.mmio.nightly.items;

import cpw.mods.fml.common.registry.GameRegistry;
import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.blocks.BlockAbyssStone;
import moe.mmio.nightly.blocks.BlockMoonlightBrick;
import moe.mmio.nightly.creativetabs.ModCreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

public class ModItems {
  public static void mainRegistry() {
    initializeItems();
    registerItems();
  }

  public static final CreativeTabs nightlyModCreativeTab = new ModCreativeTabs(CreativeTabs.getNextID(), "nightly_tab");

  public static Item light_fragment;
  public static Item moonlight_crystal;
  public static Item moonlight_brick;

  public static Block abyss_stone;
  public static Block moonlight_brick_block;

  public static void initializeItems() {
    light_fragment = new Item().setUnlocalizedName("light_fragment").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":light_fragment").setCreativeTab(nightlyModCreativeTab);
    moonlight_crystal = new Item().setUnlocalizedName("moonlight_crystal").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":moonlight_crystal").setCreativeTab(nightlyModCreativeTab);
    moonlight_brick = new Item().setUnlocalizedName("moonlight_brick").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":moonlight_brick").setCreativeTab(nightlyModCreativeTab);

    abyss_stone = new BlockAbyssStone(Material.rock).setCreativeTab(nightlyModCreativeTab);
    moonlight_brick_block = new BlockMoonlightBrick(Material.rock).setCreativeTab(nightlyModCreativeTab);
  }

  public static void registerItems() {
    GameRegistry.registerItem(light_fragment, light_fragment.getUnlocalizedName());
    GameRegistry.registerItem(moonlight_crystal, moonlight_crystal.getUnlocalizedName());
    GameRegistry.registerItem(moonlight_brick, moonlight_brick.getUnlocalizedName());

    GameRegistry.registerBlock(abyss_stone, abyss_stone.getUnlocalizedName());
    GameRegistry.registerBlock(moonlight_brick_block, moonlight_brick_block.getUnlocalizedName());
  }
}
