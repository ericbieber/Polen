
package net.mcreator.polenmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.polenmod.init.PolenModModTabs;

public abstract class RauberArmorItem extends ArmorItem {
	public RauberArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BLACK_WOOL));
			}

			@Override
			public String getName() {
				return "rauber_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RauberArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
			setRegistryName("rauber_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "polen_mod:textures/models/armor/rauber_layer_1.png";
		}
	}

	public static class Chestplate extends RauberArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
			setRegistryName("rauber_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "polen_mod:textures/models/armor/rauber_layer_1.png";
		}
	}

	public static class Leggings extends RauberArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
			setRegistryName("rauber_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "polen_mod:textures/models/armor/rauber_layer_2.png";
		}
	}

	public static class Boots extends RauberArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PolenModModTabs.TAB_POLENMOD));
			setRegistryName("rauber_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "polen_mod:textures/models/armor/rauber_layer_1.png";
		}
	}
}
