
package net.mcreator.polenmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.polenmod.init.PolenModModTabs;
import net.mcreator.polenmod.init.PolenModModSounds;

import java.util.List;

public class SaliBonaniItem extends RecordItem {
	public SaliBonaniItem() {
		super(0, PolenModModSounds.REGISTRY.get(new ResourceLocation("polen_mod:sali")),
				new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("sali_bonani");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Sali Bonani"));
	}
}
