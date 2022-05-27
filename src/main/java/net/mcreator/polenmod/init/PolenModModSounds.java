
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.polenmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PolenModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("polen_mod", "polen"), new SoundEvent(new ResourceLocation("polen_mod", "polen")));
		REGISTRY.put(new ResourceLocation("polen_mod", "sali"), new SoundEvent(new ResourceLocation("polen_mod", "sali")));
		REGISTRY.put(new ResourceLocation("polen_mod", "ohhhh"), new SoundEvent(new ResourceLocation("polen_mod", "ohhhh")));
		REGISTRY.put(new ResourceLocation("polen_mod", "shotgun_sound"), new SoundEvent(new ResourceLocation("polen_mod", "shotgun_sound")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
