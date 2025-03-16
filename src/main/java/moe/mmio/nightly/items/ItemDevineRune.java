package moe.mmio.nightly.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

import static moe.mmio.nightly.items.ModItems.nightlyModCreativeTab;

public class ItemDevineRune extends Item {
    public ItemDevineRune() {
        setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            NBTTagCompound nbt = stack.getTagCompound();
            if (nbt == null) nbt = new NBTTagCompound();

            boolean devineActive = !nbt.getBoolean("devineActive");
            nbt.setBoolean("devineActive", devineActive);
            stack.setTagCompound(nbt);

            player.addChatMessage(new ChatComponentTranslation(
                    devineActive ? "mode.devine.enabled" : "mode.devine.disabled"
            ));
        }
        return stack;
    }
}
