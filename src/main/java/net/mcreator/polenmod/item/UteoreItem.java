
package net.mcreator.polenmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.polenmod.init.PolenModModTabs;

public class UteoreItem extends Item {
	public UteoreItem() {
		super(new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("uteore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
