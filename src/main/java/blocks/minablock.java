package blocks;

import lib.Constants;
import btomoduno.btomod;
import blocks.TileEntityMina;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class minablock extends BlockContainer {

	protected minablock(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setBlockTextureName(Constants.MODID + ":" + "mina");   
		this.setCreativeTab(btomod.tabName);
		
	}
		
		public int getRenderType (){
			return -1;
		}
	
		public boolean isOpaqueCube() {
			return false;
			
		}
			
		public boolean renderAsNormalBlock() {
				return false;
		
		}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return new TileEntityMina();
	}

}
