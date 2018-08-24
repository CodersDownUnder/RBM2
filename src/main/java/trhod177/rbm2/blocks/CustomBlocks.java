package trhod177.rbm2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import trhod177.rbm2.ReinforcedBlocksMod2;
import trhod177.rbm2.init.BlockInit;


public class CustomBlocks extends Block {


	protected String name;

	public CustomBlocks(Material material, String name) {
		
		super(material.ROCK);
		this.name = name;
	
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
	
	
	public void registerItemModel(Item itemBlock) {
		ReinforcedBlocksMod2.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public CustomBlocks setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}


	

}

