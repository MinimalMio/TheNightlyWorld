package moe.mmio.nightly.eventhandlers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ForeverNightEventHandler {
  @SubscribeEvent
  public void onWorldTick(TickEvent.WorldTickEvent event) {
    /*
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
    */
    if (event.phase == TickEvent.Phase.START) {
      World world = event.world;

      if (!world.isRemote && world instanceof WorldServer) {
        boolean foreverNight = world.getGameRules().getGameRuleBooleanValue("foreverNight");

        if (foreverNight) {
          world.setWorldTime(18000);
        }
      }
    }
  }
}
