package trhod177.rbm2.init;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm2.ReinforcedBlocksMod2;
import trhod177.rbm2.items.ItemBase;
import trhod177.rbm2.items.ItemBedrockUpgrade;
import trhod177.rbm2.items.ItemDiamondUpgrade;
import trhod177.rbm2.items.ItemEmeraldUpgrade;
import trhod177.rbm2.items.ItemGoldUpgrade;
import trhod177.rbm2.items.ItemIronUpgrade;
import trhod177.rbm2.items.ItemObsidianUpgrade;


public class ItemInit {
	
	//public static itemclass itemname = new itemclass("itemname").setCreativeTab(creativetab);
	  
	 public static ItemIronUpgrade ironupgrade = new ItemIronUpgrade("ironupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 public static ItemGoldUpgrade goldupgrade = new ItemGoldUpgrade("goldupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 public static ItemDiamondUpgrade diamondupgrade = new ItemDiamondUpgrade("diamondupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 public static ItemEmeraldUpgrade emeraldupgrade = new ItemEmeraldUpgrade("emeraldupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 public static ItemObsidianUpgrade obsidianupgrade = new ItemObsidianUpgrade("obsidianupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 public static ItemBedrockUpgrade bedrockupgrade = new ItemBedrockUpgrade("bedrockupgrade").setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
	 
	
	
	public static void register(IForgeRegistry<Item> registry) {
	  registry.registerAll(
          //itemname
			ironupgrade,
	        goldupgrade,
	        diamondupgrade,
	        emeraldupgrade,
	        obsidianupgrade,
	        bedrockupgrade
	        
		  
			  );
	  
	
	}
	
	public static void registerModels() {
	    //itemname.registerItemModel();
		
		ironupgrade.registerItemModel();
		goldupgrade.registerItemModel();
	    diamondupgrade.registerItemModel();
	    emeraldupgrade.registerItemModel();
	    obsidianupgrade.registerItemModel();
	    bedrockupgrade.registerItemModel();
		
	}

}

