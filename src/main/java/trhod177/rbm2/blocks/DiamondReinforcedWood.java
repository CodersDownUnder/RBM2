package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class DiamondReinforcedWood extends CustomBlocks {

	public DiamondReinforcedWood(String name) {
		super(Material.WOOD, name);
		setHardness(5f);
		setResistance(40f);
		this.setHarvestLevel("axe", 2);
		
		
	}
	
	
	
	@Override
	public DiamondReinforcedWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2WoodTab);
		return this;
	}
}
