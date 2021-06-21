package com.jun.goder.core.init;

import com.jun.goder.Goder;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Goder.MOD_ID);

	public static final RegistryObject<Block> PYRITE_BLOCK = BLOCKS
			.register("pyrite_block",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GREEN)
							.hardnessAndResistance(30f, 20f).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3)
							.sound(SoundType.METAL)));

	public static final RegistryObject<Block> PYRITEORE_BLOCK = BLOCKS.register("pyriteore_block",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
}
