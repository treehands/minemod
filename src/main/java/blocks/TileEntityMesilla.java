package blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntityMesilla extends TileEntity {
	
private int facingDirection;
	
	public int getFacingDirection()
    {
        return this.facingDirection;
    }
	
	public void setFacingDirection(int par1)
    {
        this.facingDirection = par1;
    }
	
}
