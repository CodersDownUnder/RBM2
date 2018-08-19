package trhod177.rbm2.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm2.init.BlockInit;
import trhod177.rbm2.init.ItemInit;

public class RBM2CreativeTabItems extends CreativeTabs {


	public RBM2CreativeTabItems(String label) {
		super("RBM2ItemTab");
		this.setBackgroundImageName("tabsearch.png");
		
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ironupgrade);
		
	}
}
