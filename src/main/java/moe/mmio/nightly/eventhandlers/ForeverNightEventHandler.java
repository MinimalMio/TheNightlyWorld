package moe.mmio.nightly.eventhandlers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.WorldServer;

public class ForeverNightEventHandler {

  /*
  @Mod.EventHandler
  public static void serverStarting(FMLServerStartingEvent event) {
    MinecraftServer server = event.getServer();
    server.worldServers[0].getGameRules().addGameRule("foreverNight", "true");
  }
  */

  @SubscribeEvent
  public static void onWorldTick(TickEvent.WorldTickEvent event) {
    if (!event.world.isRemote && event.world instanceof WorldServer) {
      WorldServer worldServer = (WorldServer) event.world;
      GameRules gameRules = worldServer.getGameRules();

      boolean foreverNight = gameRules.getGameRuleBooleanValue("foreverNight");

      if (foreverNight) {
        gameRules.setOrCreateGameRule("doDaylightCycle", "false");
        
        if (worldServer.getWorldTime() != 18000) {
          worldServer.setWorldTime(18000);
        }
      } else {
        gameRules.setOrCreateGameRule("doDaylightCycle", "true");
      }
    }
  }
}
