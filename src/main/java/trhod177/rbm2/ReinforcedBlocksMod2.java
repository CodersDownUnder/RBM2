package trhod177.rbm2;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
import trhod177.rbm2.proxy.CommonProxy;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class ReinforcedBlocksMod2 {
	
	 
		//public static final CreativeTabs reinforcedblocksmodtab = new ReinforcedBlocksModTab("BlockInit.reinforced_oak_planks");
		//public static final CreativeTabs reinforcedblocksmodtab2 = new ReinforcedBlocksModTab2("BlockInit.reinforced_oak_planks_strutless");
		//public static final CreativeTabs reinforcedblocksmoditemtab = new ReinforcedBlocksModItemTab("ItemInit.ObsidianReinforcement");
		
		@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
		public static CommonProxy proxy;
		
		@Mod.Instance(References.MODID)
		public static ReinforcedBlocksMod2 instance;

		@Mod.EventBusSubscriber
		public static class RegistrationHandler {

			@SubscribeEvent
			public static void registerBlocks(RegistryEvent.Register<Block> event) {
				//BlockInit.register(event.getRegistry());
			}
			

			@SubscribeEvent
			public static void registerItems(RegistryEvent.Register<Item> event) {
				//ItemInit.register(event.getRegistry());
				//BlockInit.registerItemBlocks(event.getRegistry());
				
			}
			
			@SubscribeEvent
			public static void registerModels(ModelRegistryEvent event) {
				//ItemInit.registerModels();
				//BlockInit.registerModels();
				
			}
			
			@SubscribeEvent
			public static void registerItems(ModelRegistryEvent event) {
				//ItemInit.registerModels();
			}
			
			
			


	  
		}
		
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MODID + ":" + id, "inventory"));

		}
		
		
		
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {
			proxy.preInit(event);
			//BlockInit.init();
			//BlockInit.register(); 

		}
		
		@EventHandler
		public static void init(FMLInitializationEvent event) {
			proxy.init(event);
			//OreDictionaryHandler.registerOreDictionary();
			//RecipeHandler.registerCraftingBlocks();
			//RecipeHandler.registerCraftingItems();
			//RecipeHandler.registerSmelting();
			//NetworkRegistry.INSTANCE.registerGuiHandler(ReinforcedBlocksMod.instance, new GuiHandler());
		}
		
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {
			proxy.postInit(event);
		}

}
