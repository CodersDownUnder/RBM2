package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import trhod177.rbm2.ReinforcedBlocksMod2;
import trhod177.rbm2.init.BlockInit;

public class BedrockReinforcedNetherrack extends CustomBlocks {

	public BedrockReinforcedNetherrack(String name) {
		super(Material.ROCK, name);
		setHardness(-1f);
		setResistance(18000000f);
		
		
	}
	
	@Override
	public BedrockReinforcedNetherrack setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2StoneTab);
		return this;
	}
	
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
    {
        if (side != EnumFacing.UP)
            return false;
        if (this == BlockInit.bedrocknetherrack)
            return true;
        return false;
    }

}

