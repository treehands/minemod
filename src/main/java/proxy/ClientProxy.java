package proxy;

import org.lwjgl.opengl.GL11;

import blocks.TileEntityDiana;
import blocks.TileEntityMesa;
import blocks.TileEntityMesilla;
import blocks.TileEntityMina;
import blocks.TileEntitySilla;
import blocks.dianaRenderer;
import blocks.mesaRenderer;
import blocks.mesillaRenderer;
import blocks.minaRenderer;
import blocks.sillaRenderer;
import models.Modelcerdo;
import models.Modelescorpion;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import entities.EntityCerdo;
import entities.EntityEscorpion;
import entities.EntityRobot;
import entities.EntityMendas;
import entities.EntityArania;
import entities.EntityWalker;
import entities.RenderCerdo;
import entities.RenderEscorpion;
import entities.RenderRobot;
import entities.RenderMendas;
import entities.RenderArania;
import entities.RenderWalker;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityCerdo.class, new RenderCerdo(new Modelcerdo(), 1.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityEscorpion.class, new RenderEscorpion(new Modelescorpion(), 1.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityArania.class, new RenderArania(new ModelSpider(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityWalker.class, new RenderWalker(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityMendas.class, new RenderMendas(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelBiped(), 0.2F));
	TileEntitySpecialRenderer render3 = new minaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMina.class, render3);
	TileEntitySpecialRenderer render2 = new mesaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa.class, render2);
	TileEntitySpecialRenderer render = new dianaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiana.class, render);
	TileEntitySpecialRenderer render4 = new sillaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySilla.class, render4);
	TileEntitySpecialRenderer render5 = new mesillaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesilla.class, render5);
	}
	
	public void registerTileEntitySpecialRenderer() {
			
		}
}