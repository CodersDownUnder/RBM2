package trhod177.rbm2.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm2.init.BlockInit;

public class RBM2CreativeTabStone extends CreativeTabs {

	
	public RBM2CreativeTabStone(String label) {
		super("RBM2StoneTab");
		this.setBackgroundImageName("tabsearch.png");
		
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.ironstone));
		
	}
}