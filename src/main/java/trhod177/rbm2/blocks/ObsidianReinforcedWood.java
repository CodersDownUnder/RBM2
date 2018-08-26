package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class ObsidianReinforcedWood extends CustomBlocks {

	public ObsidianReinforcedWood(String name) {
		super(Material.WOOD, name);
		setHardness(35f);
		setResistance(6000f);
		this.setHarvestLevel("axe", 3);
		
		
	}
	
	
	
	@Override
	public ObsidianReinforcedWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2WoodTab);
		return this;
	}
}
