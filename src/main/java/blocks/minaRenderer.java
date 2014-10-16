package blocks;

import org.lwjgl.opengl.GL11;

import lib.Constants;
import models.Modelmina;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class minaRenderer extends TileEntitySpecialRenderer{

	private final static ResourceLocation texture = new ResourceLocation (Constants.MODID + ":" + "/textures/models/mina.png");
	
	private Modelmina model;
	
	public minaRenderer() {
		this.model = new Modelmina();
	}
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x,
			double y, double z, float f) {

		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();		
		GL11.glPopMatrix();
		
	}

}
