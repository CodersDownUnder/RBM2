package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class GoldReinforcedStone extends CustomBlocks {

	public GoldReinforcedStone(String name) {
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(20f);
		this.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	
	
	@Override
	public GoldReinforcedStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2StoneTab);
		return this;
	}
}
