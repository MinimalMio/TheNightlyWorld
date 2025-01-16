package moe.mmio.nightly.creativetabs;

import moe.mmio.nightly.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs extends CreativeTabs {
  public ModCreativeTabs(int index, String label) {
    super(index, label);
  }

  @Override
  public Item getTabIconItem() {
    return Item.getItemFromBlock(ModItems.abyss_stone);
  }
}
