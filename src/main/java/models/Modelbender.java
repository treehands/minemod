package models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Modelbender extends ModelBase
{
  //fields
    ModelRenderer cuello;
    ModelRenderer body;
    ModelRenderer righthand;
    ModelRenderer lefthand;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer headtop;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
    ModelRenderer ojos;
    ModelRenderer head;
  
  public Modelbender()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      cuello = new ModelRenderer(this, 24, 5);
      cuello.addBox(-1F, -2F, -1F, 2, 2, 2);
      cuello.setRotationPoint(0F, 0F, 0F);
      cuello.setTextureSize(64, 32);
      cuello.mirror = true;
      setRotation(cuello, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      righthand = new ModelRenderer(this, 48, 16);
      righthand.addBox(-0.5333334F, 10F, -1F, 1, 3, 2);
      righthand.setRotationPoint(-5F, 2F, 0F);
      righthand.setTextureSize(64, 32);
      righthand.mirror = true;
      setRotation(righthand, 0F, 0F, 0.1745329F);
      lefthand = new ModelRenderer(this, 54, 16);
      lefthand.addBox(-0.5F, 10F, -1F, 1, 3, 2);
      lefthand.setRotationPoint(5F, 2F, 0F);
      lefthand.setTextureSize(64, 32);
      lefthand.mirror = true;
      setRotation(lefthand, 0F, 0F, -0.1745329F);
      rightfoot = new ModelRenderer(this, 40, 0);
      rightfoot.addBox(-1F, 11F, -4F, 2, 1, 5);
      rightfoot.setRotationPoint(-2F, 12F, 0F);
      rightfoot.setTextureSize(64, 32);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0F, 0F);
      leftfoot = new ModelRenderer(this, 40, 0);
      leftfoot.addBox(-1F, 11F, -4F, 2, 1, 5);
      leftfoot.setRotationPoint(2F, 12F, 0F);
      leftfoot.setTextureSize(64, 32);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-1F, 0F, -1F, 2, 11, 2);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-1F, 0F, -1F, 2, 11, 2);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      headtop = new ModelRenderer(this, 24, 0);
      headtop.addBox(-2F, -10F, -2F, 4, 1, 4);
      headtop.setRotationPoint(0F, 0F, 0F);
      headtop.setTextureSize(64, 32);
      headtop.mirror = true;
      setRotation(headtop, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-1F, -2F, -1F, 2, 12, 2);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.1745329F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -1F, 2, 12, 2);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.1745329F);
      ojos = new ModelRenderer(this, 40, 6);
      ojos.addBox(-3F, -8F, -4F, 6, 3, 1);
      ojos.setRotationPoint(0F, 0F, 0F);
      ojos.setTextureSize(64, 32);
      ojos.mirror = true;
      setRotation(ojos, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-3F, -9F, -3F, 6, 7, 6);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    cuello.render(f5);
    body.render(f5);
    righthand.render(f5);
    lefthand.render(f5);
    rightfoot.render(f5);
    leftfoot.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    headtop.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    ojos.render(f5);
    head.render(f5);
  }
  
  public void renderModel(float f)
	{
    cuello.render(f);
    body.render(f);
    righthand.render(f);
    lefthand.render(f);
    rightfoot.render(f);
    leftfoot.render(f);
    rightleg.render(f);
    leftleg.render(f);
    headtop.render(f);
    rightarm.render(f);
    leftarm.render(f);
    ojos.render(f);
    head.render(f);
	}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  /**
   * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
   * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
   * "far" arms and legs can swing at most.
   */
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
      this.head.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.head.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.cuello.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.cuello.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.ojos.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
      this.ojos.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
      this.rightarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
      this.leftarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
      this.rightarm.rotateAngleZ = 0.0F;
      this.leftarm.rotateAngleZ = 0.0F;
      this.rightleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
      this.leftleg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
      this.rightleg.rotateAngleY = 0.0F;
      this.leftleg.rotateAngleY = 0.0F;
      
      this.righthand.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
      this.lefthand.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
      this.righthand.rotateAngleZ = 0.0F;
      this.lefthand.rotateAngleZ = 0.0F;
      this.rightfoot.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
      this.leftfoot.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
      this.rightfoot.rotateAngleY = 0.0F;
      this.leftfoot.rotateAngleY = 0.0F;

      float f6;
      float f7;

      if (this.onGround > -9990.0F)
      {
          f6 = this.onGround;
          this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
          this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.rightarm.rotateAngleY += this.body.rotateAngleY;
          this.leftarm.rotateAngleY += this.body.rotateAngleY;
          this.leftarm.rotateAngleX += this.body.rotateAngleY;
          f6 = 1.0F - this.onGround;
          f6 *= f6;
          f6 *= f6;
          f6 = 1.0F - f6;
          f7 = MathHelper.sin(f6 * (float)Math.PI);
          float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
          this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
          this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
          this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
          
          
          this.righthand.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.righthand.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.lefthand.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
          this.lefthand.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
          this.righthand.rotateAngleY += this.body.rotateAngleY;
          this.lefthand.rotateAngleY += this.body.rotateAngleY;
          this.lefthand.rotateAngleX += this.body.rotateAngleY;
          f6 = 1.0F - this.onGround;
          f6 *= f6;
          f6 *= f6;
          f6 = 1.0F - f6;
          f7 = MathHelper.sin(f6 * (float)Math.PI);
          this.righthand.rotateAngleX = (float)((double)this.righthand.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
          this.righthand.rotateAngleY += this.body.rotateAngleY * 2.0F;
          this.righthand.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
      }
            
  }

}
