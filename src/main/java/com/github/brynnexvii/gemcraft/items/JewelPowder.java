package com.github.brynnexvii.gemcraft.items;

import javax.annotation.Nullable;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;

public class JewelPowder extends Item {

	public JewelPowder(Properties properties) {
		super(properties);
	}
	
	@Override
	public InteractionResult useOn(UseOnContext useContext) {
		BlockPlaceContext context = new BlockPlaceContext(useContext);
		
		if (!this.canPlace(context)) {
			return InteractionResult.FAIL;
		} else {
			
			return InteractionResult.SUCCESS;
		}
	}
	
	@Nullable //this is something that minecraft block items use, not quite sure why though
	public BlockPlaceContext updatePlacementContext(BlockPlaceContext context) {
		return context;
	}
	
	public boolean canPlace(BlockPlaceContext context) {
		return false;
	}

}
