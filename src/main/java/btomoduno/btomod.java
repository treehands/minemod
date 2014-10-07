package btomoduno;
import blocks.ModBlocks;
import lib.Constants;
import items.ModItems;
import plants.BlockBlueberry;
import plants.BlockFresa;
import plants.ItemBlueberry;
import plants.ItemFresa;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
 

@Mod(modid = "btomoduno", name = "bTo Chili Hunter", version = "1.0.0")

public class btomod {
 
	
	public final static Block blockBlueberry = new BlockBlueberry();
	public final static Item blueberry = new ItemBlueberry();
	public final static Block blockFresa = new BlockFresa();
	public final static Item fresa = new ItemFresa();
	
    @Mod.EventHandler
    
    
    public void preInit(FMLPreInitializationEvent event) {
    	
   	 GameRegistry.registerBlock(blockBlueberry, "blueberries");
   	 GameRegistry.registerItem(blueberry, "blueberry");
   	 GameRegistry.registerBlock(blockFresa, "fresal");
   	 GameRegistry.registerItem(fresa, "fresa");
   	 MinecraftForge.addGrassSeed(new ItemStack(blueberry), 2);
   	 MinecraftForge.addGrassSeed(new ItemStack(fresa), 2);
   	 ModBlocks.init();
   	 ModItems.init();
   	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.semilla), 6);
   	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.guindilla), 6);

    }
   
    
	
	
@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
public static CommonProxy proxy;

   
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new customdrops());
    	proxy.registerRenderThings();
    	proxy.registerSounds();
    	
    
    	
    	//saddle
    	
    	ItemStack cueros = new ItemStack(Items.leather);
    	ItemStack hierro = new ItemStack(Items.iron_ingot);

    	GameRegistry.addRecipe(new ItemStack(Items.saddle), "xxx", "x x", "y y",
    	        'x', cueros, 'y', hierro);
    	
    	   	
    	
    	//cuerozombi
    	
    	ItemStack cuerozombi = new ItemStack(items.ModItems.trozocuero);
        GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(items.ModItems.trozocuero,3), 0.1f);
    	GameRegistry.addRecipe(new ItemStack(Items.leather, 3), "xxx", "xxx", "xxx",
	      'x', cuerozombi);
    	
    	//harina
    	
    	GameRegistry.addSmelting(items.ModItems.semilla, new ItemStack(items.ModItems.harina,1), 0.1f);
    	
    	
    	//micomida

    	ItemStack guindilla = new ItemStack(items.ModItems.guindilla);	
    	ItemStack harina = new ItemStack(items.ModItems.harina);
    	ItemStack agua = new ItemStack(Items.water_bucket);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.btofood,9), "xxx", "yyy", " z ",
    	        'x', guindilla, 'y', harina, 'z', agua);
    	
    	//abono

    	ItemStack harina2 = new ItemStack(items.ModItems.harina);
    	GameRegistry.addRecipe(new ItemStack(Items.dye,0,15), "xxx", " x ", "xxx",
    	        'x', harina2);
    	
    	
  	
    		
    	//superguindilla
    	
    	ItemStack guindilla2 = new ItemStack(items.ModItems.guindilla);
    	ItemStack diamanteg = new ItemStack(Items.diamond);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.superguindilla), "xxx", "xyx", "xxx",
    	        'x', guindilla2, 'y', diamanteg);
    	
    	
    	
    	//chuleta asada
    	
    	GameRegistry.addSmelting(items.ModItems.chuleta, new ItemStack(items.ModItems.chuletaasada,1), 0.1f);
    	
    	
    	//semillas de guindillas
    	GameRegistry.addShapelessRecipe(new ItemStack(items.ModItems.semilla, 3), new Object[] {items.ModItems.guindilla});
    	
    	//polvozafiro
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(items.ModItems.polvozafiro, 2), new Object[] {items.ModItems.zafiro});

    	//lingote
    	
    	GameRegistry.addSmelting(items.ModItems.polvozafiro, new ItemStack(items.ModItems.lingote,1), 0.1f);
    	
    	//huevizador
    	
    	ItemStack lingote = new ItemStack(items.ModItems.lingote);
        GameRegistry.addRecipe(new ItemStack(items.ModItems.huevizador), " x ", "x x", "xxx",
	      'x', lingote);
        
    	//huevos
    	
    	ItemStack huevizador = new ItemStack(items.ModItems.huevizador);
    	ItemStack semilla = new ItemStack(items.ModItems.semilla);
    	ItemStack carnecerdo = new ItemStack(Items.porkchop);
    	ItemStack carnevaca = new ItemStack(Items.beef);
    	ItemStack carneoveja = new ItemStack(items.ModItems.chuleta);
    	ItemStack carnepollo = new ItemStack(Items.chicken);
    	
    	GameRegistry.addRecipe(new ItemStack(Items.spawn_egg,1,90), "zzz", "xyx", "zzz",
    	        'x', carnecerdo, 'y', huevizador, 'z', semilla);
    	GameRegistry.addRecipe(new ItemStack(Items.spawn_egg,1,92), "zzz", "xyx", "zzz",
    	        'x', carnevaca, 'y', huevizador, 'z', semilla);
    	GameRegistry.addRecipe(new ItemStack(Items.spawn_egg,1,91), "zzz", "xyx", "zzz",
    	        'x', carneoveja, 'y', huevizador, 'z', semilla);
    	GameRegistry.addRecipe(new ItemStack(Items.spawn_egg,1,93), "zzz", "xyx", "zzz",
    	        'x', carnepollo, 'y', huevizador, 'z', semilla);
    	
        
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
}


