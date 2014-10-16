package proxy;

import org.lwjgl.opengl.GL11;

import blocks.TileEntityMesa;
import blocks.TileEntityMina;
import blocks.mesaRenderer;
import blocks.minaRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import entities.EntityRobot;
import entities.EntityMendas;
import entities.EntityWalker;
import entities.RenderRobot;
import entities.RenderMendas;
import entities.RenderWalker;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityWalker.class, new RenderWalker(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityMendas.class, new RenderMendas(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelBiped(), 0.2F));
	TileEntitySpecialRenderer render = new minaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMina.class, render);
	TileEntitySpecialRenderer render2 = new mesaRenderer();
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMesa.class, render2);
	}
	
	public void registerTileEntitySpecialRenderer() {
			
		}
}