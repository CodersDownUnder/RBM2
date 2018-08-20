package trhod177.rbm2.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm2.References;
import trhod177.rbm2.blocks.IronReinforcedNetherrack;
import trhod177.rbm2.blocks.IronReinforcedStone;
import trhod177.rbm2.blocks.IronReinforcedTerracotta;
import trhod177.rbm2.blocks.IronReinforcedWood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;


public class BlockInit {
    //public static IronReinforcedStone iron = new IronReinforcedStone("iron").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	//public static blockclass blockname = new blockclass("blockname").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	//Iron Reinforced Blocks
	public static IronReinforcedWood ironoakplanks = new IronReinforcedWood("ironoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedWood ironbirchplanks = new IronReinforcedWood("ironbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedWood ironspruceplanks = new IronReinforcedWood("ironspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedWood ironjungleplanks = new IronReinforcedWood("ironjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedWood ironacaciaplanks = new IronReinforcedWood("ironacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedWood irondarkoakplanks = new IronReinforcedWood("irondarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironstone = new IronReinforcedStone("ironstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironandesite = new IronReinforcedStone("ironandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone irongranite = new IronReinforcedStone("irongranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone irondorite = new IronReinforcedStone("irondorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironpolishedandesite = new IronReinforcedStone("ironpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironpolishedgranite = new IronReinforcedStone("ironpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironpolisheddorite = new IronReinforcedStone("ironpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironcobble = new IronReinforcedStone("ironcobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironmossycobble = new IronReinforcedStone("ironmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironsandstone = new IronReinforcedStone("ironsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironbricks = new IronReinforcedStone("ironbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironendstone = new IronReinforcedStone("ironendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironendstonebrick = new IronReinforcedStone("ironendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironnetherbrick = new IronReinforcedStone("ironnetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedNetherrack ironnetherrack = new IronReinforcedNetherrack("ironnetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironpurpur = new IronReinforcedStone("ironpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironpurpurpillar = new IronReinforcedStone("ironpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironquartzblock = new IronReinforcedStone("ironquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironsandstonechiseled = new IronReinforcedStone("ironsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironsandstonesmooth = new IronReinforcedStone("ironsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironredsandstonechiseled = new IronReinforcedStone("ironredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironredsandstonesmooth = new IronReinforcedStone("ironredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironredsandstone = new IronReinforcedStone("ironredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironstonebrick = new IronReinforcedStone("ironstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironstonebrickcracked = new IronReinforcedStone("ironstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironstonebrickmossy = new IronReinforcedStone("ironstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedStone ironstonebrickchiseled = new IronReinforcedStone("ironstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracotta = new IronReinforcedTerracotta("ironterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottawhite = new IronReinforcedTerracotta("ironterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottaorange = new IronReinforcedTerracotta("ironterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottamagenta = new IronReinforcedTerracotta("ironterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottalightblue = new IronReinforcedTerracotta("ironterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottayellow = new IronReinforcedTerracotta("ironterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottalime = new IronReinforcedTerracotta("ironterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottapink = new IronReinforcedTerracotta("ironterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottagray = new IronReinforcedTerracotta("ironterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottalightgray = new IronReinforcedTerracotta("ironterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottacyan = new IronReinforcedTerracotta("ironterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottapurple = new IronReinforcedTerracotta("ironterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottablue = new IronReinforcedTerracotta("ironterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottabrown = new IronReinforcedTerracotta("ironterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottagreen = new IronReinforcedTerracotta("ironterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottared = new IronReinforcedTerracotta("ironterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static IronReinforcedTerracotta ironterracottablack = new IronReinforcedTerracotta("ironterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				//blockname
				ironterracotta,
				ironterracottawhite,
				ironterracottaorange,
				ironterracottamagenta,
				ironterracottalightblue,
				ironterracottayellow,
				ironterracottalime,
				ironterracottapink,
				ironterracottagray,
				ironterracottalightgray,
				ironterracottacyan,
				ironterracottapurple,
				ironterracottablue,
				ironterracottabrown,
				ironterracottagreen,
				ironterracottared,
				ironterracottablack,
	            ironoakplanks,
	            ironbirchplanks,
	            ironspruceplanks,
	            ironjungleplanks,
	            ironacaciaplanks,
	            irondarkoakplanks,
	            ironstone,
	        	ironandesite,
	        	irongranite,
	        	irondorite,
	            ironpolishedandesite,
	        	ironpolishedgranite,
	        	ironpolisheddorite,
	        	ironcobble,
	        	ironmossycobble,
	        	ironsandstone,
	            ironbricks,
	        	ironendstone,
	        	ironendstonebrick,
	        	ironnetherbrick,
	        	ironnetherrack,
	        	ironpurpur,
	        	ironpurpurpillar,
	        	ironquartzblock,
	        	ironsandstonechiseled,
	        	ironsandstonesmooth,
	        	ironredsandstonechiseled,
	        	ironredsandstonesmooth,
	        	ironredsandstone,
	        	ironstonebrick,
	        	ironstonebrickcracked,
	        	ironstonebrickmossy,
	        	ironstonebrickchiseled
				
				
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			//blockname.createItemBlock(),
				
				  ironoakplanks.createItemBlock(),
		          ironbirchplanks.createItemBlock(),
		          ironspruceplanks.createItemBlock(),
		          ironjungleplanks.createItemBlock(),
		          ironacaciaplanks.createItemBlock(),
		          irondarkoakplanks.createItemBlock(),
		          ironstone.createItemBlock(),
		          ironandesite.createItemBlock(),
		          irongranite.createItemBlock(),
		          irondorite.createItemBlock(),
		          ironpolishedandesite.createItemBlock(),
		          ironpolishedgranite.createItemBlock(),
		          ironpolisheddorite.createItemBlock(),
		          ironcobble.createItemBlock(),
		          ironmossycobble.createItemBlock(),
		          ironsandstone.createItemBlock(),
		          ironbricks.createItemBlock(),
		          ironendstone.createItemBlock(),
		          ironendstonebrick.createItemBlock(),
		          ironnetherbrick.createItemBlock(),
		          ironnetherrack.createItemBlock(),
		          ironpurpur.createItemBlock(),
		          ironpurpurpillar.createItemBlock(),
		          ironquartzblock.createItemBlock(),
		          ironsandstonechiseled.createItemBlock(),
		          ironsandstonesmooth.createItemBlock(),
		          ironredsandstonechiseled.createItemBlock(),
		          ironredsandstonesmooth.createItemBlock(),
		          ironredsandstone.createItemBlock(),
		          ironstonebrick.createItemBlock(),
		          ironstonebrickcracked.createItemBlock(),
		          ironstonebrickmossy.createItemBlock(),
		          ironstonebrickchiseled.createItemBlock(),
		          ironterracotta.createItemBlock(),
				  ironterracottawhite.createItemBlock(),
				  ironterracottaorange.createItemBlock(),
				  ironterracottamagenta.createItemBlock(),
				  ironterracottalightblue.createItemBlock(),
			      ironterracottayellow.createItemBlock(),
				  ironterracottalime.createItemBlock(),
				  ironterracottapink.createItemBlock(),
				  ironterracottagray.createItemBlock(),
			      ironterracottalightgray.createItemBlock(),
				  ironterracottacyan.createItemBlock(),
				  ironterracottapurple.createItemBlock(),
				  ironterracottablue.createItemBlock(),
				  ironterracottabrown.createItemBlock(),
				  ironterracottagreen.createItemBlock(),
				  ironterracottared.createItemBlock(),
			      ironterracottablack.createItemBlock()
				
				
				
			
		);
	
	}

	public static void registerModels() {
		
		//blockname.registerItemModel(Item.getItemFromBlock(blockname));
		
		  ironoakplanks.registerItemModel(Item.getItemFromBlock(ironoakplanks));
          ironbirchplanks.registerItemModel(Item.getItemFromBlock(ironbirchplanks));
          ironspruceplanks.registerItemModel(Item.getItemFromBlock(ironspruceplanks));
          ironjungleplanks.registerItemModel(Item.getItemFromBlock(ironjungleplanks));
          ironacaciaplanks.registerItemModel(Item.getItemFromBlock(ironacaciaplanks));
          irondarkoakplanks.registerItemModel(Item.getItemFromBlock(irondarkoakplanks));
          ironstone.registerItemModel(Item.getItemFromBlock(ironstone));
      	  ironandesite.registerItemModel(Item.getItemFromBlock(ironandesite));
      	  irongranite.registerItemModel(Item.getItemFromBlock(irongranite));
      	  irondorite.registerItemModel(Item.getItemFromBlock(irondorite));
          ironpolishedandesite.registerItemModel(Item.getItemFromBlock(ironpolishedandesite));
      	  ironpolishedgranite.registerItemModel(Item.getItemFromBlock(ironpolishedgranite));
      	  ironpolisheddorite.registerItemModel(Item.getItemFromBlock(ironpolisheddorite));
      	  ironcobble.registerItemModel(Item.getItemFromBlock(ironcobble));
      	  ironmossycobble.registerItemModel(Item.getItemFromBlock(ironmossycobble));
      	  ironsandstone.registerItemModel(Item.getItemFromBlock(ironsandstone));
          ironbricks.registerItemModel(Item.getItemFromBlock(ironbricks));
      	  ironendstone.registerItemModel(Item.getItemFromBlock(ironendstone));
      	  ironendstonebrick.registerItemModel(Item.getItemFromBlock(ironendstonebrick));
      	  ironnetherbrick.registerItemModel(Item.getItemFromBlock(ironnetherbrick));
      	  ironnetherrack.registerItemModel(Item.getItemFromBlock(ironnetherrack));
      	  ironpurpur.registerItemModel(Item.getItemFromBlock(ironpurpur));
      	  ironpurpurpillar.registerItemModel(Item.getItemFromBlock(ironpurpurpillar));
      	  ironquartzblock.registerItemModel(Item.getItemFromBlock(ironquartzblock));
      	  ironsandstonechiseled.registerItemModel(Item.getItemFromBlock(ironsandstonechiseled));
      	  ironsandstonesmooth.registerItemModel(Item.getItemFromBlock(ironsandstonesmooth));
      	  ironredsandstonechiseled.registerItemModel(Item.getItemFromBlock(ironredsandstonechiseled));
      	  ironredsandstonesmooth.registerItemModel(Item.getItemFromBlock(ironredsandstonesmooth));
      	  ironredsandstone.registerItemModel(Item.getItemFromBlock(ironredsandstone));
      	  ironstonebrick.registerItemModel(Item.getItemFromBlock(ironstonebrick));
      	  ironstonebrickcracked.registerItemModel(Item.getItemFromBlock(ironstonebrickcracked));
      	  ironstonebrickmossy.registerItemModel(Item.getItemFromBlock(ironstonebrickmossy));
      	  ironstonebrickchiseled.registerItemModel(Item.getItemFromBlock(ironstonebrickchiseled));
      	  ironterracotta.registerItemModel(Item.getItemFromBlock(ironterracotta));
		  ironterracottawhite.registerItemModel(Item.getItemFromBlock(ironterracottawhite));
		  ironterracottaorange.registerItemModel(Item.getItemFromBlock(ironterracottaorange));
		  ironterracottamagenta.registerItemModel(Item.getItemFromBlock(ironterracottamagenta));
		  ironterracottalightblue.registerItemModel(Item.getItemFromBlock(ironterracottalightblue));
		  ironterracottayellow.registerItemModel(Item.getItemFromBlock(ironterracottayellow));
		  ironterracottalime.registerItemModel(Item.getItemFromBlock(ironterracottalime));
		  ironterracottapink.registerItemModel(Item.getItemFromBlock(ironterracottapink));
		  ironterracottagray.registerItemModel(Item.getItemFromBlock(ironterracottagray));
		  ironterracottalightgray.registerItemModel(Item.getItemFromBlock(ironterracottalightgray));
		  ironterracottacyan.registerItemModel(Item.getItemFromBlock(ironterracottacyan));
		  ironterracottapurple.registerItemModel(Item.getItemFromBlock(ironterracottapurple));
		  ironterracottablue.registerItemModel(Item.getItemFromBlock(ironterracottablue));
		  ironterracottabrown.registerItemModel(Item.getItemFromBlock(ironterracottabrown));
		  ironterracottagreen.registerItemModel(Item.getItemFromBlock(ironterracottagreen));
		  ironterracottared.registerItemModel(Item.getItemFromBlock(ironterracottared));
		  ironterracottablack.registerItemModel(Item.getItemFromBlock(ironterracottablack));
	
		
		
	}

}
