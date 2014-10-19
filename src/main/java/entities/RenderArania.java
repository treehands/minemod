package entities;
import org.lwjgl.opengl.GL11;

import lib.Constants;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.ResourceLocation;

public class RenderArania extends RenderHorse {

	private static final ResourceLocation textureLocation = new ResourceLocation(Constants.MODID + ":" + "textures/models/arania.png");
public RenderArania(ModelSpider model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
{
    this.scaleSpider((EntityArania)par1EntityLivingBase, par2);
}
protected void scaleSpider(EntityArania par1EntityTest, float par2)
{
    GL11.glScalef(1.5F, 1.5F, 1.5F);
}
   
}