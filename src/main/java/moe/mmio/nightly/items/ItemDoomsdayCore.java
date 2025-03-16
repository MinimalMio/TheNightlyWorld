package moe.mmio.nightly.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemDoomsdayCore extends Item {
    public ItemDoomsdayCore() {
        setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            NBTTagCompound nbt = stack.getTagCompound();
            if (nbt == null) nbt = new NBTTagCompound();

            boolean doomsdayActive = !nbt.getBoolean("doomsdayActive");
            nbt.setBoolean("doomsdayActive", doomsdayActive);
            stack.setTagCompound(nbt);

            player.addChatMessage(new ChatComponentTranslation(
                    doomsdayActive ? "mode.doomsday.enabled" : "mode.doomsday.disabled"
            ));
        }
        return stack;
    }
}
