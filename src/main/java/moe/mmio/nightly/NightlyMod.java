package moe.mmio.nightly;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import moe.mmio.nightly.creativetabs.ModCreativeTabs;
import moe.mmio.nightly.items.ModItems;

@Mod(modid = NightlyMod.MODID, version = NightlyMod.VERSION, name = NightlyMod.MODNAME)
public class NightlyMod {
    public static final String MODID = "nightly";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "The Nightly World";

    @EventHandler
    public void init(FMLInitializationEvent event) {
      ModItems.mainRegistry();
    }
}
