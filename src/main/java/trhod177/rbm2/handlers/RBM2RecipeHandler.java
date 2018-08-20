package trhod177.rbm2.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm2.init.BlockInit;
import trhod177.rbm2.init.ItemInit;
import trhod177.rbm2.handlers.RBM2CraftingHandler;

public class RBM2RecipeHandler {

	public static void registerCraftingBlocks() {
		
		
		
	}
	
	public static void registerCraftingItems() {
		
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.ironupgrade,8), new Object[] {"III","I I","III", 'I', Items.IRON_INGOT});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.goldupgrade,8), new Object[] {"GGG","G G","GGG", 'G', Items.GOLD_INGOT});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.diamondupgrade,8), new Object[] {"DDD","D D","DDD", 'D', Items.DIAMOND});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.emeraldupgrade,8), new Object[] {"EEE","E E","EEE", 'E', Items.EMERALD});
		RBM2CraftingHandler.addShapedRecipe(new ItemStack(ItemInit.obsidianupgrade,8), new Object[] {"OOO","O O","OOO", 'O', Blocks.OBSIDIAN});
		
	}
	
	
	public static void registerSmelting() {
		
	
	}
	
	
	
}