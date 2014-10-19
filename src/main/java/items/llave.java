package items;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import entities.EntityArania;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
 
public class llave extends Item {
private String name = "llave";
public llave() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + "llave");
setCreativeTab(btomod.tabName);
}
public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
{
	if (!world.isRemote)
	{
			EntityArania ent = new EntityArania(world);
			ent.setLocationAndAngles(x, y + 1, z, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
			world.spawnEntityInWorld(ent);
			
			
			 --item.stackSize;
			} 
			
			
	return true;
}

public boolean hasEffect(ItemStack itemStack, int pass){return true;}
}