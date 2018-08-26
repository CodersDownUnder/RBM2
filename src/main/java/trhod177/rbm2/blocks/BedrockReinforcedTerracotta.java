package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class BedrockReinforcedTerracotta extends CustomBlocks {

	public BedrockReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(-1f);
		setResistance(18000000f);
		
		
		
	}
	
	
	
	@Override
	public BedrockReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
}
