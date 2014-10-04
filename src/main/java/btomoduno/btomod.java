package btomoduno;
import lib.Constants;
import items.ModItems;
import items.entidadgranada;
import items.granada;
import blocks.ModBlocks;
import blocks.TileBlocks;
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
 

@Mod(modid = "btomoduno", name = "bTo Recipes+Blocks", version = "1.0.0")

public class btomod {
	public static Item granada;
 
    @Mod.EventHandler
  
    public void preInit(FMLPreInitializationEvent event) {
    	
    	 ModBlocks.init();
    	 ModItems.init();
    	 TileBlocks.init();
    	 proxy.registerTileEntities();
    	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.semilla), 8);
    	 granada = new granada();
    	 
    }
   
@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
public static CommonProxy proxy;
 
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	GameRegistry.registerItem(granada, granada.getUnlocalizedName());
    	EntityRegistry.registerModEntity(entidadgranada.class, "Granada", 4, this, 80, 3, true);

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
    	
    	GameRegistry.addSmelting(Items.wheat, new ItemStack(items.ModItems.harina,1), 0.1f);
    	
    	
    	//micomida

    	ItemStack semilla = new ItemStack(items.ModItems.semilla);
    	ItemStack manzana = new ItemStack(Items.apple);	
    	ItemStack harina = new ItemStack(items.ModItems.harina);
    	ItemStack leche2 = new ItemStack(Items.milk_bucket);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.btofood,9), "xxx", "zyz", "xox",
    	        'x', semilla, 'y', manzana, 'z', harina, 'o', leche2);
    	
    	
    	//tirachinas
    	
    	ItemStack palo = new ItemStack(Items.stick);
    	ItemStack cuerda = new ItemStack(Items.string);	
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.tirachinas), "xyx", " x ", " x ",
    	        'x', palo, 'y', cuerda);
    	
    	//tiramobs
    	
    	ItemStack palo2 = new ItemStack(Items.stick);
    	ItemStack diamante = new ItemStack(Items.diamond);	
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.tiramobs), "xyx", " x ", " x ",
    	        'x', palo2, 'y', diamante);
    	
    	
    	
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
}
