package trhod177.rbm2.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm2.init.BlockInit;
import trhod177.rbm2.init.ItemInit;
import trhod177.rbm2.handlers.RBM2CraftingHandler;

public class RBM2RecipeHandler {

	public static void registerCraftingBlocks() {
		
		//oakplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironoakplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', Blocks.PLANKS, 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldoakplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', Blocks.PLANKS, 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondoakplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', Blocks.PLANKS, 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldoakplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', Blocks.PLANKS, 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianoakplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', Blocks.PLANKS, 'B', ItemInit.obsidianupgrade});
	    
	    //birchplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironbirchplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', new ItemStack(Blocks.PLANKS,2), 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldbirchplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', new ItemStack(Blocks.PLANKS,2), 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondbirchplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', new ItemStack(Blocks.PLANKS,2), 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldbirchplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', new ItemStack(Blocks.PLANKS,2), 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianbirchplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', new ItemStack(Blocks.PLANKS,2), 'B', ItemInit.obsidianupgrade});
	
	    //spruceplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironspruceplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', new ItemStack(Blocks.PLANKS,1), 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldspruceplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', new ItemStack(Blocks.PLANKS,1), 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondspruceplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', new ItemStack(Blocks.PLANKS,1), 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldspruceplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', new ItemStack(Blocks.PLANKS,1), 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianspruceplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', new ItemStack(Blocks.PLANKS,1), 'B', ItemInit.obsidianupgrade});
	    
	    //jungleplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironjungleplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', new ItemStack(Blocks.PLANKS,3), 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldjungleplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', new ItemStack(Blocks.PLANKS,3), 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondjungleplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', new ItemStack(Blocks.PLANKS,3), 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldjungleplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', new ItemStack(Blocks.PLANKS,3), 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianjungleplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', new ItemStack(Blocks.PLANKS,3), 'B', ItemInit.obsidianupgrade});
	    
	    //acaciaplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironacaciaplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', new ItemStack(Blocks.PLANKS,4), 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldacaciaplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', new ItemStack(Blocks.PLANKS,4), 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondacaciaplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', new ItemStack(Blocks.PLANKS,4), 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldacaciaplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', new ItemStack(Blocks.PLANKS,4), 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianacaciaplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', new ItemStack(Blocks.PLANKS,4), 'B', ItemInit.obsidianupgrade});

	    //darkoakplanks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.irondarkoakplanks, 8), new Object[] {"OOO","OIO","OOO", 'O', new ItemStack(Blocks.PLANKS,5), 'I', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.golddarkoakplanks, 8), new Object[] {"OOO","OGO","OOO", 'O', new ItemStack(Blocks.PLANKS,5), 'G', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamonddarkoakplanks, 8), new Object[] {"OOO","ODO","OOO", 'O', new ItemStack(Blocks.PLANKS,5), 'D', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeralddarkoakplanks, 8), new Object[] {"OOO","OEO","OOO", 'O', new ItemStack(Blocks.PLANKS,5), 'E', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiandarkoakplanks, 8), new Object[] {"OOO","OBO","OOO", 'O', new ItemStack(Blocks.PLANKS,5), 'B', ItemInit.obsidianupgrade});
	}
	public static void registerCraftingItems() {
		
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.upgradebase,16), new Object[] {" C ","CWC"," C ", 'C', Blocks.COBBLESTONE, 'W',  new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE)});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.ironupgrade,8), new Object[] {"III","IUI","III", 'I', Items.IRON_INGOT, 'U', ItemInit.upgradebase});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.goldupgrade,8), new Object[] {"GGG","GUG","GGG", 'G', Items.GOLD_INGOT, 'U', ItemInit.upgradebase});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.diamondupgrade,8), new Object[] {" D ","DUD"," D ", 'D', Items.DIAMOND, 'U', ItemInit.upgradebase});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.emeraldupgrade,8), new Object[] {" E ","EUE"," E ", 'E', Items.EMERALD, 'U', ItemInit.upgradebase});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.obsidianupgrade,8), new Object[] {"OOO","OUO","OOO", 'O', Blocks.OBSIDIAN, 'U', ItemInit.upgradebase});
		
	}
	
	
	public static void registerSmelting() {
		
	
	}
	
	
	
}