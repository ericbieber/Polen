
package net.mcreator.polenmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.polenmod.init.PolenModModTabs;

public class Ute_oreeItem extends Item {
	public Ute_oreeItem() {
		super(new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ute_oree");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
