package trhod177.rbm2.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm2.init.BlockInit;

public class RBM2CreativeTabWood extends CreativeTabs {

	
	public RBM2CreativeTabWood(String label) {
		super("RBM2WoodTab");
		this.setBackgroundImageName("tabsearch.png");
		
		
		
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.ironoakplanks));
		
	}
}