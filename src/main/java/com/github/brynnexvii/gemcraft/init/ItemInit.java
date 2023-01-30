package com.github.brynnexvii.gemcraft.init;

import com.github.brynnexvii.gemcraft.GemCraft;
import com.github.brynnexvii.gemcraft.items.powders.PrismaticPowder;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	//base property method
	private static Item.Properties baseProps () {
		return new Item.Properties().tab(GemCraft.GEMCRAFT_TAB);
	}
	
	//deferred register
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemCraft.MODID);
	
	//jewel powders
	public static final RegistryObject<PrismaticPowder> PRISMATIC_POWDER = ITEMS.register("gc_prismatic_powder", 
			() -> new PrismaticPowder(baseProps()));
	
}
