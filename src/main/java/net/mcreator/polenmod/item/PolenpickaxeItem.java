
package net.mcreator.polenmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.polenmod.init.PolenModModTabs;
import net.mcreator.polenmod.init.PolenModModItems;

import java.util.List;

public class PolenpickaxeItem extends PickaxeItem {
	public PolenpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PolenModModItems.POLEN_ORE_ITEM));
			}
		}, 1, -3f, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
		setRegistryName("polenpickaxe");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Polen_pickaxe zum zerst\u00F6ren von Spezialen T\u00FCren und Fenstern"));
	}
}
