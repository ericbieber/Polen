
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.polenmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.polenmod.enchantment.PolenenchantEnchantment;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PolenModModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment POLENENCHANT = register("polen_mod:polenenchant", new PolenenchantEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}
