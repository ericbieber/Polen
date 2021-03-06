
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.polenmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.polenmod.item.UteremixoreItem;
import net.mcreator.polenmod.item.Ute_oreeItem;
import net.mcreator.polenmod.item.ShotgunammoItem;
import net.mcreator.polenmod.item.SaliBonaniItem;
import net.mcreator.polenmod.item.RauberArmorItem;
import net.mcreator.polenmod.item.PolnischeNatzionalhimneItem;
import net.mcreator.polenmod.item.PolenswordItem;
import net.mcreator.polenmod.item.PolenpickaxeItem;
import net.mcreator.polenmod.item.PolenhoeItem;
import net.mcreator.polenmod.item.PolenflaggeItem;
import net.mcreator.polenmod.item.PolenaxeItem;
import net.mcreator.polenmod.item.PolenOreItemItem;
import net.mcreator.polenmod.item.MegadildoItem;
import net.mcreator.polenmod.item.JesuskraftItem;
import net.mcreator.polenmod.item.JesusKreuzItem;
import net.mcreator.polenmod.item.DobbelbarrelshotgunItem;
import net.mcreator.polenmod.item.DildoItem;
import net.mcreator.polenmod.item.BrechstangeItem;
import net.mcreator.polenmod.item.BigironswordItem;
import net.mcreator.polenmod.item.BiggoldswordItem;
import net.mcreator.polenmod.item.BigdiamondswordItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PolenModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item POLEN_ORE_BLOCK = register(PolenModModBlocks.POLEN_ORE_BLOCK, PolenModModTabs.TAB_POLENMOD);
	public static final Item POLEN_ORE_ITEM = register(new PolenOreItemItem());
	public static final Item POLENPICKAXE = register(new PolenpickaxeItem());
	public static final Item POLENSWORD = register(new PolenswordItem());
	public static final Item POLENHOE = register(new PolenhoeItem());
	public static final Item POLENAXE = register(new PolenaxeItem());
	public static final Item BRECHSTANGE = register(new BrechstangeItem());
	public static final Item RAUBER_ARMOR_HELMET = register(new RauberArmorItem.Helmet());
	public static final Item RAUBER_ARMOR_CHESTPLATE = register(new RauberArmorItem.Chestplate());
	public static final Item RAUBER_ARMOR_LEGGINGS = register(new RauberArmorItem.Leggings());
	public static final Item RAUBER_ARMOR_BOOTS = register(new RauberArmorItem.Boots());
	public static final Item POLENBLOCK = register(PolenModModBlocks.POLENBLOCK, PolenModModTabs.TAB_POLENMOD);
	public static final Item POLNISCHE_NATZIONALHIMNE = register(new PolnischeNatzionalhimneItem());
	public static final Item JESUSKRAFT = register(new JesuskraftItem());
	public static final Item JESUS_KREUZ = register(new JesusKreuzItem());
	public static final Item SALI_BONANI = register(new SaliBonaniItem());
	public static final Item UTEREMIXORE = register(new UteremixoreItem());
	public static final Item POLENFLAGGE = register(new PolenflaggeItem());
	public static final Item DILDO = register(new DildoItem());
	public static final Item UTE_OREE = register(new Ute_oreeItem());
	public static final Item UTE_OREE_ORE = register(PolenModModBlocks.UTE_OREE_ORE, PolenModModTabs.TAB_POLENMOD);
	public static final Item UTE_OREE_BLOCK = register(PolenModModBlocks.UTE_OREE_BLOCK, PolenModModTabs.TAB_POLENMOD);
	public static final Item SHOTGUNAMMO = register(new ShotgunammoItem());
	public static final Item DOBBELBARRELSHOTGUN = register(new DobbelbarrelshotgunItem());
	public static final Item UTEORE_2_ORE = register(PolenModModBlocks.UTEORE_2_ORE, PolenModModTabs.TAB_POLENMOD);
	public static final Item UTEORE_2_BLOCK = register(PolenModModBlocks.UTEORE_2_BLOCK, PolenModModTabs.TAB_POLENMOD);
	public static final Item BIGIRONSWORD = register(new BigironswordItem());
	public static final Item BIGGOLDSWORD = register(new BiggoldswordItem());
	public static final Item BIGDIAMONDSWORD = register(new BigdiamondswordItem());
	public static final Item MEGADILDO = register(new MegadildoItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
