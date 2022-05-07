
package net.mcreator.polenmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.polenmod.init.PolenModModTabs;
import net.mcreator.polenmod.init.PolenModModItems;

import java.util.List;

public class PolenswordItem extends SwordItem {
	public PolenswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PolenModModItems.POLEN_ORE_ITEM));
			}
		}, 3, 46f, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
		setRegistryName("polensword");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Nutze es um B\u00F6se Deutsche zu t\u00F6ten"));
	}
}
