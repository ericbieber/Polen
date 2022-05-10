package net.mcreator.polenmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GaymodeprozedurProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.get("text:textFieldName")instanceof EditBox _tf)
			_tf.setValue("Gaymode enable");
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PolenModModItems.DILDO);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
