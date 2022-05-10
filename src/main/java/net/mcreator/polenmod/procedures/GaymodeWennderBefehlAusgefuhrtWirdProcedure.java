package net.mcreator.polenmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GaymodeWennderBefehlAusgefuhrtWirdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"say gaymode enable");
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PolenModModItems.DILDO);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
