package moe.mmio.nightly.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;
import moe.mmio.nightly.worldgen.structures.GenPlankBox;

public class ModGenerators {
    public static void registerModGenerators() {
        GameRegistry.registerWorldGenerator(new GenPlankBox(), 0);
    }
}
