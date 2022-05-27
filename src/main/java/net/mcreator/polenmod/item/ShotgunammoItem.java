
package net.mcreator.polenmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ShotgunammoItem extends Item {

	public ShotgunammoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("shotgunammo");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
