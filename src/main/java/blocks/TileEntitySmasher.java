package blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntitySmasher extends TileEntity {

    int tick = 0;

    public static final String publicName = "TileEntitySmasher";
    private String name = "TileEntitySmasher";

    public String getName() {

        return name;
    }

    @Override
    public void updateEntity() {

        if(!worldObj.isRemote) {

            tick++;
            if(tick == 100) {

                this.worldObj.setWorldTime(1000);
                tick = 0;
            }
        }
    }
}
