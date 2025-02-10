package moe.mmio.nightly.items;

import moe.mmio.nightly.NightlyMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRainDial extends Item  {
    public ItemRainDial() {
        this.setUnlocalizedName("enchanted_raindial");
        this.setTextureName(NightlyMod.MODID + ":enchanted_raindial");
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (world.provider.dimensionId == 0) {
            if (world.isRaining()) {
                world.setRainStrength(0.0f);
            }
        }
        return stack;
    }
}
