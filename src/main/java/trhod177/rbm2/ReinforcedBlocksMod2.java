package trhod177.rbm2;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trhod177.rbm2.creativetabs.RBM2CreativeTabItems;
import trhod177.rbm2.creativetabs.RBM2CreativeTabMisc;
import trhod177.rbm2.creativetabs.RBM2CreativeTabStone;
import trhod177.rbm2.creativetabs.RBM2CreativeTabTerracotta;
import trhod177.rbm2.creativetabs.RBM2CreativeTabWood;
import trhod177.rbm2.handlers.RBM2RecipeHandler;
import trhod177.rbm2.init.BlockInit;
import trhod177.rbm2.init.ItemInit;
import trhod177.rbm2.proxy.CommonProxy;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class ReinforcedBlocksMod2 {
	
	 
		public static final CreativeTabs RBM2WoodTab = new RBM2CreativeTabWood("BlockInit.ironoakplanks");
		public static final CreativeTabs RBM2StoneTab = new RBM2CreativeTabStone("BlockInit.ironstone");
		public static final CreativeTabs RBM2ItemTab = new RBM2CreativeTabItems("ItemInit.ironupgrade");
		public static final CreativeTabs RBM2TerracottaTab = new RBM2CreativeTabTerracotta("BlockInit.ironterracotta");
		public static final CreativeTabs RBM2MiscTab = new RBM2CreativeTabMisc("blockinit.reinforcedironblock");
		
		
		@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
		public static CommonProxy proxy;
		
		@Mod.Instance(References.MODID)
		public static ReinforcedBlocksMod2 instance;

		@Mod.EventBusSubscriber
		public static class RegistrationHandler {

			@SubscribeEvent
			public static void registerBlocks(RegistryEvent.Register<Block> event) {
				BlockInit.register(event.getRegistry());
				
			}
			

			@SubscribeEvent
			public static void registerItems(RegistryEvent.Register<Item> event) {
				ItemInit.register(event.getRegistry());
				BlockInit.registerItemBlocks(event.getRegistry());
				
			}
			
			@SubscribeEvent
			public static void registerModels(ModelRegistryEvent event) {
				ItemInit.registerModels();
				BlockInit.registerModels();
				
			}
			
			@SubscribeEvent
			public static void registerItems(ModelRegistryEvent event) {
				ItemInit.registerModels();
			}
			
			
			


	  
		}
		
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MODID + ":" + id, "inventory"));

		}
		
		
		
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {
			proxy.preInit(event);
			

		}
		
		@EventHandler
		public static void init(FMLInitializationEvent event) {
			proxy.init(event);
			Blocks.FIRE.setFireInfo(BlockInit.ironacaciaplanks, 5, 20);
			Blocks.FIRE.setFireInfo(BlockInit.ironoakplanks, 5, 20);
			Blocks.FIRE.setFireInfo(BlockInit.ironbirchplanks, 5, 20);
			Blocks.FIRE.setFireInfo(BlockInit.ironspruceplanks, 5, 20);
			Blocks.FIRE.setFireInfo(BlockInit.ironjungleplanks, 5, 20);
			Blocks.FIRE.setFireInfo(BlockInit.irondarkoakplanks, 5, 20);
			//OreDictionaryHandler.registerOreDictionary();
			RBM2RecipeHandler.registerCraftingBlocks();
			RBM2RecipeHandler.registerCraftingItems();
			RBM2RecipeHandler.registerSmelting();
			//NetworkRegistry.INSTANCE.registerGuiHandler(ReinforcedBlocksMod.instance, new GuiHandler());
		}
		
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {
			proxy.postInit(event);
		}

}
