package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class EmeraldReinforcedWood extends CustomBlocks {

	public EmeraldReinforcedWood(String name) {
		super(Material.WOOD, name);
		setHardness(3f);
		setResistance(20f);
		this.setHarvestLevel("axe", 2);
		
		
	}
	
	
	
	@Override
	public EmeraldReinforcedWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2WoodTab);
		return this;
	}
}
