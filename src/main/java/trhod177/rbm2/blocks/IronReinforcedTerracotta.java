package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class IronReinforcedTerracotta extends CustomBlocks {

	public IronReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(5f);
		setResistance(30f);
		this.setHarvestLevel("pickaxe", 1);
		
		
	}
	
	
	
	@Override
	public IronReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
	
	
}
