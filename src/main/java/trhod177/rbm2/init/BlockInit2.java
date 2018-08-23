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
import trhod177.rbm2.blocks.GoldReinforcedNetherrack;
import trhod177.rbm2.blocks.GoldReinforcedStone;
import trhod177.rbm2.blocks.GoldReinforcedTerracotta;
import trhod177.rbm2.blocks.GoldReinforcedWood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;


public class BlockInit2 {
    //public static GoldReinforcedStone gold = new GoldReinforcedStone("gold").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	//public static blockclass blockname = new blockclass("blockname").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	//Gold Reinforced Blocks
	public static GoldReinforcedWood goldoakplanks = new GoldReinforcedWood("goldoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedWood goldbirchplanks = new GoldReinforcedWood("goldbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedWood goldspruceplanks = new GoldReinforcedWood("goldspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedWood goldjungleplanks = new GoldReinforcedWood("goldjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedWood goldacaciaplanks = new GoldReinforcedWood("goldacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedWood golddarkoakplanks = new GoldReinforcedWood("golddarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldstone = new GoldReinforcedStone("goldstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldandesite = new GoldReinforcedStone("goldandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldgranite = new GoldReinforcedStone("goldgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone golddorite = new GoldReinforcedStone("golddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldpolishedandesite = new GoldReinforcedStone("goldpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldpolishedgranite = new GoldReinforcedStone("goldpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldpolisheddorite = new GoldReinforcedStone("goldpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldcobble = new GoldReinforcedStone("goldcobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldmossycobble = new GoldReinforcedStone("goldmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldsandstone = new GoldReinforcedStone("goldsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldbricks = new GoldReinforcedStone("goldbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldendstone = new GoldReinforcedStone("goldendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldendstonebrick = new GoldReinforcedStone("goldendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldnetherbrick = new GoldReinforcedStone("goldnetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedNetherrack goldnetherrack = new GoldReinforcedNetherrack("goldnetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldpurpur = new GoldReinforcedStone("goldpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldpurpurpillar = new GoldReinforcedStone("goldpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldquartzblock = new GoldReinforcedStone("goldquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldsandstonechiseled = new GoldReinforcedStone("goldsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldsandstonesmooth = new GoldReinforcedStone("goldsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldredsandstonechiseled = new GoldReinforcedStone("goldredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldredsandstonesmooth = new GoldReinforcedStone("goldredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldredsandstone = new GoldReinforcedStone("goldredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldstonebrick = new GoldReinforcedStone("goldstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldstonebrickcracked = new GoldReinforcedStone("goldstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldstonebrickmossy = new GoldReinforcedStone("goldstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedStone goldstonebrickchiseled = new GoldReinforcedStone("goldstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracotta = new GoldReinforcedTerracotta("goldterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottawhite = new GoldReinforcedTerracotta("goldterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottaorange = new GoldReinforcedTerracotta("goldterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottamagenta = new GoldReinforcedTerracotta("goldterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottalightblue = new GoldReinforcedTerracotta("goldterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottayellow = new GoldReinforcedTerracotta("goldterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottalime = new GoldReinforcedTerracotta("goldterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottapink = new GoldReinforcedTerracotta("goldterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottagray = new GoldReinforcedTerracotta("goldterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottalightgray = new GoldReinforcedTerracotta("goldterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottacyan = new GoldReinforcedTerracotta("goldterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottapurple = new GoldReinforcedTerracotta("goldterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottablue = new GoldReinforcedTerracotta("goldterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottabrown = new GoldReinforcedTerracotta("goldterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottagreen = new GoldReinforcedTerracotta("goldterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottared = new GoldReinforcedTerracotta("goldterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static GoldReinforcedTerracotta goldterracottablack = new GoldReinforcedTerracotta("goldterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				//blockname
				goldterracotta,
				goldterracottawhite,
				goldterracottaorange,
				goldterracottamagenta,
				goldterracottalightblue,
				goldterracottayellow,
				goldterracottalime,
				goldterracottapink,
				goldterracottagray,
				goldterracottalightgray,
				goldterracottacyan,
				goldterracottapurple,
				goldterracottablue,
				goldterracottabrown,
				goldterracottagreen,
				goldterracottared,
				goldterracottablack,
	            goldoakplanks,
	            goldbirchplanks,
	            goldspruceplanks,
	            goldjungleplanks,
	            goldacaciaplanks,
	            golddarkoakplanks,
	            goldstone,
	        	goldandesite,
	        	goldgranite,
	        	golddorite,
	            goldpolishedandesite,
	        	goldpolishedgranite,
	        	goldpolisheddorite,
	        	goldcobble,
	        	goldmossycobble,
	        	goldsandstone,
	            goldbricks,
	        	goldendstone,
	        	goldendstonebrick,
	        	goldnetherbrick,
	        	goldnetherrack,
	        	goldpurpur,
	        	goldpurpurpillar,
	        	goldquartzblock,
	        	goldsandstonechiseled,
	        	goldsandstonesmooth,
	        	goldredsandstonechiseled,
	        	goldredsandstonesmooth,
	        	goldredsandstone,
	        	goldstonebrick,
	        	goldstonebrickcracked,
	        	goldstonebrickmossy,
	        	goldstonebrickchiseled
				
				
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			//blockname.createItemBlock(),
				
				  goldoakplanks.createItemBlock(),
		          goldbirchplanks.createItemBlock(),
		          goldspruceplanks.createItemBlock(),
		          goldjungleplanks.createItemBlock(),
		          goldacaciaplanks.createItemBlock(),
		          golddarkoakplanks.createItemBlock(),
		          goldstone.createItemBlock(),
		          goldandesite.createItemBlock(),
		          goldgranite.createItemBlock(),
		          golddorite.createItemBlock(),
		          goldpolishedandesite.createItemBlock(),
		          goldpolishedgranite.createItemBlock(),
		          goldpolisheddorite.createItemBlock(),
		          goldcobble.createItemBlock(),
		          goldmossycobble.createItemBlock(),
		          goldsandstone.createItemBlock(),
		          goldbricks.createItemBlock(),
		          goldendstone.createItemBlock(),
		          goldendstonebrick.createItemBlock(),
		          goldnetherbrick.createItemBlock(),
		          goldnetherrack.createItemBlock(),
		          goldpurpur.createItemBlock(),
		          goldpurpurpillar.createItemBlock(),
		          goldquartzblock.createItemBlock(),
		          goldsandstonechiseled.createItemBlock(),
		          goldsandstonesmooth.createItemBlock(),
		          goldredsandstonechiseled.createItemBlock(),
		          goldredsandstonesmooth.createItemBlock(),
		          goldredsandstone.createItemBlock(),
		          goldstonebrick.createItemBlock(),
		          goldstonebrickcracked.createItemBlock(),
		          goldstonebrickmossy.createItemBlock(),
		          goldstonebrickchiseled.createItemBlock(),
		          goldterracotta.createItemBlock(),
				  goldterracottawhite.createItemBlock(),
				  goldterracottaorange.createItemBlock(),
				  goldterracottamagenta.createItemBlock(),
				  goldterracottalightblue.createItemBlock(),
			      goldterracottayellow.createItemBlock(),
				  goldterracottalime.createItemBlock(),
				  goldterracottapink.createItemBlock(),
				  goldterracottagray.createItemBlock(),
			      goldterracottalightgray.createItemBlock(),
				  goldterracottacyan.createItemBlock(),
				  goldterracottapurple.createItemBlock(),
				  goldterracottablue.createItemBlock(),
				  goldterracottabrown.createItemBlock(),
				  goldterracottagreen.createItemBlock(),
				  goldterracottared.createItemBlock(),
			      goldterracottablack.createItemBlock()
				
				
				
			
		);
	
	}

	public static void registerModels() {
		
		//blockname.registerItemModel(Item.getItemFromBlock(blockname));
		
		  goldoakplanks.registerItemModel(Item.getItemFromBlock(goldoakplanks));
          goldbirchplanks.registerItemModel(Item.getItemFromBlock(goldbirchplanks));
          goldspruceplanks.registerItemModel(Item.getItemFromBlock(goldspruceplanks));
          goldjungleplanks.registerItemModel(Item.getItemFromBlock(goldjungleplanks));
          goldacaciaplanks.registerItemModel(Item.getItemFromBlock(goldacaciaplanks));
          golddarkoakplanks.registerItemModel(Item.getItemFromBlock(golddarkoakplanks));
          goldstone.registerItemModel(Item.getItemFromBlock(goldstone));
      	  goldandesite.registerItemModel(Item.getItemFromBlock(goldandesite));
      	  goldgranite.registerItemModel(Item.getItemFromBlock(goldgranite));
      	  golddorite.registerItemModel(Item.getItemFromBlock(golddorite));
          goldpolishedandesite.registerItemModel(Item.getItemFromBlock(goldpolishedandesite));
      	  goldpolishedgranite.registerItemModel(Item.getItemFromBlock(goldpolishedgranite));
      	  goldpolisheddorite.registerItemModel(Item.getItemFromBlock(goldpolisheddorite));
      	  goldcobble.registerItemModel(Item.getItemFromBlock(goldcobble));
      	  goldmossycobble.registerItemModel(Item.getItemFromBlock(goldmossycobble));
      	  goldsandstone.registerItemModel(Item.getItemFromBlock(goldsandstone));
          goldbricks.registerItemModel(Item.getItemFromBlock(goldbricks));
      	  goldendstone.registerItemModel(Item.getItemFromBlock(goldendstone));
      	  goldendstonebrick.registerItemModel(Item.getItemFromBlock(goldendstonebrick));
      	  goldnetherbrick.registerItemModel(Item.getItemFromBlock(goldnetherbrick));
      	  goldnetherrack.registerItemModel(Item.getItemFromBlock(goldnetherrack));
      	  goldpurpur.registerItemModel(Item.getItemFromBlock(goldpurpur));
      	  goldpurpurpillar.registerItemModel(Item.getItemFromBlock(goldpurpurpillar));
      	  goldquartzblock.registerItemModel(Item.getItemFromBlock(goldquartzblock));
      	  goldsandstonechiseled.registerItemModel(Item.getItemFromBlock(goldsandstonechiseled));
      	  goldsandstonesmooth.registerItemModel(Item.getItemFromBlock(goldsandstonesmooth));
      	  goldredsandstonechiseled.registerItemModel(Item.getItemFromBlock(goldredsandstonechiseled));
      	  goldredsandstonesmooth.registerItemModel(Item.getItemFromBlock(goldredsandstonesmooth));
      	  goldredsandstone.registerItemModel(Item.getItemFromBlock(goldredsandstone));
      	  goldstonebrick.registerItemModel(Item.getItemFromBlock(goldstonebrick));
      	  goldstonebrickcracked.registerItemModel(Item.getItemFromBlock(goldstonebrickcracked));
      	  goldstonebrickmossy.registerItemModel(Item.getItemFromBlock(goldstonebrickmossy));
      	  goldstonebrickchiseled.registerItemModel(Item.getItemFromBlock(goldstonebrickchiseled));
      	  goldterracotta.registerItemModel(Item.getItemFromBlock(goldterracotta));
		  goldterracottawhite.registerItemModel(Item.getItemFromBlock(goldterracottawhite));
		  goldterracottaorange.registerItemModel(Item.getItemFromBlock(goldterracottaorange));
		  goldterracottamagenta.registerItemModel(Item.getItemFromBlock(goldterracottamagenta));
		  goldterracottalightblue.registerItemModel(Item.getItemFromBlock(goldterracottalightblue));
		  goldterracottayellow.registerItemModel(Item.getItemFromBlock(goldterracottayellow));
		  goldterracottalime.registerItemModel(Item.getItemFromBlock(goldterracottalime));
		  goldterracottapink.registerItemModel(Item.getItemFromBlock(goldterracottapink));
		  goldterracottagray.registerItemModel(Item.getItemFromBlock(goldterracottagray));
		  goldterracottalightgray.registerItemModel(Item.getItemFromBlock(goldterracottalightgray));
		  goldterracottacyan.registerItemModel(Item.getItemFromBlock(goldterracottacyan));
		  goldterracottapurple.registerItemModel(Item.getItemFromBlock(goldterracottapurple));
		  goldterracottablue.registerItemModel(Item.getItemFromBlock(goldterracottablue));
		  goldterracottabrown.registerItemModel(Item.getItemFromBlock(goldterracottabrown));
		  goldterracottagreen.registerItemModel(Item.getItemFromBlock(goldterracottagreen));
		  goldterracottared.registerItemModel(Item.getItemFromBlock(goldterracottared));
		  goldterracottablack.registerItemModel(Item.getItemFromBlock(goldterracottablack));
	
		
		
	}

}
