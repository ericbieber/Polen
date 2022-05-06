
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.polenmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PolenModModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion POLENPOTION = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000, 10, false, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 10000, 10, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 10000, 10, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10000, 10, false, true)).setRegistryName("polenpotion"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
