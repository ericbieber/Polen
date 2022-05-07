
package net.mcreator.polenmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.polenmod.init.PolenModModTabs;

public class UteremixoreItem extends Item {
	public UteremixoreItem() {
		super(new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("uteremixore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
