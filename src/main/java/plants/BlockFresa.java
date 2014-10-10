package plants;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 

import java.util.ArrayList;
import java.util.Random;
 

import lib.Constants;
import btomoduno.btomod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
 
public class BlockFresa extends RecipeBlockCrops
{
 
public BlockFresa()
{
// Basic block setup
this.setBlockName("fresal");
this.setBlockTextureName(Constants.MODID + ":" + "fresa_stage_0");
 
}
 
// this is seed item for the crop
protected Item func_149866_i()
{
return btomod.fresa; // blueberry is a seed food item
}
 
// this is item harvested from crop
protected Item func_149865_P()
{
return btomod.fresa;
}
 
/**
* Returns the quantity of items to drop on block destruction.
*/
public int quantityDropped(Random p_149745_1_)
{
return 1;
}
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister p_149651_1_)
{
this.field_149867_a = new IIcon[8];
// seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
this.field_149867_a[0] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_0");
this.field_149867_a[1] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_0");
this.field_149867_a[2] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_1");
this.field_149867_a[3] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_1");
this.field_149867_a[4] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_2");
this.field_149867_a[5] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_2");
this.field_149867_a[6] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_3");
this.field_149867_a[7] = p_149651_1_.registerIcon(Constants.MODID + ":" + "fresa_stage_4");
 
}
}