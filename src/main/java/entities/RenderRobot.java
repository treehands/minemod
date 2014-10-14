package entities;
import org.lwjgl.opengl.GL11;

import lib.Constants;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.ResourceLocation;

public class RenderRobot extends RenderBiped {

	private static final ResourceLocation textureLocation = new ResourceLocation(Constants.MODID + ":" + "textures/models/entityRobot.png");
public RenderRobot(ModelBiped model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
{
    this.scaleSpider((EntityRobot)par1EntityLivingBase, par2);
}
protected void scaleSpider(EntityRobot par1EntityRobot, float par2)
{
    GL11.glScalef(0.5F, 0.5F, 0.5F);
}
   
}