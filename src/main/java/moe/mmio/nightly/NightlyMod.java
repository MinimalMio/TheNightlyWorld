package moe.mmio.nightly;

import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import moe.mmio.nightly.creativetabs.ModCreativeTabs;
import moe.mmio.nightly.items.ModItems;
import moe.mmio.nightly.eventhandlers.CommonEventHandler;

@Mod(modid = NightlyMod.MODID, version = NightlyMod.VERSION, name = NightlyMod.MODNAME)
public class NightlyMod {
  public static final String MODID = "nightly";
  public static final String VERSION = "1.0";
  public static final String MODNAME = "The Nightly World";

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    /* Main Registry */
    ModItems.mainRegistry();

    /* Events Registry */
    MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
  }
}
