package moe.mmio.nightly;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import moe.mmio.nightly.items.ModItems;
import moe.mmio.nightly.recipes.ModRecipes;
import moe.mmio.nightly.worldgen.ModGenerators;
import moe.mmio.nightly.eventhandlers.ForeverNightEventHandler;

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
    ModGenerators.registerModGenerators();
    ModRecipes.recipesRegistry();

    /* Events registry */
    MinecraftForge.EVENT_BUS.register(new ForeverNightEventHandler());
  }

  @EventHandler
  public static void serverStarting(FMLServerStartingEvent event) {
    event.getServer().worldServers[0].getGameRules().addGameRule("foreverNight", "true");
  }
}
