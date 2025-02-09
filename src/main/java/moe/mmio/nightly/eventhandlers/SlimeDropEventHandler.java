package moe.mmio.nightly.eventhandlers;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class SlimeDropEventHandler {
    private static final Random rand = new Random();

    @SubscribeEvent
    public void onLivingDrops(LivingDropsEvent event) {
        if (event.entityLiving instanceof EntitySlime) {
            EntitySlime slime = (EntitySlime) event.entityLiving;

            // 清空原版掉落
            event.drops.clear();

            addCustomDrop(event, new ItemStack(Items.slime_ball), 0.4);      // 40% 概率
            addCustomDrop(event, new ItemStack(ModItems.iron_gel), 0.1);     // 10% 概率
            addCustomDrop(event, new ItemStack(ModItems.coal_gel), 0.1);     // 10% 概率
            addCustomDrop(event, new ItemStack(ModItems.diamond_gel), 0.1);  // 10% 概率
            addCustomDrop(event, new ItemStack(ModItems.gold_gel), 0.1);     // 10% 概率
            addCustomDrop(event, new ItemStack(ModItems.lapis_gel), 0.1);    // 10% 概率
            addCustomDrop(event, new ItemStack(ModItems.redstone_gel), 0.1); // 10% 概率
        }
    }

    private void addCustomDrop(LivingDropsEvent event, ItemStack stack, double chance) {
        if (rand.nextDouble() < chance) {
            EntityItem entityItem = new EntityItem(
                event.entity.worldObj,
                event.entity.posX,
                event.entity.posY,
                event.entity.posZ,
                stack
            );
            event.drops.add(entityItem);
        }
    }
}
