package blocks;

import org.lwjgl.opengl.GL11;

import lib.Constants;
import models.Modeldiana;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class dianaRenderer extends TileEntitySpecialRenderer
{
	private final Modeldiana model = new Modeldiana();
    private static final ResourceLocation texture = new ResourceLocation(Constants.MODID + ":" + "textures/models/diana.png");
    
    public void render(TileEntityDiana te, double x, double y, double z, float scale)
    {
    	GL11.glPushMatrix(); 	
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        this.bindTexture(texture);
        //Rotates model, as for some reason it is initially upside (180 = angle, 1.0F at end = about z axis)
        GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
        int facing = te.getFacingDirection();
        int k = 0;
        //South
        if (facing == 2) {
            k = 0;
        }
        //North
        if (facing == 3) {
            k = 180;
        }
        //East
        if (facing == 4) {
            k = -90;
        }
        //West
        if (facing == 5) {
            k = 90;
        }
        //Rotates model on the spot, depending on direction, making the front always to player) (k = angle, 1.0F in middle = about y axis)
        GL11.glRotatef(k, 0.0F, 1.0F, 0.0F);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}

    
    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
    	this.render((TileEntityDiana)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }
}