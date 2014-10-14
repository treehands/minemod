package proxy;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
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
	RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelBiped(), 0.5F));
	
	}
}