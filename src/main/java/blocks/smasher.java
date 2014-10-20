package blocks;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class smasher extends Block implements ITileEntityProvider{
	 
    private String name = "smasher";
 
    public smasher() {
 
        super(Material.rock);
        setBlockName(Constants.MODID + "_" + name);
        setBlockTextureName(Constants.MODID + ":" + "mesa");
        setCreativeTab(btomod.tabName);
        GameRegistry.registerBlock(this, name);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntitySmasher();
    }

    @Override
    public boolean hasTileEntity(int metadata) {

        return true;
    }
}