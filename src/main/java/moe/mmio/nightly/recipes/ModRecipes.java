package moe.mmio.nightly.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void recipesRegistry() {
        initializeFurnaceRecipes();
        initializeCraftTableRecipes();
    }

    public static void initializeFurnaceRecipes() {
        // 矿物凝胶
        GameRegistry.addSmelting(new ItemStack(ModItems.coal_gel), new ItemStack(Items.coal), 0.3f);
        GameRegistry.addSmelting(new ItemStack(ModItems.iron_gel), new ItemStack(Items.iron_ingot), 0.5f);
        GameRegistry.addSmelting(new ItemStack(ModItems.gold_gel), new ItemStack(Items.gold_ingot), 0.5f);
        GameRegistry.addSmelting(new ItemStack(ModItems.diamond_gel), new ItemStack(Items.diamond), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.redstone_gel), new ItemStack(Items.redstone), 0.4f);
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
