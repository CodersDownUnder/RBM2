package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class IronReinforcedWood extends CustomBlocks {

	public IronReinforcedWood(String name) {
		super(Material.WOOD, name);
		setHardness(5f);
		setResistance(30f);
		this.setHarvestLevel("axe", 1);
		
		
	}
	
	
	
	@Override
	public IronReinforcedWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2WoodTab);
		return this;
	}
}
