package net.mcreator.polenmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.polenmod.init.PolenModModItems;

import java.util.HashMap;

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
