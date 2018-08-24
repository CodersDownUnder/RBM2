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
import trhod177.rbm2.blocks.BedrockReinforcedNetherrack;
import trhod177.rbm2.blocks.BedrockReinforcedStone;
import trhod177.rbm2.blocks.BedrockReinforcedTerracotta;
import trhod177.rbm2.blocks.BedrockReinforcedWood;
import trhod177.rbm2.blocks.DiamondReinforcedNetherrack;
import trhod177.rbm2.blocks.DiamondReinforcedStone;
import trhod177.rbm2.blocks.DiamondReinforcedTerracotta;
import trhod177.rbm2.blocks.DiamondReinforcedWood;
import trhod177.rbm2.blocks.EmeraldReinforcedNetherrack;
import trhod177.rbm2.blocks.EmeraldReinforcedStone;
import trhod177.rbm2.blocks.EmeraldReinforcedTerracotta;
import trhod177.rbm2.blocks.EmeraldReinforcedWood;
import trhod177.rbm2.blocks.GoldReinforcedNetherrack;
import trhod177.rbm2.blocks.GoldReinforcedStone;
import trhod177.rbm2.blocks.GoldReinforcedTerracotta;
import trhod177.rbm2.blocks.GoldReinforcedWood;
import trhod177.rbm2.blocks.IronReinforcedNetherrack;
import trhod177.rbm2.blocks.IronReinforcedStone;
import trhod177.rbm2.blocks.IronReinforcedTerracotta;
import trhod177.rbm2.blocks.IronReinforcedWood;
import trhod177.rbm2.blocks.ObsidianReinforcedNetherrack;
import trhod177.rbm2.blocks.ObsidianReinforcedStone;
import trhod177.rbm2.blocks.ObsidianReinforcedTerracotta;
import trhod177.rbm2.blocks.ObsidianReinforcedWood;
import trhod177.rbm2.blocks.ReinforcedIron;
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
	
	
	//diamond reinforced blocks
	public static DiamondReinforcedWood diamondoakplanks = new DiamondReinforcedWood("diamondoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedWood diamondbirchplanks = new DiamondReinforcedWood("diamondbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedWood diamondspruceplanks = new DiamondReinforcedWood("diamondspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedWood diamondjungleplanks = new DiamondReinforcedWood("diamondjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedWood diamondacaciaplanks = new DiamondReinforcedWood("diamondacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedWood diamonddarkoakplanks = new DiamondReinforcedWood("diamonddarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondstone = new DiamondReinforcedStone("diamondstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondandesite = new DiamondReinforcedStone("diamondandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondgranite = new DiamondReinforcedStone("diamondgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamonddorite = new DiamondReinforcedStone("diamonddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondpolishedandesite = new DiamondReinforcedStone("diamondpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondpolishedgranite = new DiamondReinforcedStone("diamondpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondpolisheddorite = new DiamondReinforcedStone("diamondpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondcobble = new DiamondReinforcedStone("diamondcobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondmossycobble = new DiamondReinforcedStone("diamondmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondsandstone = new DiamondReinforcedStone("diamondsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondbricks = new DiamondReinforcedStone("diamondbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondendstone = new DiamondReinforcedStone("diamondendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondendstonebrick = new DiamondReinforcedStone("diamondendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondnetherbrick = new DiamondReinforcedStone("diamondnetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedNetherrack diamondnetherrack = new DiamondReinforcedNetherrack("diamondnetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondpurpur = new DiamondReinforcedStone("diamondpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondpurpurpillar = new DiamondReinforcedStone("diamondpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondquartzblock = new DiamondReinforcedStone("diamondquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondsandstonechiseled = new DiamondReinforcedStone("diamondsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondsandstonesmooth = new DiamondReinforcedStone("diamondsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondredsandstonechiseled = new DiamondReinforcedStone("diamondredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondredsandstonesmooth = new DiamondReinforcedStone("diamondredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondredsandstone = new DiamondReinforcedStone("diamondredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondstonebrick = new DiamondReinforcedStone("diamondstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondstonebrickcracked = new DiamondReinforcedStone("diamondstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondstonebrickmossy = new DiamondReinforcedStone("diamondstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedStone diamondstonebrickchiseled = new DiamondReinforcedStone("diamondstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracotta = new DiamondReinforcedTerracotta("diamondterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottawhite = new DiamondReinforcedTerracotta("diamondterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottaorange = new DiamondReinforcedTerracotta("diamondterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottamagenta = new DiamondReinforcedTerracotta("diamondterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottalightblue = new DiamondReinforcedTerracotta("diamondterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottayellow = new DiamondReinforcedTerracotta("diamondterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottalime = new DiamondReinforcedTerracotta("diamondterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottapink = new DiamondReinforcedTerracotta("diamondterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottagray = new DiamondReinforcedTerracotta("diamondterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottalightgray = new DiamondReinforcedTerracotta("diamondterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottacyan = new DiamondReinforcedTerracotta("diamondterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottapurple = new DiamondReinforcedTerracotta("diamondterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottablue = new DiamondReinforcedTerracotta("diamondterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottabrown = new DiamondReinforcedTerracotta("diamondterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottagreen = new DiamondReinforcedTerracotta("diamondterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottared = new DiamondReinforcedTerracotta("diamondterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static DiamondReinforcedTerracotta diamondterracottablack = new DiamondReinforcedTerracotta("diamondterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	//Emerald Reinforced Blocks
		public static EmeraldReinforcedWood emeraldoakplanks = new EmeraldReinforcedWood("emeraldoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedWood emeraldbirchplanks = new EmeraldReinforcedWood("emeraldbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedWood emeraldspruceplanks = new EmeraldReinforcedWood("emeraldspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedWood emeraldjungleplanks = new EmeraldReinforcedWood("emeraldjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedWood emeraldacaciaplanks = new EmeraldReinforcedWood("emeraldacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedWood emeralddarkoakplanks = new EmeraldReinforcedWood("emeralddarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldstone = new EmeraldReinforcedStone("emeraldstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldandesite = new EmeraldReinforcedStone("emeraldandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldgranite = new EmeraldReinforcedStone("emeraldgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeralddorite = new EmeraldReinforcedStone("emeralddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldpolishedandesite = new EmeraldReinforcedStone("emeraldpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldpolishedgranite = new EmeraldReinforcedStone("emeraldpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldpolisheddorite = new EmeraldReinforcedStone("emeraldpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldcobble = new EmeraldReinforcedStone("emeraldcobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldmossycobble = new EmeraldReinforcedStone("emeraldmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldsandstone = new EmeraldReinforcedStone("emeraldsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldbricks = new EmeraldReinforcedStone("emeraldbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldendstone = new EmeraldReinforcedStone("emeraldendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldendstonebrick = new EmeraldReinforcedStone("emeraldendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldnetherbrick = new EmeraldReinforcedStone("emeraldnetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedNetherrack emeraldnetherrack = new EmeraldReinforcedNetherrack("emeraldnetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldpurpur = new EmeraldReinforcedStone("emeraldpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldpurpurpillar = new EmeraldReinforcedStone("emeraldpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldquartzblock = new EmeraldReinforcedStone("emeraldquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldsandstonechiseled = new EmeraldReinforcedStone("emeraldsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldsandstonesmooth = new EmeraldReinforcedStone("emeraldsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldredsandstonechiseled = new EmeraldReinforcedStone("emeraldredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldredsandstonesmooth = new EmeraldReinforcedStone("emeraldredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldredsandstone = new EmeraldReinforcedStone("emeraldredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldstonebrick = new EmeraldReinforcedStone("emeraldstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldstonebrickcracked = new EmeraldReinforcedStone("emeraldstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldstonebrickmossy = new EmeraldReinforcedStone("emeraldstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedStone emeraldstonebrickchiseled = new EmeraldReinforcedStone("emeraldstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracotta = new EmeraldReinforcedTerracotta("emeraldterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottawhite = new EmeraldReinforcedTerracotta("emeraldterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottaorange = new EmeraldReinforcedTerracotta("emeraldterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottamagenta = new EmeraldReinforcedTerracotta("emeraldterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottalightblue = new EmeraldReinforcedTerracotta("emeraldterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottayellow = new EmeraldReinforcedTerracotta("emeraldterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottalime = new EmeraldReinforcedTerracotta("emeraldterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottapink = new EmeraldReinforcedTerracotta("emeraldterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottagray = new EmeraldReinforcedTerracotta("emeraldterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottalightgray = new EmeraldReinforcedTerracotta("emeraldterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottacyan = new EmeraldReinforcedTerracotta("emeraldterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottapurple = new EmeraldReinforcedTerracotta("emeraldterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottablue = new EmeraldReinforcedTerracotta("emeraldterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottabrown = new EmeraldReinforcedTerracotta("emeraldterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottagreen = new EmeraldReinforcedTerracotta("emeraldterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottared = new EmeraldReinforcedTerracotta("emeraldterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static EmeraldReinforcedTerracotta emeraldterracottablack = new EmeraldReinforcedTerracotta("emeraldterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
	
		//Obsidian Reinforced Blocks
		public static ObsidianReinforcedWood obsidianoakplanks = new ObsidianReinforcedWood("obsidianoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedWood obsidianbirchplanks = new ObsidianReinforcedWood("obsidianbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedWood obsidianspruceplanks = new ObsidianReinforcedWood("obsidianspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedWood obsidianjungleplanks = new ObsidianReinforcedWood("obsidianjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedWood obsidianacaciaplanks = new ObsidianReinforcedWood("obsidianacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedWood obsidiandarkoakplanks = new ObsidianReinforcedWood("obsidiandarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianstone = new ObsidianReinforcedStone("obsidianstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianandesite = new ObsidianReinforcedStone("obsidianandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiangranite = new ObsidianReinforcedStone("obsidiangranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiandorite = new ObsidianReinforcedStone("obsidiandorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianpolishedandesite = new ObsidianReinforcedStone("obsidianpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianpolishedgranite = new ObsidianReinforcedStone("obsidianpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianpolisheddorite = new ObsidianReinforcedStone("obsidianpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiancobble = new ObsidianReinforcedStone("obsidiancobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianmossycobble = new ObsidianReinforcedStone("obsidianmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiansandstone = new ObsidianReinforcedStone("obsidiansandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianbricks = new ObsidianReinforcedStone("obsidianbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianendstone = new ObsidianReinforcedStone("obsidianendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianendstonebrick = new ObsidianReinforcedStone("obsidianendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiannetherbrick = new ObsidianReinforcedStone("obsidiannetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedNetherrack obsidiannetherrack = new ObsidianReinforcedNetherrack("obsidiannetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianpurpur = new ObsidianReinforcedStone("obsidianpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianpurpurpillar = new ObsidianReinforcedStone("obsidianpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianquartzblock = new ObsidianReinforcedStone("obsidianquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiansandstonechiseled = new ObsidianReinforcedStone("obsidiansandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidiansandstonesmooth = new ObsidianReinforcedStone("obsidiansandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianredsandstonechiseled = new ObsidianReinforcedStone("obsidianredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianredsandstonesmooth = new ObsidianReinforcedStone("obsidianredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianredsandstone = new ObsidianReinforcedStone("obsidianredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianstonebrick = new ObsidianReinforcedStone("obsidianstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianstonebrickcracked = new ObsidianReinforcedStone("obsidianstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianstonebrickmossy = new ObsidianReinforcedStone("obsidianstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedStone obsidianstonebrickchiseled = new ObsidianReinforcedStone("obsidianstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracotta = new ObsidianReinforcedTerracotta("obsidianterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottawhite = new ObsidianReinforcedTerracotta("obsidianterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottaorange = new ObsidianReinforcedTerracotta("obsidianterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottamagenta = new ObsidianReinforcedTerracotta("obsidianterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottalightblue = new ObsidianReinforcedTerracotta("obsidianterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottayellow = new ObsidianReinforcedTerracotta("obsidianterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottalime = new ObsidianReinforcedTerracotta("obsidianterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottapink = new ObsidianReinforcedTerracotta("obsidianterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottagray = new ObsidianReinforcedTerracotta("obsidianterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottalightgray = new ObsidianReinforcedTerracotta("obsidianterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottacyan = new ObsidianReinforcedTerracotta("obsidianterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottapurple = new ObsidianReinforcedTerracotta("obsidianterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottablue = new ObsidianReinforcedTerracotta("obsidianterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottabrown = new ObsidianReinforcedTerracotta("obsidianterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottagreen = new ObsidianReinforcedTerracotta("obsidianterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottared = new ObsidianReinforcedTerracotta("obsidianterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static ObsidianReinforcedTerracotta obsidianterracottablack = new ObsidianReinforcedTerracotta("obsidianterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
		
		//Bedrock Reinforced Blocks
		public static BedrockReinforcedWood bedrockoakplanks = new BedrockReinforcedWood("bedrockoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedWood bedrockbirchplanks = new BedrockReinforcedWood("bedrockbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedWood bedrockspruceplanks = new BedrockReinforcedWood("bedrockspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedWood bedrockjungleplanks = new BedrockReinforcedWood("bedrockjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedWood bedrockacaciaplanks = new BedrockReinforcedWood("bedrockacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedWood bedrockdarkoakplanks = new BedrockReinforcedWood("bedrockdarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockstone = new BedrockReinforcedStone("bedrockstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockandesite = new BedrockReinforcedStone("bedrockandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockgranite = new BedrockReinforcedStone("bedrockgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockdorite = new BedrockReinforcedStone("bedrockdorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockpolishedandesite = new BedrockReinforcedStone("bedrockpolishedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockpolishedgranite = new BedrockReinforcedStone("bedrockpolishedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockpolisheddorite = new BedrockReinforcedStone("bedrockpolisheddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockcobble = new BedrockReinforcedStone("bedrockcobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockmossycobble = new BedrockReinforcedStone("bedrockmossycobble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrocksandstone = new BedrockReinforcedStone("bedrocksandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockbricks = new BedrockReinforcedStone("bedrockbricks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockendstone = new BedrockReinforcedStone("bedrockendstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockendstonebrick = new BedrockReinforcedStone("bedrockendstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrocknetherbrick = new BedrockReinforcedStone("bedrocknetherbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedNetherrack bedrocknetherrack = new BedrockReinforcedNetherrack("bedrocknetherrack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockpurpur = new BedrockReinforcedStone("bedrockpurpur").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockpurpurpillar = new BedrockReinforcedStone("bedrockpurpurpillar").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockquartzblock = new BedrockReinforcedStone("bedrockquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrocksandstonechiseled = new BedrockReinforcedStone("bedrocksandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrocksandstonesmooth = new BedrockReinforcedStone("bedrocksandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockredsandstonechiseled = new BedrockReinforcedStone("bedrockredsandstonechisled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockredsandstonesmooth = new BedrockReinforcedStone("bedrockredsandstonesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockredsandstone = new BedrockReinforcedStone("bedrockredsandstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockstonebrick = new BedrockReinforcedStone("bedrockstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockstonebrickcracked = new BedrockReinforcedStone("bedrockstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockstonebrickmossy = new BedrockReinforcedStone("bedrockstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedStone bedrockstonebrickchiseled = new BedrockReinforcedStone("bedrockstonebrickchiseled").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracotta = new BedrockReinforcedTerracotta("bedrockterracotta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottawhite = new BedrockReinforcedTerracotta("bedrockterracottawhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottaorange = new BedrockReinforcedTerracotta("bedrockterracottaorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottamagenta = new BedrockReinforcedTerracotta("bedrockterracottamagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottalightblue = new BedrockReinforcedTerracotta("bedrockterracottalightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottayellow = new BedrockReinforcedTerracotta("bedrockterracottayellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottalime = new BedrockReinforcedTerracotta("bedrockterracottalime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottapink = new BedrockReinforcedTerracotta("bedrockterracottapink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottagray = new BedrockReinforcedTerracotta("bedrockterracottagray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottalightgray = new BedrockReinforcedTerracotta("bedrockterracottalightgray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottacyan = new BedrockReinforcedTerracotta("bedrockterracottacyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottapurple = new BedrockReinforcedTerracotta("bedrockterracottapurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottablue = new BedrockReinforcedTerracotta("bedrockterracottablue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottabrown = new BedrockReinforcedTerracotta("bedrockterracottabrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottagreen = new BedrockReinforcedTerracotta("bedrockterracottagreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottared = new BedrockReinforcedTerracotta("bedrockterracottared").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		public static BedrockReinforcedTerracotta bedrockterracottablack = new BedrockReinforcedTerracotta("bedrockterracottablack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		//Misc reinforced blocks
		public static ReinforcedIron reinforcedironblock = new ReinforcedIron("reinforcediron").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
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
	        	ironstonebrickchiseled,
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
	        	goldstonebrickchiseled,
	        	diamondterracotta,
				diamondterracottawhite,
				diamondterracottaorange,
				diamondterracottamagenta,
				diamondterracottalightblue,
				diamondterracottayellow,
				diamondterracottalime,
				diamondterracottapink,
				diamondterracottagray,
				diamondterracottalightgray,
				diamondterracottacyan,
				diamondterracottapurple,
				diamondterracottablue,
				diamondterracottabrown,
				diamondterracottagreen,
				diamondterracottared,
				diamondterracottablack,
	            diamondoakplanks,
	            diamondbirchplanks,
	            diamondspruceplanks,
	            diamondjungleplanks,
	            diamondacaciaplanks,
	            diamonddarkoakplanks,
	            diamondstone,
	        	diamondandesite,
	        	diamondgranite,
	        	diamonddorite,
	            diamondpolishedandesite,
	        	diamondpolishedgranite,
	        	diamondpolisheddorite,
	        	diamondcobble,
	        	diamondmossycobble,
	        	diamondsandstone,
	            diamondbricks,
	        	diamondendstone,
	        	diamondendstonebrick,
	        	diamondnetherbrick,
	        	diamondnetherrack,
	        	diamondpurpur,
	        	diamondpurpurpillar,
	        	diamondquartzblock,
	        	diamondsandstonechiseled,
	        	diamondsandstonesmooth,
	        	diamondredsandstonechiseled,
	        	diamondredsandstonesmooth,
	        	diamondredsandstone,
	        	diamondstonebrick,
	        	diamondstonebrickcracked,
	        	diamondstonebrickmossy,
	        	diamondstonebrickchiseled,
	        	emeraldterracotta,
				emeraldterracottawhite,
				emeraldterracottaorange,
				emeraldterracottamagenta,
				emeraldterracottalightblue,
				emeraldterracottayellow,
				emeraldterracottalime,
				emeraldterracottapink,
				emeraldterracottagray,
				emeraldterracottalightgray,
				emeraldterracottacyan,
				emeraldterracottapurple,
				emeraldterracottablue,
				emeraldterracottabrown,
				emeraldterracottagreen,
				emeraldterracottared,
				emeraldterracottablack,
	            emeraldoakplanks,
	            emeraldbirchplanks,
	            emeraldspruceplanks,
	            emeraldjungleplanks,
	            emeraldacaciaplanks,
	            emeralddarkoakplanks,
	            emeraldstone,
	        	emeraldandesite,
	        	emeraldgranite,
	        	emeralddorite,
	            emeraldpolishedandesite,
	        	emeraldpolishedgranite,
	        	emeraldpolisheddorite,
	        	emeraldcobble,
	        	emeraldmossycobble,
	        	emeraldsandstone,
	            emeraldbricks,
	        	emeraldendstone,
	        	emeraldendstonebrick,
	        	emeraldnetherbrick,
	        	emeraldnetherrack,
	        	emeraldpurpur,
	        	emeraldpurpurpillar,
	        	emeraldquartzblock,
	        	emeraldsandstonechiseled,
	        	emeraldsandstonesmooth,
	        	emeraldredsandstonechiseled,
	        	emeraldredsandstonesmooth,
	        	emeraldredsandstone,
	        	emeraldstonebrick,
	        	emeraldstonebrickcracked,
	        	emeraldstonebrickmossy,
	        	emeraldstonebrickchiseled,
	        	
	        	obsidianterracotta,
				obsidianterracottawhite,
				obsidianterracottaorange,
				obsidianterracottamagenta,
				obsidianterracottalightblue,
				obsidianterracottayellow,
				obsidianterracottalime,
				obsidianterracottapink,
				obsidianterracottagray,
				obsidianterracottalightgray,
				obsidianterracottacyan,
				obsidianterracottapurple,
				obsidianterracottablue,
				obsidianterracottabrown,
				obsidianterracottagreen,
				obsidianterracottared,
				obsidianterracottablack,
	            obsidianoakplanks,
	            obsidianbirchplanks,
	            obsidianspruceplanks,
	            obsidianjungleplanks,
	            obsidianacaciaplanks,
	            obsidiandarkoakplanks,
	            obsidianstone,
	        	obsidianandesite,
	        	obsidiangranite,
	        	obsidiandorite,
	            obsidianpolishedandesite,
	        	obsidianpolishedgranite,
	        	obsidianpolisheddorite,
	        	obsidiancobble,
	        	obsidianmossycobble,
	        	obsidiansandstone,
	            obsidianbricks,
	        	obsidianendstone,
	        	obsidianendstonebrick,
	        	obsidiannetherbrick,
	        	obsidiannetherrack,
	        	obsidianpurpur,
	        	obsidianpurpurpillar,
	        	obsidianquartzblock,
	        	obsidiansandstonechiseled,
	        	obsidiansandstonesmooth,
	        	obsidianredsandstonechiseled,
	        	obsidianredsandstonesmooth,
	        	obsidianredsandstone,
	        	obsidianstonebrick,
	        	obsidianstonebrickcracked,
	        	obsidianstonebrickmossy,
	        	obsidianstonebrickchiseled,
	        	
	        	bedrockterracotta,
				bedrockterracottawhite,
				bedrockterracottaorange,
				bedrockterracottamagenta,
				bedrockterracottalightblue,
				bedrockterracottayellow,
				bedrockterracottalime,
				bedrockterracottapink,
				bedrockterracottagray,
				bedrockterracottalightgray,
				bedrockterracottacyan,
				bedrockterracottapurple,
				bedrockterracottablue,
				bedrockterracottabrown,
				bedrockterracottagreen,
				bedrockterracottared,
				bedrockterracottablack,
	            bedrockoakplanks,
	            bedrockbirchplanks,
	            bedrockspruceplanks,
	            bedrockjungleplanks,
	            bedrockacaciaplanks,
	            bedrockdarkoakplanks,
	            bedrockstone,
	        	bedrockandesite,
	        	bedrockgranite,
	        	bedrockdorite,
	            bedrockpolishedandesite,
	        	bedrockpolishedgranite,
	        	bedrockpolisheddorite,
	        	bedrockcobble,
	        	bedrockmossycobble,
	        	bedrocksandstone,
	            bedrockbricks,
	        	bedrockendstone,
	        	bedrockendstonebrick,
	        	bedrocknetherbrick,
	        	bedrocknetherrack,
	        	bedrockpurpur,
	        	bedrockpurpurpillar,
	        	bedrockquartzblock,
	        	bedrocksandstonechiseled,
	        	bedrocksandstonesmooth,
	        	bedrockredsandstonechiseled,
	        	bedrockredsandstonesmooth,
	        	bedrockredsandstone,
	        	bedrockstonebrick,
	        	bedrockstonebrickcracked,
	        	bedrockstonebrickmossy,
	        	bedrockstonebrickchiseled,
	        	
	        	reinforcedironblock
				
				
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
			      ironterracottablack.createItemBlock(),
			      
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
			      goldterracottablack.createItemBlock(),
			      
			      diamondoakplanks.createItemBlock(),
		          diamondbirchplanks.createItemBlock(),
		          diamondspruceplanks.createItemBlock(),
		          diamondjungleplanks.createItemBlock(),
		          diamondacaciaplanks.createItemBlock(),
		          diamonddarkoakplanks.createItemBlock(),
		          diamondstone.createItemBlock(),
		          diamondandesite.createItemBlock(),
		          diamondgranite.createItemBlock(),
		          diamonddorite.createItemBlock(),
		          diamondpolishedandesite.createItemBlock(),
		          diamondpolishedgranite.createItemBlock(),
		          diamondpolisheddorite.createItemBlock(),
		          diamondcobble.createItemBlock(),
		          diamondmossycobble.createItemBlock(),
		          diamondsandstone.createItemBlock(),
		          diamondbricks.createItemBlock(),
		          diamondendstone.createItemBlock(),
		          diamondendstonebrick.createItemBlock(),
		          diamondnetherbrick.createItemBlock(),
		          diamondnetherrack.createItemBlock(),
		          diamondpurpur.createItemBlock(),
		          diamondpurpurpillar.createItemBlock(),
		          diamondquartzblock.createItemBlock(),
		          diamondsandstonechiseled.createItemBlock(),
		          diamondsandstonesmooth.createItemBlock(),
		          diamondredsandstonechiseled.createItemBlock(),
		          diamondredsandstonesmooth.createItemBlock(),
		          diamondredsandstone.createItemBlock(),
		          diamondstonebrick.createItemBlock(),
		          diamondstonebrickcracked.createItemBlock(),
		          diamondstonebrickmossy.createItemBlock(),
		          diamondstonebrickchiseled.createItemBlock(),
		          diamondterracotta.createItemBlock(),
				  diamondterracottawhite.createItemBlock(),
				  diamondterracottaorange.createItemBlock(),
				  diamondterracottamagenta.createItemBlock(),
				  diamondterracottalightblue.createItemBlock(),
			      diamondterracottayellow.createItemBlock(),
				  diamondterracottalime.createItemBlock(),
				  diamondterracottapink.createItemBlock(),
				  diamondterracottagray.createItemBlock(),
			      diamondterracottalightgray.createItemBlock(),
				  diamondterracottacyan.createItemBlock(),
				  diamondterracottapurple.createItemBlock(),
				  diamondterracottablue.createItemBlock(),
				  diamondterracottabrown.createItemBlock(),
				  diamondterracottagreen.createItemBlock(),
				  diamondterracottared.createItemBlock(),
			      diamondterracottablack.createItemBlock(),
			      
			      emeraldoakplanks.createItemBlock(),
		          emeraldbirchplanks.createItemBlock(),
		          emeraldspruceplanks.createItemBlock(),
		          emeraldjungleplanks.createItemBlock(),
		          emeraldacaciaplanks.createItemBlock(),
		          emeralddarkoakplanks.createItemBlock(),
		          emeraldstone.createItemBlock(),
		          emeraldandesite.createItemBlock(),
		          emeraldgranite.createItemBlock(),
		          emeralddorite.createItemBlock(),
		          emeraldpolishedandesite.createItemBlock(),
		          emeraldpolishedgranite.createItemBlock(),
		          emeraldpolisheddorite.createItemBlock(),
		          emeraldcobble.createItemBlock(),
		          emeraldmossycobble.createItemBlock(),
		          emeraldsandstone.createItemBlock(),
		          emeraldbricks.createItemBlock(),
		          emeraldendstone.createItemBlock(),
		          emeraldendstonebrick.createItemBlock(),
		          emeraldnetherbrick.createItemBlock(),
		          emeraldnetherrack.createItemBlock(),
		          emeraldpurpur.createItemBlock(),
		          emeraldpurpurpillar.createItemBlock(),
		          emeraldquartzblock.createItemBlock(),
		          emeraldsandstonechiseled.createItemBlock(),
		          emeraldsandstonesmooth.createItemBlock(),
		          emeraldredsandstonechiseled.createItemBlock(),
		          emeraldredsandstonesmooth.createItemBlock(),
		          emeraldredsandstone.createItemBlock(),
		          emeraldstonebrick.createItemBlock(),
		          emeraldstonebrickcracked.createItemBlock(),
		          emeraldstonebrickmossy.createItemBlock(),
		          emeraldstonebrickchiseled.createItemBlock(),
		          emeraldterracotta.createItemBlock(),
				  emeraldterracottawhite.createItemBlock(),
				  emeraldterracottaorange.createItemBlock(),
				  emeraldterracottamagenta.createItemBlock(),
				  emeraldterracottalightblue.createItemBlock(),
			      emeraldterracottayellow.createItemBlock(),
				  emeraldterracottalime.createItemBlock(),
				  emeraldterracottapink.createItemBlock(),
				  emeraldterracottagray.createItemBlock(),
			      emeraldterracottalightgray.createItemBlock(),
				  emeraldterracottacyan.createItemBlock(),
				  emeraldterracottapurple.createItemBlock(),
				  emeraldterracottablue.createItemBlock(),
				  emeraldterracottabrown.createItemBlock(),
				  emeraldterracottagreen.createItemBlock(),
				  emeraldterracottared.createItemBlock(),
			      emeraldterracottablack.createItemBlock(),
			      
			      obsidianoakplanks.createItemBlock(),
		          obsidianbirchplanks.createItemBlock(),
		          obsidianspruceplanks.createItemBlock(),
		          obsidianjungleplanks.createItemBlock(),
		          obsidianacaciaplanks.createItemBlock(),
		          obsidiandarkoakplanks.createItemBlock(),
		          obsidianstone.createItemBlock(),
		          obsidianandesite.createItemBlock(),
		          obsidiangranite.createItemBlock(),
		          obsidiandorite.createItemBlock(),
		          obsidianpolishedandesite.createItemBlock(),
		          obsidianpolishedgranite.createItemBlock(),
		          obsidianpolisheddorite.createItemBlock(),
		          obsidiancobble.createItemBlock(),
		          obsidianmossycobble.createItemBlock(),
		          obsidiansandstone.createItemBlock(),
		          obsidianbricks.createItemBlock(),
		          obsidianendstone.createItemBlock(),
		          obsidianendstonebrick.createItemBlock(),
		          obsidiannetherbrick.createItemBlock(),
		          obsidiannetherrack.createItemBlock(),
		          obsidianpurpur.createItemBlock(),
		          obsidianpurpurpillar.createItemBlock(),
		          obsidianquartzblock.createItemBlock(),
		          obsidiansandstonechiseled.createItemBlock(),
		          obsidiansandstonesmooth.createItemBlock(),
		          obsidianredsandstonechiseled.createItemBlock(),
		          obsidianredsandstonesmooth.createItemBlock(),
		          obsidianredsandstone.createItemBlock(),
		          obsidianstonebrick.createItemBlock(),
		          obsidianstonebrickcracked.createItemBlock(),
		          obsidianstonebrickmossy.createItemBlock(),
		          obsidianstonebrickchiseled.createItemBlock(),
		          obsidianterracotta.createItemBlock(),
				  obsidianterracottawhite.createItemBlock(),
				  obsidianterracottaorange.createItemBlock(),
				  obsidianterracottamagenta.createItemBlock(),
				  obsidianterracottalightblue.createItemBlock(),
			      obsidianterracottayellow.createItemBlock(),
				  obsidianterracottalime.createItemBlock(),
				  obsidianterracottapink.createItemBlock(),
				  obsidianterracottagray.createItemBlock(),
			      obsidianterracottalightgray.createItemBlock(),
				  obsidianterracottacyan.createItemBlock(),
				  obsidianterracottapurple.createItemBlock(),
				  obsidianterracottablue.createItemBlock(),
				  obsidianterracottabrown.createItemBlock(),
				  obsidianterracottagreen.createItemBlock(),
				  obsidianterracottared.createItemBlock(),
			      obsidianterracottablack.createItemBlock(),
			      
			      bedrockoakplanks.createItemBlock(),
		          bedrockbirchplanks.createItemBlock(),
		          bedrockspruceplanks.createItemBlock(),
		          bedrockjungleplanks.createItemBlock(),
		          bedrockacaciaplanks.createItemBlock(),
		          bedrockdarkoakplanks.createItemBlock(),
		          bedrockstone.createItemBlock(),
		          bedrockandesite.createItemBlock(),
		          bedrockgranite.createItemBlock(),
		          bedrockdorite.createItemBlock(),
		          bedrockpolishedandesite.createItemBlock(),
		          bedrockpolishedgranite.createItemBlock(),
		          bedrockpolisheddorite.createItemBlock(),
		          bedrockcobble.createItemBlock(),
		          bedrockmossycobble.createItemBlock(),
		          bedrocksandstone.createItemBlock(),
		          bedrockbricks.createItemBlock(),
		          bedrockendstone.createItemBlock(),
		          bedrockendstonebrick.createItemBlock(),
		          bedrocknetherbrick.createItemBlock(),
		          bedrocknetherrack.createItemBlock(),
		          bedrockpurpur.createItemBlock(),
		          bedrockpurpurpillar.createItemBlock(),
		          bedrockquartzblock.createItemBlock(),
		          bedrocksandstonechiseled.createItemBlock(),
		          bedrocksandstonesmooth.createItemBlock(),
		          bedrockredsandstonechiseled.createItemBlock(),
		          bedrockredsandstonesmooth.createItemBlock(),
		          bedrockredsandstone.createItemBlock(),
		          bedrockstonebrick.createItemBlock(),
		          bedrockstonebrickcracked.createItemBlock(),
		          bedrockstonebrickmossy.createItemBlock(),
		          bedrockstonebrickchiseled.createItemBlock(),
		          bedrockterracotta.createItemBlock(),
				  bedrockterracottawhite.createItemBlock(),
				  bedrockterracottaorange.createItemBlock(),
				  bedrockterracottamagenta.createItemBlock(),
				  bedrockterracottalightblue.createItemBlock(),
			      bedrockterracottayellow.createItemBlock(),
				  bedrockterracottalime.createItemBlock(),
				  bedrockterracottapink.createItemBlock(),
				  bedrockterracottagray.createItemBlock(),
			      bedrockterracottalightgray.createItemBlock(),
				  bedrockterracottacyan.createItemBlock(),
				  bedrockterracottapurple.createItemBlock(),
				  bedrockterracottablue.createItemBlock(),
				  bedrockterracottabrown.createItemBlock(),
				  bedrockterracottagreen.createItemBlock(),
				  bedrockterracottared.createItemBlock(),
			      bedrockterracottablack.createItemBlock(),
			      
			      reinforcedironblock.createItemBlock()
				
				
				
			
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
		  
		  diamondoakplanks.registerItemModel(Item.getItemFromBlock(diamondoakplanks));
          diamondbirchplanks.registerItemModel(Item.getItemFromBlock(diamondbirchplanks));
          diamondspruceplanks.registerItemModel(Item.getItemFromBlock(diamondspruceplanks));
          diamondjungleplanks.registerItemModel(Item.getItemFromBlock(diamondjungleplanks));
          diamondacaciaplanks.registerItemModel(Item.getItemFromBlock(diamondacaciaplanks));
          diamonddarkoakplanks.registerItemModel(Item.getItemFromBlock(diamonddarkoakplanks));
          diamondstone.registerItemModel(Item.getItemFromBlock(diamondstone));
      	  diamondandesite.registerItemModel(Item.getItemFromBlock(diamondandesite));
      	  diamondgranite.registerItemModel(Item.getItemFromBlock(diamondgranite));
      	  diamonddorite.registerItemModel(Item.getItemFromBlock(diamonddorite));
          diamondpolishedandesite.registerItemModel(Item.getItemFromBlock(diamondpolishedandesite));
      	  diamondpolishedgranite.registerItemModel(Item.getItemFromBlock(diamondpolishedgranite));
      	  diamondpolisheddorite.registerItemModel(Item.getItemFromBlock(diamondpolisheddorite));
      	  diamondcobble.registerItemModel(Item.getItemFromBlock(diamondcobble));
      	  diamondmossycobble.registerItemModel(Item.getItemFromBlock(diamondmossycobble));
      	  diamondsandstone.registerItemModel(Item.getItemFromBlock(diamondsandstone));
          diamondbricks.registerItemModel(Item.getItemFromBlock(diamondbricks));
      	  diamondendstone.registerItemModel(Item.getItemFromBlock(diamondendstone));
      	  diamondendstonebrick.registerItemModel(Item.getItemFromBlock(diamondendstonebrick));
      	  diamondnetherbrick.registerItemModel(Item.getItemFromBlock(diamondnetherbrick));
      	  diamondnetherrack.registerItemModel(Item.getItemFromBlock(diamondnetherrack));
      	  diamondpurpur.registerItemModel(Item.getItemFromBlock(diamondpurpur));
      	  diamondpurpurpillar.registerItemModel(Item.getItemFromBlock(diamondpurpurpillar));
      	  diamondquartzblock.registerItemModel(Item.getItemFromBlock(diamondquartzblock));
      	  diamondsandstonechiseled.registerItemModel(Item.getItemFromBlock(diamondsandstonechiseled));
      	  diamondsandstonesmooth.registerItemModel(Item.getItemFromBlock(diamondsandstonesmooth));
      	  diamondredsandstonechiseled.registerItemModel(Item.getItemFromBlock(diamondredsandstonechiseled));
      	  diamondredsandstonesmooth.registerItemModel(Item.getItemFromBlock(diamondredsandstonesmooth));
      	  diamondredsandstone.registerItemModel(Item.getItemFromBlock(diamondredsandstone));
      	  diamondstonebrick.registerItemModel(Item.getItemFromBlock(diamondstonebrick));
      	  diamondstonebrickcracked.registerItemModel(Item.getItemFromBlock(diamondstonebrickcracked));
      	  diamondstonebrickmossy.registerItemModel(Item.getItemFromBlock(diamondstonebrickmossy));
      	  diamondstonebrickchiseled.registerItemModel(Item.getItemFromBlock(diamondstonebrickchiseled));
      	  diamondterracotta.registerItemModel(Item.getItemFromBlock(diamondterracotta));
		  diamondterracottawhite.registerItemModel(Item.getItemFromBlock(diamondterracottawhite));
		  diamondterracottaorange.registerItemModel(Item.getItemFromBlock(diamondterracottaorange));
		  diamondterracottamagenta.registerItemModel(Item.getItemFromBlock(diamondterracottamagenta));
		  diamondterracottalightblue.registerItemModel(Item.getItemFromBlock(diamondterracottalightblue));
		  diamondterracottayellow.registerItemModel(Item.getItemFromBlock(diamondterracottayellow));
		  diamondterracottalime.registerItemModel(Item.getItemFromBlock(diamondterracottalime));
		  diamondterracottapink.registerItemModel(Item.getItemFromBlock(diamondterracottapink));
		  diamondterracottagray.registerItemModel(Item.getItemFromBlock(diamondterracottagray));
		  diamondterracottalightgray.registerItemModel(Item.getItemFromBlock(diamondterracottalightgray));
		  diamondterracottacyan.registerItemModel(Item.getItemFromBlock(diamondterracottacyan));
		  diamondterracottapurple.registerItemModel(Item.getItemFromBlock(diamondterracottapurple));
		  diamondterracottablue.registerItemModel(Item.getItemFromBlock(diamondterracottablue));
		  diamondterracottabrown.registerItemModel(Item.getItemFromBlock(diamondterracottabrown));
		  diamondterracottagreen.registerItemModel(Item.getItemFromBlock(diamondterracottagreen));
		  diamondterracottared.registerItemModel(Item.getItemFromBlock(diamondterracottared));
		  diamondterracottablack.registerItemModel(Item.getItemFromBlock(diamondterracottablack));
		  
		  emeraldoakplanks.registerItemModel(Item.getItemFromBlock(emeraldoakplanks));
          emeraldbirchplanks.registerItemModel(Item.getItemFromBlock(emeraldbirchplanks));
          emeraldspruceplanks.registerItemModel(Item.getItemFromBlock(emeraldspruceplanks));
          emeraldjungleplanks.registerItemModel(Item.getItemFromBlock(emeraldjungleplanks));
          emeraldacaciaplanks.registerItemModel(Item.getItemFromBlock(emeraldacaciaplanks));
          emeralddarkoakplanks.registerItemModel(Item.getItemFromBlock(emeralddarkoakplanks));
          emeraldstone.registerItemModel(Item.getItemFromBlock(emeraldstone));
      	  emeraldandesite.registerItemModel(Item.getItemFromBlock(emeraldandesite));
      	  emeraldgranite.registerItemModel(Item.getItemFromBlock(emeraldgranite));
      	  emeralddorite.registerItemModel(Item.getItemFromBlock(emeralddorite));
          emeraldpolishedandesite.registerItemModel(Item.getItemFromBlock(emeraldpolishedandesite));
      	  emeraldpolishedgranite.registerItemModel(Item.getItemFromBlock(emeraldpolishedgranite));
      	  emeraldpolisheddorite.registerItemModel(Item.getItemFromBlock(emeraldpolisheddorite));
      	  emeraldcobble.registerItemModel(Item.getItemFromBlock(emeraldcobble));
      	  emeraldmossycobble.registerItemModel(Item.getItemFromBlock(emeraldmossycobble));
      	  emeraldsandstone.registerItemModel(Item.getItemFromBlock(emeraldsandstone));
          emeraldbricks.registerItemModel(Item.getItemFromBlock(emeraldbricks));
      	  emeraldendstone.registerItemModel(Item.getItemFromBlock(emeraldendstone));
      	  emeraldendstonebrick.registerItemModel(Item.getItemFromBlock(emeraldendstonebrick));
      	  emeraldnetherbrick.registerItemModel(Item.getItemFromBlock(emeraldnetherbrick));
      	  emeraldnetherrack.registerItemModel(Item.getItemFromBlock(emeraldnetherrack));
      	  emeraldpurpur.registerItemModel(Item.getItemFromBlock(emeraldpurpur));
      	  emeraldpurpurpillar.registerItemModel(Item.getItemFromBlock(emeraldpurpurpillar));
      	  emeraldquartzblock.registerItemModel(Item.getItemFromBlock(emeraldquartzblock));
      	  emeraldsandstonechiseled.registerItemModel(Item.getItemFromBlock(emeraldsandstonechiseled));
      	  emeraldsandstonesmooth.registerItemModel(Item.getItemFromBlock(emeraldsandstonesmooth));
      	  emeraldredsandstonechiseled.registerItemModel(Item.getItemFromBlock(emeraldredsandstonechiseled));
      	  emeraldredsandstonesmooth.registerItemModel(Item.getItemFromBlock(emeraldredsandstonesmooth));
      	  emeraldredsandstone.registerItemModel(Item.getItemFromBlock(emeraldredsandstone));
      	  emeraldstonebrick.registerItemModel(Item.getItemFromBlock(emeraldstonebrick));
      	  emeraldstonebrickcracked.registerItemModel(Item.getItemFromBlock(emeraldstonebrickcracked));
      	  emeraldstonebrickmossy.registerItemModel(Item.getItemFromBlock(emeraldstonebrickmossy));
      	  emeraldstonebrickchiseled.registerItemModel(Item.getItemFromBlock(emeraldstonebrickchiseled));
      	  emeraldterracotta.registerItemModel(Item.getItemFromBlock(emeraldterracotta));
		  emeraldterracottawhite.registerItemModel(Item.getItemFromBlock(emeraldterracottawhite));
		  emeraldterracottaorange.registerItemModel(Item.getItemFromBlock(emeraldterracottaorange));
		  emeraldterracottamagenta.registerItemModel(Item.getItemFromBlock(emeraldterracottamagenta));
		  emeraldterracottalightblue.registerItemModel(Item.getItemFromBlock(emeraldterracottalightblue));
		  emeraldterracottayellow.registerItemModel(Item.getItemFromBlock(emeraldterracottayellow));
		  emeraldterracottalime.registerItemModel(Item.getItemFromBlock(emeraldterracottalime));
		  emeraldterracottapink.registerItemModel(Item.getItemFromBlock(emeraldterracottapink));
		  emeraldterracottagray.registerItemModel(Item.getItemFromBlock(emeraldterracottagray));
		  emeraldterracottalightgray.registerItemModel(Item.getItemFromBlock(emeraldterracottalightgray));
		  emeraldterracottacyan.registerItemModel(Item.getItemFromBlock(emeraldterracottacyan));
		  emeraldterracottapurple.registerItemModel(Item.getItemFromBlock(emeraldterracottapurple));
		  emeraldterracottablue.registerItemModel(Item.getItemFromBlock(emeraldterracottablue));
		  emeraldterracottabrown.registerItemModel(Item.getItemFromBlock(emeraldterracottabrown));
		  emeraldterracottagreen.registerItemModel(Item.getItemFromBlock(emeraldterracottagreen));
		  emeraldterracottared.registerItemModel(Item.getItemFromBlock(emeraldterracottared));
		  emeraldterracottablack.registerItemModel(Item.getItemFromBlock(emeraldterracottablack));
		  
		  obsidianoakplanks.registerItemModel(Item.getItemFromBlock(obsidianoakplanks));
          obsidianbirchplanks.registerItemModel(Item.getItemFromBlock(obsidianbirchplanks));
          obsidianspruceplanks.registerItemModel(Item.getItemFromBlock(obsidianspruceplanks));
          obsidianjungleplanks.registerItemModel(Item.getItemFromBlock(obsidianjungleplanks));
          obsidianacaciaplanks.registerItemModel(Item.getItemFromBlock(obsidianacaciaplanks));
          obsidiandarkoakplanks.registerItemModel(Item.getItemFromBlock(obsidiandarkoakplanks));
          obsidianstone.registerItemModel(Item.getItemFromBlock(obsidianstone));
      	  obsidianandesite.registerItemModel(Item.getItemFromBlock(obsidianandesite));
      	  obsidiangranite.registerItemModel(Item.getItemFromBlock(obsidiangranite));
      	  obsidiandorite.registerItemModel(Item.getItemFromBlock(obsidiandorite));
          obsidianpolishedandesite.registerItemModel(Item.getItemFromBlock(obsidianpolishedandesite));
      	  obsidianpolishedgranite.registerItemModel(Item.getItemFromBlock(obsidianpolishedgranite));
      	  obsidianpolisheddorite.registerItemModel(Item.getItemFromBlock(obsidianpolisheddorite));
      	  obsidiancobble.registerItemModel(Item.getItemFromBlock(obsidiancobble));
      	  obsidianmossycobble.registerItemModel(Item.getItemFromBlock(obsidianmossycobble));
      	  obsidiansandstone.registerItemModel(Item.getItemFromBlock(obsidiansandstone));
          obsidianbricks.registerItemModel(Item.getItemFromBlock(obsidianbricks));
      	  obsidianendstone.registerItemModel(Item.getItemFromBlock(obsidianendstone));
      	  obsidianendstonebrick.registerItemModel(Item.getItemFromBlock(obsidianendstonebrick));
      	  obsidiannetherbrick.registerItemModel(Item.getItemFromBlock(obsidiannetherbrick));
      	  obsidiannetherrack.registerItemModel(Item.getItemFromBlock(obsidiannetherrack));
      	  obsidianpurpur.registerItemModel(Item.getItemFromBlock(obsidianpurpur));
      	  obsidianpurpurpillar.registerItemModel(Item.getItemFromBlock(obsidianpurpurpillar));
      	  obsidianquartzblock.registerItemModel(Item.getItemFromBlock(obsidianquartzblock));
      	  obsidiansandstonechiseled.registerItemModel(Item.getItemFromBlock(obsidiansandstonechiseled));
      	  obsidiansandstonesmooth.registerItemModel(Item.getItemFromBlock(obsidiansandstonesmooth));
      	  obsidianredsandstonechiseled.registerItemModel(Item.getItemFromBlock(obsidianredsandstonechiseled));
      	  obsidianredsandstonesmooth.registerItemModel(Item.getItemFromBlock(obsidianredsandstonesmooth));
      	  obsidianredsandstone.registerItemModel(Item.getItemFromBlock(obsidianredsandstone));
      	  obsidianstonebrick.registerItemModel(Item.getItemFromBlock(obsidianstonebrick));
      	  obsidianstonebrickcracked.registerItemModel(Item.getItemFromBlock(obsidianstonebrickcracked));
      	  obsidianstonebrickmossy.registerItemModel(Item.getItemFromBlock(obsidianstonebrickmossy));
      	  obsidianstonebrickchiseled.registerItemModel(Item.getItemFromBlock(obsidianstonebrickchiseled));
      	  obsidianterracotta.registerItemModel(Item.getItemFromBlock(obsidianterracotta));
		  obsidianterracottawhite.registerItemModel(Item.getItemFromBlock(obsidianterracottawhite));
		  obsidianterracottaorange.registerItemModel(Item.getItemFromBlock(obsidianterracottaorange));
		  obsidianterracottamagenta.registerItemModel(Item.getItemFromBlock(obsidianterracottamagenta));
		  obsidianterracottalightblue.registerItemModel(Item.getItemFromBlock(obsidianterracottalightblue));
		  obsidianterracottayellow.registerItemModel(Item.getItemFromBlock(obsidianterracottayellow));
		  obsidianterracottalime.registerItemModel(Item.getItemFromBlock(obsidianterracottalime));
		  obsidianterracottapink.registerItemModel(Item.getItemFromBlock(obsidianterracottapink));
		  obsidianterracottagray.registerItemModel(Item.getItemFromBlock(obsidianterracottagray));
		  obsidianterracottalightgray.registerItemModel(Item.getItemFromBlock(obsidianterracottalightgray));
		  obsidianterracottacyan.registerItemModel(Item.getItemFromBlock(obsidianterracottacyan));
		  obsidianterracottapurple.registerItemModel(Item.getItemFromBlock(obsidianterracottapurple));
		  obsidianterracottablue.registerItemModel(Item.getItemFromBlock(obsidianterracottablue));
		  obsidianterracottabrown.registerItemModel(Item.getItemFromBlock(obsidianterracottabrown));
		  obsidianterracottagreen.registerItemModel(Item.getItemFromBlock(obsidianterracottagreen));
		  obsidianterracottared.registerItemModel(Item.getItemFromBlock(obsidianterracottared));
		  obsidianterracottablack.registerItemModel(Item.getItemFromBlock(obsidianterracottablack));
		  
		  bedrockoakplanks.registerItemModel(Item.getItemFromBlock(bedrockoakplanks));
          bedrockbirchplanks.registerItemModel(Item.getItemFromBlock(bedrockbirchplanks));
          bedrockspruceplanks.registerItemModel(Item.getItemFromBlock(bedrockspruceplanks));
          bedrockjungleplanks.registerItemModel(Item.getItemFromBlock(bedrockjungleplanks));
          bedrockacaciaplanks.registerItemModel(Item.getItemFromBlock(bedrockacaciaplanks));
          bedrockdarkoakplanks.registerItemModel(Item.getItemFromBlock(bedrockdarkoakplanks));
          bedrockstone.registerItemModel(Item.getItemFromBlock(bedrockstone));
      	  bedrockandesite.registerItemModel(Item.getItemFromBlock(bedrockandesite));
      	  bedrockgranite.registerItemModel(Item.getItemFromBlock(bedrockgranite));
      	  bedrockdorite.registerItemModel(Item.getItemFromBlock(bedrockdorite));
          bedrockpolishedandesite.registerItemModel(Item.getItemFromBlock(bedrockpolishedandesite));
      	  bedrockpolishedgranite.registerItemModel(Item.getItemFromBlock(bedrockpolishedgranite));
      	  bedrockpolisheddorite.registerItemModel(Item.getItemFromBlock(bedrockpolisheddorite));
      	  bedrockcobble.registerItemModel(Item.getItemFromBlock(bedrockcobble));
      	  bedrockmossycobble.registerItemModel(Item.getItemFromBlock(bedrockmossycobble));
      	  bedrocksandstone.registerItemModel(Item.getItemFromBlock(bedrocksandstone));
          bedrockbricks.registerItemModel(Item.getItemFromBlock(bedrockbricks));
      	  bedrockendstone.registerItemModel(Item.getItemFromBlock(bedrockendstone));
      	  bedrockendstonebrick.registerItemModel(Item.getItemFromBlock(bedrockendstonebrick));
      	  bedrocknetherbrick.registerItemModel(Item.getItemFromBlock(bedrocknetherbrick));
      	  bedrocknetherrack.registerItemModel(Item.getItemFromBlock(bedrocknetherrack));
      	  bedrockpurpur.registerItemModel(Item.getItemFromBlock(bedrockpurpur));
      	  bedrockpurpurpillar.registerItemModel(Item.getItemFromBlock(bedrockpurpurpillar));
      	  bedrockquartzblock.registerItemModel(Item.getItemFromBlock(bedrockquartzblock));
      	  bedrocksandstonechiseled.registerItemModel(Item.getItemFromBlock(bedrocksandstonechiseled));
      	  bedrocksandstonesmooth.registerItemModel(Item.getItemFromBlock(bedrocksandstonesmooth));
      	  bedrockredsandstonechiseled.registerItemModel(Item.getItemFromBlock(bedrockredsandstonechiseled));
      	  bedrockredsandstonesmooth.registerItemModel(Item.getItemFromBlock(bedrockredsandstonesmooth));
      	  bedrockredsandstone.registerItemModel(Item.getItemFromBlock(bedrockredsandstone));
      	  bedrockstonebrick.registerItemModel(Item.getItemFromBlock(bedrockstonebrick));
      	  bedrockstonebrickcracked.registerItemModel(Item.getItemFromBlock(bedrockstonebrickcracked));
      	  bedrockstonebrickmossy.registerItemModel(Item.getItemFromBlock(bedrockstonebrickmossy));
      	  bedrockstonebrickchiseled.registerItemModel(Item.getItemFromBlock(bedrockstonebrickchiseled));
      	  bedrockterracotta.registerItemModel(Item.getItemFromBlock(bedrockterracotta));
		  bedrockterracottawhite.registerItemModel(Item.getItemFromBlock(bedrockterracottawhite));
		  bedrockterracottaorange.registerItemModel(Item.getItemFromBlock(bedrockterracottaorange));
		  bedrockterracottamagenta.registerItemModel(Item.getItemFromBlock(bedrockterracottamagenta));
		  bedrockterracottalightblue.registerItemModel(Item.getItemFromBlock(bedrockterracottalightblue));
		  bedrockterracottayellow.registerItemModel(Item.getItemFromBlock(bedrockterracottayellow));
		  bedrockterracottalime.registerItemModel(Item.getItemFromBlock(bedrockterracottalime));
		  bedrockterracottapink.registerItemModel(Item.getItemFromBlock(bedrockterracottapink));
		  bedrockterracottagray.registerItemModel(Item.getItemFromBlock(bedrockterracottagray));
		  bedrockterracottalightgray.registerItemModel(Item.getItemFromBlock(bedrockterracottalightgray));
		  bedrockterracottacyan.registerItemModel(Item.getItemFromBlock(bedrockterracottacyan));
		  bedrockterracottapurple.registerItemModel(Item.getItemFromBlock(bedrockterracottapurple));
		  bedrockterracottablue.registerItemModel(Item.getItemFromBlock(bedrockterracottablue));
		  bedrockterracottabrown.registerItemModel(Item.getItemFromBlock(bedrockterracottabrown));
		  bedrockterracottagreen.registerItemModel(Item.getItemFromBlock(bedrockterracottagreen));
		  bedrockterracottared.registerItemModel(Item.getItemFromBlock(bedrockterracottared));
		  bedrockterracottablack.registerItemModel(Item.getItemFromBlock(bedrockterracottablack));
		  
		  reinforcedironblock.registerItemModel(Item.getItemFromBlock(reinforcedironblock));
		  
		
	}

}
