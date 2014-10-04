package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import lib.Constants;

public class granada extends Item
{
public granada()
{
this.setUnlocalizedName("granada");
this.setCreativeTab(CreativeTabs.tabCombat);
this.setTextureName(Constants.MODID + ":" + "granada");
}

public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
if (!par2World.isRemote)
{
/* This method in World spawn in an entity,
* You can use with anything that extends
* the Entity class, in this case it's
* the EntityGrenade class
*/
par2World.spawnEntityInWorld(new entidadgranada(par2World, par3EntityPlayer));
//Decrease an item from the stack because you used it!
 --par1ItemStack.stackSize;
} return par1ItemStack;
}

/**
 * Render Pass sensitive version of hasEffect()
 */
public boolean hasEffect(ItemStack par1ItemStack, int pass)
{
//This means it will look "special" in the inventory
return true;
}
}