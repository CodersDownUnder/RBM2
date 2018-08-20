package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import trhod177.rbm2.ReinforcedBlocksMod2;
import trhod177.rbm2.init.BlockInit;

public class IronReinforcedNetherrack extends CustomBlocks {

	public IronReinforcedNetherrack(String name) {
		super(Material.ROCK, name);
		setHardness(5f);
		setResistance(60f);
		this.setHarvestLevel("pickaxe", 2);
        
		
	}
	
	
	
	@Override
	public IronReinforcedNetherrack setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
	
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
    {
        if (side != EnumFacing.UP)
            return false;
        if (this == BlockInit.ironnetherrack)
            return true;
        if ((world.provider instanceof net.minecraft.world.WorldProviderEnd) && this == Blocks.BEDROCK)
            return true;
        return false;
    }

}

