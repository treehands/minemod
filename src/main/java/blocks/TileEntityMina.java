package blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityMina extends TileEntity {
	
	int tick = 0;

    public static final String publicName = "Antena";
    private String name = "Antena";
    public String getName() {

        return name;
    }

    @Override
    public void updateEntity() {
   
    	if(!worldObj.isRemote) {

            tick++;
            if(tick == 4000) {

            	this.worldObj.setSpawnLocation(xCoord, yCoord, zCoord);
            	tick = 0;
            	for (final Object obj : worldObj.loadedEntityList)
            	{
            	if (obj instanceof entities.EntityRobot)
            	{
            	final entities.EntityRobot child = (entities.EntityRobot) obj;
            	{
            	child.setLocationAndAngles(xCoord, yCoord+1, zCoord, 0F, 0F);
            	if (child.isRiding())
            	{
            	child.ridingEntity.setLocationAndAngles(xCoord, yCoord+1, zCoord, 0F, 0F);          	            	}
            	}
            	}
            	}
            	}
    			}
	}
}