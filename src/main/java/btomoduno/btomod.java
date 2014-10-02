package btomoduno;
import lib.Constants;
import items.ModItems;
import blocks.ModBlocks;
import blocks.TileBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = "btomoduno", name = "bTo Recipes+Blocks", version = "1.0.0")
public class btomod {
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	 ModBlocks.init();
    	 ModItems.init();
    	 TileBlocks.init();
    	 proxy.registerTileEntities();
 
    }
    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    
    	
    	//saddle
    	
    	ItemStack cueros = new ItemStack(Items.leather);
    	ItemStack hierro = new ItemStack(Items.iron_ingot);

    	GameRegistry.addRecipe(new ItemStack(Items.saddle), "xxx", "x x", "y y",
    	        'x', cueros, 'y', hierro);
    	
    	//disco11
    	
    	ItemStack obsidiana = new ItemStack(Blocks.obsidian);
    	ItemStack negro = new ItemStack(Items.dye,0,0);

    	GameRegistry.addRecipe(new ItemStack(Items.record_11), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', negro);
    	
    	//disco13
    	ItemStack amarillo = new ItemStack(Items.glowstone_dust);

    	GameRegistry.addRecipe(new ItemStack(Items.record_13), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', amarillo);
    	
    	//discocat
    	ItemStack verde1 = new ItemStack(Items.dye,0,2);

    	GameRegistry.addRecipe(new ItemStack(Items.record_cat), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', verde1);
    	
    	//discoblocks
    	ItemStack rosa1 = new ItemStack(Items.dye,0,9);

    	GameRegistry.addRecipe(new ItemStack(Items.record_blocks), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', rosa1);
    	
    	//discochirp
    	ItemStack rojo = new ItemStack(Items.dye,0,1);

    	GameRegistry.addRecipe(new ItemStack(Items.record_chirp), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', rojo);
    	
    	//discofar
    	ItemStack verde2 = new ItemStack(Items.dye,0,10);

    	GameRegistry.addRecipe(new ItemStack(Items.record_far), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', verde2);
    	
    	//discomall
    	ItemStack morado = new ItemStack(Items.dye,0,5);

    	GameRegistry.addRecipe(new ItemStack(Items.record_mall), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', morado);
    	
    	
    	//discomellohi
    	ItemStack rosa2 = new ItemStack(Items.dye,0,13);

    	GameRegistry.addRecipe(new ItemStack(Items.record_mellohi), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', rosa2);
    	
    	
    	//discostal
    	ItemStack gris = new ItemStack(Items.dye,0,8);

    	GameRegistry.addRecipe(new ItemStack(Items.record_stal), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', gris);
    	
    	
    	
    	//discosttrad
    	ItemStack blanco = new ItemStack(Items.dye,0,15);

    	GameRegistry.addRecipe(new ItemStack(Items.record_strad), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', blanco);
    	
    	
    	
    	//discoward
    	ItemStack cian = new ItemStack(Items.dye,0,6);

    	GameRegistry.addRecipe(new ItemStack(Items.record_ward), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', cian);
    	
    	
    	//discowait
    	ItemStack azul = new ItemStack(Items.dye,0,12);

    	GameRegistry.addRecipe(new ItemStack(Items.record_wait), " x ", "xyx", " x ",
    	        'x', obsidiana, 'y', azul);
    	



    	//slime ball
    	
    	ItemStack azucar = new ItemStack(Items.sugar);
    	ItemStack cactus = new ItemStack(Blocks.cactus);
    	ItemStack leche = new ItemStack(Items.milk_bucket);

    	GameRegistry.addRecipe(new ItemStack(Items.slime_ball), "yyy", "yxy", "yzy",
    	        'x', azucar, 'y', cactus,'z', leche);
    	
    	
    	//yerba
    	ItemStack tierra = new ItemStack(Blocks.dirt);
    	ItemStack yerba = new ItemStack(Items.wheat_seeds);

    	GameRegistry.addRecipe(new ItemStack(Blocks.grass), "xxx", "yyy", "yyy",
    	        'x', yerba, 'y', tierra);
    	
    	
    	//mibloque

    	ItemStack btofood = new ItemStack(items.ModItems.btofood);
    	ItemStack btoitem = new ItemStack(items.ModItems.btoitem);	
    	GameRegistry.addRecipe(new ItemStack(blocks.ModBlocks.btoblock), "xxx", "xyx", "xxx",
    	        'x', btofood, 'y', btoitem);
    	
    	
    	
    	 
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
}
