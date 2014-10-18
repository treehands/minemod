package blocks;

import lib.Constants;
import btomoduno.btomod;
import blocks.TileEntityMina;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class dianablock extends BlockContainer {

	public dianablock()
	{
		super(Material.wood);
		this.setBlockTextureName(Constants.MODID + ":" + "diana"); 
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setCreativeTab(btomod.tabName);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TileEntityDiana(); 
	}
	
    public int getRenderType()
    {
    	return -1;
    }
    
    public boolean isOpaqueCube()
    {
    	return false;
    }

    public boolean renderAsNormalBlock()
    {
    	return false;
    }
    
    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack itemStack)
    {
        int facing = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        int newFacing = 0;
        if (facing == 0)
        {
        	newFacing = 2;
        }
        if (facing == 1)
        {
        	newFacing = 5;
        }
        if (facing == 2)
        {
        	newFacing = 3;
        }
        if (facing == 3)
        {
        	newFacing = 4;
        }
        TileEntity te = world.getTileEntity(i, j, k);
        if (te != null && te instanceof TileEntityDiana)
        {
        	TileEntityDiana tet = (TileEntityDiana) te;
            tet.setFacingDirection(newFacing);
            world.markBlockForUpdate(i, j, k);
        }
    }
}