package models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Modelcerdo extends ModelBase
{
  //fields
    ModelRenderer morro;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer cejas;
    ModelRenderer orejai;
    ModelRenderer orejad;
    ModelRenderer head;
  
  public Modelcerdo()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      morro = new ModelRenderer(this, 16, 16);
      morro.addBox(-2F, 0F, -9F, 4, 3, 1);
      morro.setRotationPoint(0F, 12F, -6F);
      morro.setTextureSize(64, 32);
      morro.mirror = true;
      setRotation(morro, 0F, 0F, 0F);
      body = new ModelRenderer(this, 28, 8);
      body.addBox(-5F, -10F, -7F, 10, 16, 8);
      body.setRotationPoint(0F, 11F, 3F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg1.setRotationPoint(-3F, 18F, 7F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(3F, 18F, 7F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg3.setRotationPoint(-3F, 18F, -5F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg4.setRotationPoint(3F, 18F, -5F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      cejas = new ModelRenderer(this, 7, 8);
      cejas.addBox(-4F, -2F, -9F, 8, 1, 1);
      cejas.setRotationPoint(0F, 12F, -6F);
      cejas.setTextureSize(64, 32);
      cejas.mirror = true;
      setRotation(cejas, 0F, 0F, 0F);
      orejai = new ModelRenderer(this, 16, 9);
      orejai.addBox(4F, -2F, -6F, 2, 4, 1);
      orejai.setRotationPoint(0F, 12F, -6F);
      orejai.setTextureSize(64, 32);
      orejai.mirror = true;
      setRotation(orejai, 0F, 0F, 0F);
      orejad = new ModelRenderer(this, 16, 9);
      orejad.addBox(-6F, -2F, -6F, 2, 4, 1);
      orejad.setRotationPoint(0F, 12F, -6F);
      orejad.setTextureSize(64, 32);
      orejad.mirror = true;
      setRotation(orejad, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -8F, 8, 8, 8);
      head.setRotationPoint(0F, 12F, -6F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    morro.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    cejas.render(f5);
    orejai.render(f5);
    orejad.render(f5);
    head.render(f5);
  }
  
	public void renderModel(float f)
	{
		morro.render(f);
		cejas.render(f);
		orejai.render(f);
		orejad.render(f);
		body.render(f);
		leg1.render(f);
		leg2.render(f);
		leg3.render(f);
		leg4.render(f);
		head.render(f);
	}


  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
      float f6 = (180F / (float)Math.PI);
      this.head.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.head.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.morro.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.morro.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
	  this.cejas.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.cejas.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
	  this.orejai.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.orejai.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
	  this.orejad.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.orejad.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.body.rotateAngleX = ((float)Math.PI / 2F);
      this.leg1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
      this.leg2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
      this.leg3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
      this.leg4.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
  }
}


