package models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Modelmina extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
  
  public Modelmina()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 2, 49);
      Shape1.addBox(0F, 0F, 0F, 11, 1, 11);
      Shape1.setRotationPoint(-5F, 21F, -5F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 3, 1);
      Shape2.addBox(0F, 0F, 1F, 1, 2, 9);
      Shape2.setRotationPoint(7F, 22F, -5F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 3, 1);
      Shape3.addBox(0F, 0F, 1F, 1, 2, 9);
      Shape3.setRotationPoint(-7F, 22F, -5F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 6, 1);
      Shape4.addBox(0F, 0F, 0F, 13, 2, 13);
      Shape4.setRotationPoint(-6F, 22F, -6F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 52, 45);
      Shape5.addBox(0F, 0F, 0F, 1, 10, 1);
      Shape5.setRotationPoint(0F, 7F, 0F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 3, 44);
      Shape6.addBox(0F, 0F, 0F, 3, 1, 3);
      Shape6.setRotationPoint(-1F, 17F, -1F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 3, 44);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7.setRotationPoint(0F, 6F, 0F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 3, 1);
      Shape8.addBox(0F, 0F, 1F, 9, 2, 1);
      Shape8.setRotationPoint(-4F, 22F, -8F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 3, 1);
      Shape9.addBox(0F, 0F, 1F, 9, 2, 1);
      Shape9.setRotationPoint(-4F, 22F, 6F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 2, 49);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 7);
      Shape10.setRotationPoint(-6F, 21F, -3F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 2, 49);
      Shape11.addBox(0F, 0F, 0F, 7, 1, 1);
      Shape11.setRotationPoint(-3F, 21F, -6F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 3, 25);
      Shape12.addBox(0F, 0F, 0F, 9, 1, 5);
      Shape12.setRotationPoint(-4F, 20F, -2F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 3, 25);
      Shape13.addBox(0F, 0F, 0F, 5, 1, 9);
      Shape13.setRotationPoint(-2F, 20F, -4F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 3, 25);
      Shape14.addBox(0F, 0F, 0F, 7, 2, 7);
      Shape14.setRotationPoint(-3F, 19F, -3F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 4, 15);
      Shape16.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape16.setRotationPoint(-2F, 18F, -2F);
      Shape16.setTextureSize(64, 64);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 2, 49);
      Shape17.addBox(0F, 0F, 0F, 7, 1, 1);
      Shape17.setRotationPoint(-3F, 21F, 6F);
      Shape17.setTextureSize(64, 64);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 2, 49);
      Shape18.addBox(0F, 0F, 0F, 1, 1, 7);
      Shape18.setRotationPoint(6F, 21F, -3F);
      Shape18.setTextureSize(64, 64);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
  }



	public void renderModel(float f)
	{
		Shape1.render(f);
		Shape2.render(f);
		Shape3.render(f);
		Shape4.render(f);
		Shape5.render(f);
		Shape6.render(f);
		Shape7.render(f);
		Shape8.render(f);
		Shape9.render(f);
		Shape10.render(f);
		Shape11.render(f);
		Shape12.render(f);
		Shape13.render(f);
		Shape14.render(f);
		Shape16.render(f);
		Shape17.render(f);
		Shape18.render(f);
	}

  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
