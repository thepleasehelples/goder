package com.jun.goder.core.init;

import com.jun.goder.Goder;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class itemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Goder.MOD_ID);

	public static final RegistryObject<Item> KILLER_ITEM = ITEMS.register("killer_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}

