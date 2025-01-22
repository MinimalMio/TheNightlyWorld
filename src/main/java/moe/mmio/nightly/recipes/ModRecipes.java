package moe.mmio.nightly.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void recipesRegistry() {
        initializeFurnaceRecipes();
        initializeCraftTableRecipes();
    }

    public static void initializeFurnaceRecipes() {
        // PLACEHOLDER: 熔炉配方占留位
    }

    public static void initializeCraftTableRecipes() {
        // 破布系列盔甲合成配方
        GameRegistry.addRecipe(new ItemStack(ModItems.rag_helmet),
        "XXX",
        "X X",
        "   ",
        'X', ModItems.rag);
        GameRegistry.addRecipe(new ItemStack(ModItems.rag_chestplate),
        "X X",
        "XXX",
        "XXX",
        'X', ModItems.rag);
        GameRegistry.addRecipe(new ItemStack(ModItems.rag_legging),
        "XXX",
        "X X",
        "X X",
        'X', ModItems.rag);
        GameRegistry.addRecipe(new ItemStack(ModItems.rag_boots),
        "X X",
        "X X",
        "   ",
        'X', ModItems.rag);
    }
}
