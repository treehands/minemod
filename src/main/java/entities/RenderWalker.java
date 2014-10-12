package entities;

import lib.Constants;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderWalker extends RenderBiped {

	private static final ResourceLocation textureLocation = new ResourceLocation(Constants.MODID + ":" + "textures/models/entityWalker.png");
public RenderWalker(ModelBiped model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}

}