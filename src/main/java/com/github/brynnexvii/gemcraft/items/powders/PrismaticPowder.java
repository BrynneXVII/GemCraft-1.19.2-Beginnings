package com.github.brynnexvii.gemcraft.items.powders;

import java.util.Arrays;
import java.util.List;

import com.github.brynnexvii.gemcraft.items.JewelPowder;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;


public class PrismaticPowder extends JewelPowder{
	private static final List<Block> FLOWER_TARGETS = Arrays.asList(Blocks.LILY_OF_THE_VALLEY);
	
	public PrismaticPowder(Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean canPlace(BlockPlaceContext context) {
		if (context == null) {
			return false;
        } else {
        	BlockPos blockpos = context.getClickedPos();
            Level level = context.getLevel();
            BlockState blockstate = level.getBlockState(blockpos);
            
            if(PrismaticPowder.FLOWER_TARGETS.contains(blockstate.getBlock())) {
            	//TO CONTINUE
            	return true;
            } else {
            	return false;
            }
        }
	}
	
}
