package moe.mmio.nightly.armors;

import moe.mmio.nightly.NightlyMod;
import moe.mmio.nightly.items.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class RagArmor extends ItemArmor {
    public static final ArmorMaterial RAG_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("rag", 56, new int[]{1, 1, 1, 1}, 0);

    public RagArmor(int armorType) {
        super(RAG_ARMOR_MATERIAL, 0, armorType);
        this.setMaxStackSize(1);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return NightlyMod.MODID + ":textures/models/armor/rag_layer_" + (armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == ModItems.rag;
    }
}
