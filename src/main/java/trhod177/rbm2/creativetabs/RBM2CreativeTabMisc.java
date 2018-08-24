package trhod177.rbm2.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm2.init.BlockInit;
import trhod177.rbm2.init.ItemInit;

public class RBM2CreativeTabMisc extends CreativeTabs {


	public RBM2CreativeTabMisc(String label) {
		super("RBM2MiscTab");
		this.setBackgroundImageName("rbmt.png");
		
	}
	
	
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.reinforcedironblock);
		
	}
}
