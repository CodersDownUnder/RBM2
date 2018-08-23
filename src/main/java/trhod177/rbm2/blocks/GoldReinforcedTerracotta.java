package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class GoldReinforcedTerracotta extends CustomBlocks {

	public GoldReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(20f);
		this.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	
	
	@Override
	public GoldReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
}
