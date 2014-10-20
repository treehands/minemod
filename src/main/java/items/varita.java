package items;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class varita extends Item {
	private String name = "varita";
	public varita() {
	setUnlocalizedName(Constants.MODID + "_" + name);
	GameRegistry.registerItem(this, name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(btomod.tabName);
	}
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10)

    {
    	if (world.isRemote)
        {
            return true;
        }
    	else if (par7 != 1)
        {
           return false;
        }
        else if(world.getBlock(x, y, z) == Blocks.dirt && world.isAirBlock(x, y+1, z))
        {
        	world.setBlock(x, y+1, z, blocks.ModBlocks.oreblock);
        	--par1ItemStack.stackSize;
        	return true;
        }
        else
        	return false;

    }

	
}
