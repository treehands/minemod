package btomoduno;
import java.util.Random;

import items.ModItems;
import lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import plants.BlockBlueberry;
import plants.BlockCebolla;
import plants.BlockFresa;
import plants.BlockGuindilla;
import plants.BlockUva;
import plants.ItemBlueberry;
import plants.ItemCebolla;
import plants.ItemFresa;
import plants.ItemGuindilla;
import plants.ItemUva;
import proxy.CommonProxy;
import blocks.ModBlocks;
import blocks.TileBlocks;
import blocks.TileEntityDiana;
import blocks.TileEntityMina;
import blocks.TileEntitySilla;
import blocks.minablock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import entities.EntityRobot;
import entities.EntityArania;
import entities.EntityWalker;
import entities.EntityMendas;
 

@Mod(modid = "btomoduno", name = "bTo Chili Hunter", version = "1.0.0")


public class btomod {

	//creative tab	
	public static CreativeTabs tabName = new CreativeTabs("btotab")
	 {
	 public Item getTabIconItem()
	 {
	 return items.ModItems.superguindilla;
	 }
	 };

	//plantas
	public final static Block blockCebolla = new BlockCebolla();
	public final static Item cebolla = new ItemCebolla();
	public final static Block blockBlueberry = new BlockBlueberry();
	public final static Item blueberry = new ItemBlueberry();
	public final static Block blockFresa = new BlockFresa();
	public final static Item fresa = new ItemFresa();
	public final static Block blockUva = new BlockUva();
	public final static Item uva = new ItemUva();
	public final static Block blockGuindilla = new BlockGuindilla();
	public final static Item guindilla = new ItemGuindilla();
	
	//reg mobs and item eggs
	public static void registerEntity(Class entityClass, String name)
	{
	int entityID = EntityRegistry.findGlobalUniqueEntityId();
	long seed = name.hashCode();
	Random rand = new Random(seed);
	int primaryColor = rand.nextInt() * 16777215;
	int secondaryColor = rand.nextInt() * 16777215;

	EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	EntityRegistry.registerModEntity(entityClass, name, entityID, Constants.MODID, 64, 1, true);
	EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
	
	//proxy
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
	
	public static CommonProxy proxy;
	
	
	//PREINIT
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		
			
	   	proxy.registerSounds();
     	proxy.registerRenderers();
     	proxy.registerEntitySpawns();
     	
     registerEntity(EntityArania.class, "entityTest");
     registerEntity(EntityRobot.class, "entityRobot");
     registerEntity(EntityMendas.class, "entityMendas");
     registerEntity(EntityWalker.class, "entityWalker");
     GameRegistry.registerWorldGenerator(new WorldGeneratorbto(), 1);
   	 GameRegistry.registerBlock(blockCebolla, "cebollas");
   	 GameRegistry.registerItem(cebolla, "cebolla");
   	 GameRegistry.registerBlock(blockBlueberry, "blueberries");
   	 GameRegistry.registerItem(blueberry, "blueberry");
   	 GameRegistry.registerBlock(blockFresa, "fresal");
   	 GameRegistry.registerItem(fresa, "fresa");
   	 GameRegistry.registerBlock(blockUva, "vid");
   	 GameRegistry.registerItem(uva, "uva");
   	 GameRegistry.registerBlock(blockGuindilla, "guindillera");
   	 GameRegistry.registerItem(guindilla, "guindilla");
   	 MinecraftForge.addGrassSeed(new ItemStack(blueberry), 1);
   	 MinecraftForge.addGrassSeed(new ItemStack(fresa), 1);
   	 MinecraftForge.addGrassSeed(new ItemStack(uva), 1);
   	 MinecraftForge.addGrassSeed(new ItemStack(guindilla), 1);
   	 MinecraftForge.addGrassSeed(new ItemStack(cebolla), 1);
   	 ModBlocks.init();
   	 ModItems.init();
   	 TileBlocks.init();
   	 MinecraftForge.addGrassSeed(new ItemStack(items.ModItems.semilla), 3);

   	GameRegistry.registerBlock(blocks.ModBlocks.minablock, "mina");
   	GameRegistry.registerBlock(blocks.ModBlocks.mesablock, "mesa"); 
  	GameRegistry.registerBlock(blocks.ModBlocks.dianablock, "diana");
  	GameRegistry.registerBlock(blocks.ModBlocks.sillablock, "silla");
  	GameRegistry.registerTileEntity(TileEntityDiana.class, "dianatile");
  	GameRegistry.registerTileEntity(TileEntitySilla.class, "sillatile");
  	GameRegistry.registerTileEntity(TileEntityMina.class, "minatile");
   	 proxy.registerTileEntities();
   	 
   	 //fuel
   	GameRegistry.registerFuelHandler(new FuelHandler());
    }
	   	
  
	//INIT
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	
 	
    	
    	
    	//Custom drops
    	
    	MinecraftForge.EVENT_BUS.register(new customdrops());
    	
    	  	
    	//RECETAS
    	    	
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

    	ItemStack tabasco = new ItemStack(items.ModItems.tabasco);	
    	ItemStack harina = new ItemStack(items.ModItems.harina);
    	ItemStack agua = new ItemStack(Items.water_bucket);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.btofood,16), " x ", "yyy", " z ",
    	        'x', tabasco, 'y', harina, 'z', agua);
    	
    	//abono

    	ItemStack harina2 = new ItemStack(items.ModItems.harina);
    	GameRegistry.addRecipe(new ItemStack(Items.dye,3,15), "xxx", " x ", "xxx",
    	        'x', harina2);
    	
    	
  	
    		
    	//superguindilla
    	
    	ItemStack guindilla3 = new ItemStack(guindilla);
    	ItemStack diamanteg = new ItemStack(Items.diamond);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.superguindilla), "xxx", "xyx", "xxx",
    	        'x', guindilla3, 'y', diamanteg);
    	
    	
    	
    	//chuleta asada
    	
    	GameRegistry.addSmelting(items.ModItems.chuleta, new ItemStack(items.ModItems.chuletaasada,1), 0.1f);
    	
    	
    	//semillas de guindillas
    	GameRegistry.addShapelessRecipe(new ItemStack(items.ModItems.semilla, 3), new Object[] {guindilla});
    	
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
    	
        
    	//mermeladas
    	
    	GameRegistry.addSmelting(fresa, new ItemStack(items.ModItems.mermeladafresa,1), 0.1f);
    	GameRegistry.addSmelting(blueberry, new ItemStack(items.ModItems.mermeladaarandano,1), 0.1f);
    	
    	
    	//tarro vacio

    	ItemStack cristal = new ItemStack(Blocks.glass);	
    	ItemStack madera = new ItemStack(Blocks.wooden_slab);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.tarrovacio), "xxx", "y y", "yyy",
    	        'x', madera, 'y', cristal);
    	
   	    //Tarro lleno
    	ItemStack tarrovacio = new ItemStack(items.ModItems.tarrovacio);
    	ItemStack tarrolleno = new ItemStack(items.ModItems.tarrolleno);
    	ItemStack mermeladafresa = new ItemStack(items.ModItems.mermeladafresa);
    	ItemStack mermeladaarandano = new ItemStack(items.ModItems.mermeladaarandano);
    	
    	GameRegistry.addShapelessRecipe(tarrolleno,tarrovacio,mermeladafresa);
    	GameRegistry.addShapelessRecipe(tarrolleno,tarrovacio,mermeladaarandano);
    	
    	
    	//Tostada
    	ItemStack mermeladafresa2 = new ItemStack(items.ModItems.mermeladafresa);
    	ItemStack mermeladaarandano2 = new ItemStack(items.ModItems.mermeladaarandano);
    	ItemStack tostada = new ItemStack(items.ModItems.panconmermelada);
    	ItemStack pan = new ItemStack(Items.bread);
    	
    	GameRegistry.addShapelessRecipe(tostada,pan,mermeladafresa);
    	GameRegistry.addShapelessRecipe(tostada,pan,mermeladaarandano);
    	
    	
    	//botellavacia

    	ItemStack cristal2 = new ItemStack(Blocks.glass);	
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.botellavacia), " x ", "x x", "xxx",
    	        'x', cristal2);
    	
    	//botellavino

    	ItemStack botellavacia = new ItemStack(items.ModItems.botellavacia);
    	ItemStack uvas = new ItemStack(uva);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.botellavino), "xxx", "xyx", "xxx",
    	        'x', uvas, 'y', botellavacia );
    	
    	//tabasco
    	ItemStack botellavacia2 = new ItemStack(items.ModItems.botellavacia);
    	ItemStack guindilla4 = new ItemStack(guindilla);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.tabasco), "xxx", "xyx", "xxx",
    	        'x', guindilla4, 'y', botellavacia );

    
    	//polvovenenoso
    	
    	GameRegistry.addSmelting(Items.poisonous_potato, new ItemStack(items.ModItems.polvoveneno,1), 0.1f);
    	
    	//Veneno
    	ItemStack botellavacia3 = new ItemStack(items.ModItems.botellavacia);
    	ItemStack polvoveneno = new ItemStack(items.ModItems.polvoveneno);
    	ItemStack veneno = new ItemStack(items.ModItems.veneno);
    	
    	GameRegistry.addShapelessRecipe(veneno,botellavacia3,polvoveneno);
       	
    	
    	//zumo raro
    	ItemStack tarrolleno2 = new ItemStack(items.ModItems.tarrolleno);
    	ItemStack tabasco2 = new ItemStack(items.ModItems.tabasco);
    	ItemStack huevizador2 = new ItemStack(items.ModItems.huevizador);
    	ItemStack botellavino = new ItemStack(items.ModItems.botellavino);
    	ItemStack veneno2 = new ItemStack(items.ModItems.veneno);
    	ItemStack tostada2 = new ItemStack(items.ModItems.panconmermelada);
        GameRegistry.addRecipe(new ItemStack(items.ModItems.zumoraro), "xyx", "ozo", "pqp",
	      'x', tabasco2, 'y', botellavino, 'z', huevizador2, 'o', tostada2, 'p', veneno2, 'q', tarrolleno2);
   
    	//botellaaceite

    	ItemStack botellavacia4 = new ItemStack(items.ModItems.botellavacia);
    	ItemStack semillas = new ItemStack(items.ModItems.semilla);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.botellaaceite), "xxx", "xyx", "xxx",
    	        'x', semillas, 'y', botellavacia4 );
    
    	
    	//chip

    	ItemStack hierro2 = new ItemStack(Items.iron_ingot);
    	ItemStack redstone = new ItemStack(Items.redstone);
    	ItemStack lingote2 = new ItemStack(items.ModItems.lingote);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.chip), "xxx", "zyz", "xxx",
    	        'x', hierro2, 'y', lingote2 , 'z', redstone );
    	
    	
    	//cerebro

    	ItemStack carnuz = new ItemStack(Items.porkchop);
    	ItemStack chip = new ItemStack(items.ModItems.chip);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.cerebro), "xxx", "xyx", "xzx",
    	        'x', carnuz, 'y', chip , 'z', redstone );
    
    	
    	//robot

    	ItemStack cerebro = new ItemStack(items.ModItems.cerebro);
    	ItemStack chip2 = new ItemStack(items.ModItems.chip);
    	ItemStack hierro3 = new ItemStack(Items.iron_ingot);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.robot), " x ", "zyz", " z ",
    	        'x', cerebro, 'y', chip , 'z', hierro3 );
    	
    	//pito

    	ItemStack chip3 = new ItemStack(items.ModItems.chip);
    	ItemStack hierro4 = new ItemStack(Items.iron_ingot);
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.pito), "xxx", "xyx", "xxx",
    	        'x', hierro4, 'y', chip3 );
    	
    	
    	//diana

    	ItemStack cartel = new ItemStack(Items.sign);
    	ItemStack papel = new ItemStack(Items.paper);
    	ItemStack madera2 = new ItemStack(Blocks.wooden_slab);
    	GameRegistry.addRecipe(new ItemStack(blocks.ModBlocks.dianablock), "zzz", "yyy", " x ",
    	        'x', cartel, 'y', papel, 'z', madera2 );
    	
    	//llave

    	ItemStack cerebro2 = new ItemStack(items.ModItems.cerebro);
    	ItemStack huevo = new ItemStack(items.ModItems.huevizador);
    	ItemStack chip4 = new ItemStack(items.ModItems.chip);
    	ItemStack lingote3 = new ItemStack(items.ModItems.lingote);
    	
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.llave), "oxo", "oyo", "ozo",
    	        'x', cerebro2, 'y', huevo, 'z', chip4, 'o', lingote3 );
    	
    	
    	//briqueta

    	ItemStack madera3 = new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE);
    	ItemStack aceitillo = new ItemStack(items.ModItems.botellaaceite);
   	
    	GameRegistry.addRecipe(new ItemStack(items.ModItems.briqueta), "xxx", "xyx", "xxx",
    	        'x', madera3, 'y', aceitillo);
    	
    }
    
    
	//POSTINIT
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
    
}