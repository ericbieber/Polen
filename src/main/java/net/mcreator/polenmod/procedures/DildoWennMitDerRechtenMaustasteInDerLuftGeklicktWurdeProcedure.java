package net.mcreator.polenmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DildoWennMitDerRechtenMaustasteInDerLuftGeklicktWurdeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("polen_mod:ohhhh")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("polen_mod:ohhhh")), SoundSource.NEUTRAL, 1,
						1, false);
			}
		}
	}
}
