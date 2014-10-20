package blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class TileEntitySmasher extends TileEntity {

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