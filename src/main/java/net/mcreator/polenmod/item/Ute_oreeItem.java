
package net.mcreator.polenmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
