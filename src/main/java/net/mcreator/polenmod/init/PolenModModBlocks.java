
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.polenmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.polenmod.block.Ute_oreeOreBlock;
import net.mcreator.polenmod.block.Ute_oreeBlockBlock;
import net.mcreator.polenmod.block.PolenblockBlock;
import net.mcreator.polenmod.block.Polen_OreBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PolenModModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block POLEN_ORE_BLOCK = register(new Polen_OreBlockBlock());
	public static final Block POLENBLOCK = register(new PolenblockBlock());
	public static final Block UTE_OREE_ORE = register(new Ute_oreeOreBlock());
	public static final Block UTE_OREE_BLOCK = register(new Ute_oreeBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
