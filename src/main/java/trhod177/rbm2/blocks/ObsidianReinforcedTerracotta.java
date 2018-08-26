package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class ObsidianReinforcedTerracotta extends CustomBlocks {

	public ObsidianReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(35f);
		setResistance(6000f);
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	
	
	
	@Override
	public ObsidianReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
}
