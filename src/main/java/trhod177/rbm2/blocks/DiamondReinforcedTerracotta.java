package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class DiamondReinforcedTerracotta extends CustomBlocks {

	public DiamondReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(5f);
		setResistance(40f);
		this.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	
	
	@Override
	public DiamondReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
}
