package items;

import lib.Constants;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

 
public class semilla extends Item {
private String name = "semilla";
public semilla() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + name);
setCreativeTab(CreativeTabs.tabFood);
}

public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
if (!par2World.isRemote)
{
 --par1ItemStack.stackSize;
} return par1ItemStack;
}

public boolean hasEffect(ItemStack par1ItemStack, int pass)
{
return true;
}


}