package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class ObsidianReinforcedStone extends CustomBlocks {

	public ObsidianReinforcedStone(String name) {
		super(Material.ROCK, name);
		setHardness(35f);
		setResistance(6000f);
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	
	
	
	@Override
	public ObsidianReinforcedStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2StoneTab);
		return this;
	}
}
