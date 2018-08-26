package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class DiamondReinforcedStone extends CustomBlocks {

	public DiamondReinforcedStone(String name) {
		super(Material.ROCK, name);
		setHardness(5f);
		setResistance(40f);
		this.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	
	
	@Override
	public DiamondReinforcedStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2StoneTab);
		return this;
	}
}
