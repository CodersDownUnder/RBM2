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
	    
	    //ironreinforcedblocks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironpolishedandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,6), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,5), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironpolisheddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,4), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.irondorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,3), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironpolishedgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,2), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.irongranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,1), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,0), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.COBBLESTONE), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironmossycobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.MOSSY_COBBLESTONE, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.COBBLESTONE, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.SANDSTONE, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,1), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,2), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironredsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironredsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,1), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironredsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,2), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironbricks, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.BRICK_BLOCK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironendstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_STONE, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironendstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_BRICKS, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironnetherrack, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHERRACK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironnetherbrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHER_BRICK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironpurpur, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_BLOCK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironpurpurpillar, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_PILLAR, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironquartzblock, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.QUARTZ_BLOCK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.STONEBRICK, 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironstonebrickmossy, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,1), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironstonebrickcracked, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,2), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironstonebrickchiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,3), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracotta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,0), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottaorange, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottamagenta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,2), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottalightblue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,3), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottayellow, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,4), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottalime, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,5), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottapink, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,6), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottagray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,7), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottalightgray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,8), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottacyan, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,9), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottapurple, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,10), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottablue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,11), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottabrown, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,12), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottagreen, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,13), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottared, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,14), 'U', ItemInit.ironupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.ironterracottablack, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,15), 'U', ItemInit.ironupgrade});
	    
	    
	    //goldreinforcedblocks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldpolishedandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,6), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,5), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldpolisheddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,4), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.golddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,3), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldpolishedgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,2), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,1), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,0), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.COBBLESTONE), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldmossycobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.MOSSY_COBBLESTONE, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.COBBLESTONE, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.SANDSTONE, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,1), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,2), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldredsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldredsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,1), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldredsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,2), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldbricks, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.BRICK_BLOCK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldendstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_STONE, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldendstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_BRICKS, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldnetherrack, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHERRACK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldnetherbrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHER_BRICK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldpurpur, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_BLOCK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldpurpurpillar, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_PILLAR, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldquartzblock, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.QUARTZ_BLOCK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.STONEBRICK, 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldstonebrickmossy, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,1), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldstonebrickcracked, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,2), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldstonebrickchiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,3), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracotta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,0), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottaorange, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottamagenta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,2), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottalightblue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,3), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottayellow, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,4), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottalime, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,5), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottapink, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,6), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottagray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,7), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottalightgray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,8), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottacyan, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,9), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottapurple, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,10), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottablue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,11), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottabrown, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,12), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottagreen, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,13), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottared, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,14), 'U', ItemInit.goldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.goldterracottablack, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,15), 'U', ItemInit.goldupgrade});
	    
	    
	    //diamondreinforcedblocks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondpolishedandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,6), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,5), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondpolisheddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,4), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamonddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,3), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondpolishedgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,2), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,1), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,0), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.COBBLESTONE), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondmossycobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.MOSSY_COBBLESTONE, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.COBBLESTONE, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.SANDSTONE, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,1), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,2), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondredsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondredsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,1), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondredsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,2), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondbricks, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.BRICK_BLOCK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondendstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_STONE, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondendstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_BRICKS, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondnetherrack, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHERRACK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondnetherbrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHER_BRICK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondpurpur, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_BLOCK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondpurpurpillar, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_PILLAR, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondquartzblock, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.QUARTZ_BLOCK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.STONEBRICK, 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondstonebrickmossy, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,1), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondstonebrickcracked, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,2), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondstonebrickchiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,3), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracotta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,0), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottaorange, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottamagenta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,2), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottalightblue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,3), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottayellow, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,4), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottalime, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,5), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottapink, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,6), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottagray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,7), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottalightgray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,8), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottacyan, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,9), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottapurple, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,10), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottablue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,11), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottabrown, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,12), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottagreen, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,13), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottared, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,14), 'U', ItemInit.diamondupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.diamondterracottablack, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,15), 'U', ItemInit.diamondupgrade});
	    
	    
	    //emeraldreinforcedblocks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldpolishedandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,6), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,5), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldpolisheddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,4), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeralddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,3), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldpolishedgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,2), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,1), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,0), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.COBBLESTONE), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldmossycobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.MOSSY_COBBLESTONE, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldcobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.COBBLESTONE, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.SANDSTONE, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,1), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,2), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldredsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldredsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,1), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldredsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,2), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldbricks, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.BRICK_BLOCK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldendstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_STONE, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldendstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_BRICKS, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldnetherrack, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHERRACK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldnetherbrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHER_BRICK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldpurpur, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_BLOCK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldpurpurpillar, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_PILLAR, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldquartzblock, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.QUARTZ_BLOCK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.STONEBRICK, 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldstonebrickmossy, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,1), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldstonebrickcracked, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,2), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldstonebrickchiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,3), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracotta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,0), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottaorange, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottamagenta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,2), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottalightblue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,3), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottayellow, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,4), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottalime, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,5), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottapink, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,6), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottagray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,7), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottalightgray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,8), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottacyan, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,9), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottapurple, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,10), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottablue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,11), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottabrown, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,12), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottagreen, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,13), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottared, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,14), 'U', ItemInit.emeraldupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.emeraldterracottablack, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,15), 'U', ItemInit.emeraldupgrade});
	    
	    
	    //obsidianreinforcedblocks
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianpolishedandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,6), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianandesite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,5), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianpolisheddorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,4), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiandorite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,3), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianpolishedgranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,2), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiangranite, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,1), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONE,0), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiancobble, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.COBBLESTONE), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianmossycobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.MOSSY_COBBLESTONE, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiancobble, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.COBBLESTONE, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiansandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.SANDSTONE, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiansandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,1), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiansandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.SANDSTONE,2), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianredsandstone, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianredsandstonechiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,1), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianredsandstonesmooth, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.RED_SANDSTONE,2), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianbricks, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.BRICK_BLOCK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianendstone, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_STONE, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianendstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.END_BRICKS, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiannetherrack, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHERRACK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidiannetherbrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.NETHER_BRICK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianpurpur, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_BLOCK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianpurpurpillar, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.PURPUR_PILLAR, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianquartzblock, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.QUARTZ_BLOCK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianstonebrick, 8), new Object[] {"AAA","AUA","AAA", 'A', Blocks.STONEBRICK, 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianstonebrickmossy, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,1), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianstonebrickcracked, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,2), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianstonebrickchiseled, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STONEBRICK,3), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracotta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,0), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottaorange, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottamagenta, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,2), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottalightblue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,3), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottayellow, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,4), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottalime, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,5), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottapink, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,6), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottagray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,7), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottalightgray, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,8), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottacyan, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,9), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottapurple, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,10), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottablue, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,11), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottabrown, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,12), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottagreen, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,13), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottared, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,14), 'U', ItemInit.obsidianupgrade});
	    RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.obsidianterracottablack, 8), new Object[] {"AAA","AUA","AAA", 'A', new ItemStack(Blocks.STAINED_HARDENED_CLAY,15), 'U', ItemInit.obsidianupgrade});
	    
		
	    //Reinforced Iron
            RBM2CraftingHandler.addShapedRecipe(new ItemStack(BlockInit.reinforcedironblock, 8), new Object[] ("III","IBI","III", 'I', Items.IRON_INGOT
		
	       
	    
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
