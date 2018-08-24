package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class ObsidianReinforcedWood extends CustomBlocks {

	public ObsidianReinforcedWood(String name) {
		super(Material.WOOD, name);
		setHardness(3f);
		setResistance(20f);
		this.setHarvestLevel("axe", 2);
		
		
	}
	
	
	
	@Override
	public ObsidianReinforcedWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2WoodTab);
		return this;
	}
}
