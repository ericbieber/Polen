
package net.mcreator.polenmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class JesuskraftItem extends Item {
	public JesuskraftItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("jesuskraft");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
