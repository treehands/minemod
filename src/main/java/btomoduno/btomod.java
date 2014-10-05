package btomoduno;
import lib.Constants;
import items.ModItems;
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
 
    @Mod.EventHandler
  
    public void preInit(FMLPreInitializationEvent event) {
    	
    	 ModItems.init();
    	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.semilla), 6);
    	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.guindilla), 6);
    	 
    }
   
@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
public static CommonProxy proxy;
 
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	
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
    	
    	
  	
    		
    	//superguindilla
    	
    	ItemStack guindilla2 = new ItemStack(items.ModItems.guindilla);
    	ItemStack diamanteg = new ItemStack(Items.diamond);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.superguindilla), "xxx", "xyx", "xxx",
    	        'x', guindilla2, 'y', diamanteg);
    	
    	
    	
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
}


