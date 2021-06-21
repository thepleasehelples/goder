package com.jun.goder.core.itemgroup;

import com.jun.goder.core.init.itemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GoderItemGroup extends ItemGroup {

	public static final GoderItemGroup GODER = new GoderItemGroup(ItemGroup.GROUPS.length, "goder");

	public GoderItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(itemInit.KILLER_ITEM.get());
	}

}