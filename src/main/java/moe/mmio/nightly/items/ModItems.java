package moe.mmio.nightly.items;

import cpw.mods.fml.common.registry.GameRegistry;
import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.armors.RagArmor;
import moe.mmio.nightly.blocks.BlockAbyssStone;
import moe.mmio.nightly.blocks.BlockDungeonBrick;
import moe.mmio.nightly.blocks.BlockMoonlightBrick;
import moe.mmio.nightly.blocks.BlockNightMushroom;
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
  public static Item rag;

  public static Item enchanted_raindial;

  /* 矿物凝胶系列物品，由史莱姆掉落 */
  public static Item iron_gel;
  public static Item coal_gel;
  public static Item lapis_gel;
  public static Item redstone_gel;
  public static Item diamond_gel;
  public static Item gold_gel;

  public static Item rag_helmet;
  public static Item rag_chestplate;
  public static Item rag_legging;
  public static Item rag_boots;

  public static Block abyss_stone;
  public static Block moonlight_brick_block;
  public static Block dungeon_block;

  public static Block night_mushroom;

  public static void initializeItems() {
    light_fragment = new Item().setUnlocalizedName("light_fragment").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":light_fragment").setCreativeTab(nightlyModCreativeTab);
    moonlight_crystal = new Item().setUnlocalizedName("moonlight_crystal").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":moonlight_crystal").setCreativeTab(nightlyModCreativeTab);
    moonlight_brick = new Item().setUnlocalizedName("moonlight_brick").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":moonlight_brick").setCreativeTab(nightlyModCreativeTab);
    rag = new Item().setUnlocalizedName("rag").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":rag").setCreativeTab(nightlyModCreativeTab);

    enchanted_raindial = new ItemRainDial().setCreativeTab(nightlyModCreativeTab);

    iron_gel = new Item().setUnlocalizedName("iron_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":iron_gel").setCreativeTab(nightlyModCreativeTab);
    coal_gel = new Item().setUnlocalizedName("coal_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":coal_gel").setCreativeTab(nightlyModCreativeTab);
    lapis_gel = new Item().setUnlocalizedName("lapis_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":lapis_gel").setCreativeTab(nightlyModCreativeTab);
    redstone_gel = new Item().setUnlocalizedName("redstone_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":redstone_gel").setCreativeTab(nightlyModCreativeTab);
    diamond_gel = new Item().setUnlocalizedName("diamond_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":diamond_gel").setCreativeTab(nightlyModCreativeTab);
    gold_gel = new Item().setUnlocalizedName("gold_gel").setMaxStackSize(64).setTextureName(NightlyMod.MODID + ":gold_gel").setCreativeTab(nightlyModCreativeTab);

    rag_helmet = new RagArmor(0)
      .setUnlocalizedName("rag_helmet")
      .setTextureName(NightlyMod.MODID + ":rag_helmet")
      .setCreativeTab(nightlyModCreativeTab);
    rag_chestplate = new RagArmor(1)
      .setUnlocalizedName("rag_chestplate")
      .setTextureName(NightlyMod.MODID + ":rag_chestplate")
      .setCreativeTab(nightlyModCreativeTab);
    rag_legging = new RagArmor(2)
      .setUnlocalizedName("rag_legging")
      .setTextureName(NightlyMod.MODID + ":rag_legging")
      .setCreativeTab(nightlyModCreativeTab);
    rag_boots = new RagArmor(3)
      .setUnlocalizedName("rag_boots")
      .setTextureName(NightlyMod.MODID + ":rag_boots")
      .setCreativeTab(nightlyModCreativeTab);

    abyss_stone = new BlockAbyssStone(Material.rock).setCreativeTab(nightlyModCreativeTab);
    moonlight_brick_block = new BlockMoonlightBrick(Material.rock).setCreativeTab(nightlyModCreativeTab);
    dungeon_block = new BlockDungeonBrick(Material.rock).setCreativeTab(nightlyModCreativeTab);
    night_mushroom = new BlockNightMushroom().setCreativeTab(nightlyModCreativeTab);
  }

  public static void registerItems() {
    GameRegistry.registerItem(light_fragment, light_fragment.getUnlocalizedName());
    GameRegistry.registerItem(moonlight_crystal, moonlight_crystal.getUnlocalizedName());
    GameRegistry.registerItem(moonlight_brick, moonlight_brick.getUnlocalizedName());
    GameRegistry.registerItem(rag, rag.getUnlocalizedName());

    GameRegistry.registerItem(enchanted_raindial, enchanted_raindial.getUnlocalizedName());

    GameRegistry.registerItem(iron_gel, iron_gel.getUnlocalizedName());
    GameRegistry.registerItem(coal_gel, coal_gel.getUnlocalizedName());
    GameRegistry.registerItem(lapis_gel,lapis_gel.getUnlocalizedName());
    GameRegistry.registerItem(redstone_gel, redstone_gel.getUnlocalizedName());
    GameRegistry.registerItem(diamond_gel, diamond_gel.getUnlocalizedName());
    GameRegistry.registerItem(gold_gel, gold_gel.getUnlocalizedName());

    GameRegistry.registerItem(rag_helmet, rag_helmet.getUnlocalizedName());
    GameRegistry.registerItem(rag_chestplate, rag_chestplate.getUnlocalizedName());
    GameRegistry.registerItem(rag_legging, rag_legging.getUnlocalizedName());
    GameRegistry.registerItem(rag_boots, rag_boots.getUnlocalizedName());

    GameRegistry.registerBlock(abyss_stone, abyss_stone.getUnlocalizedName());
    GameRegistry.registerBlock(moonlight_brick_block, moonlight_brick_block.getUnlocalizedName());
    GameRegistry.registerBlock(dungeon_block, dungeon_block.getUnlocalizedName());

    GameRegistry.registerBlock(night_mushroom, night_mushroom.getUnlocalizedName());
  }
}
