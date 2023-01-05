package com.github.brynnexvii.gemcraft.init;

import com.github.brynnexvii.gemcraft.GemCraft;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemCraft.MODID);
}
