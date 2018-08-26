package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class BedrockReinforcedStone extends CustomBlocks {

	public BedrockReinforcedStone(String name) {
		super(Material.ROCK, name);
		setHardness(-1f);
		setResistance(18000000f);
		
		
		
	}
	
	
	
	@Override
	public BedrockReinforcedStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2StoneTab);
		return this;
	}
}
