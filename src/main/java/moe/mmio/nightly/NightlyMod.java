package moe.mmio.nightly;

import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import moe.mmio.nightly.creativetabs.ModCreativeTabs;
import moe.mmio.nightly.items.ModItems;

@Mod(modid = NightlyMod.MODID, version = NightlyMod.VERSION, name = NightlyMod.MODNAME)
public class NightlyMod {
  public static final String MODID = "nightly";
  public static final String VERSION = "1.0";
  public static final String MODNAME = "The Nightly World";

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    GameRules gameRules = MinecraftServer.getServer().worldServers[0].getGameRules();
    if (!gameRules.hasRule("foreverNight")) {
      gameRules.setOrCreateGameRule("foreverNight", "true");
    }
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    /* Main Registry */
    ModItems.mainRegistry();

    /* Listen on game rules and control times. */
    MinecraftServer server = MinecraftServer.getServer();
    if (server != null && server.isSinglePlayer()) {
      World world = server.worldServers[0];
      if (world != null) {
        GameRules gameRules = world.getGameRules();
        if (gameRules.getGameRuleBooleanValue("foreverNight")) {
          // set time to 18000(midnight)
          world.setWorldTime(18000);
        }
      }
    }
  }
}
