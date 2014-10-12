package proxy;

import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import entities.EntityWalker;
import entities.RenderWalker;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityWalker.class, new RenderWalker(new ModelBiped(), 0.5F));
	
    
}
}