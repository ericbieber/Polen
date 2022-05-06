
package net.mcreator.polenmod.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.polenmod.init.PolenModModItems;

public class PolenenchantEnchantment extends Enchantment {
	public PolenenchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR, slots);
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 50;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.MENDING)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == PolenModModItems.RAUBER_ARMOR_BOOTS)
			return true;
		if (stack.getItem() == PolenModModItems.RAUBER_ARMOR_LEGGINGS)
			return true;
		if (stack.getItem() == PolenModModItems.RAUBER_ARMOR_CHESTPLATE)
			return true;
		if (stack.getItem() == PolenModModItems.RAUBER_ARMOR_HELMET)
			return true;
		return false;
	}
}
