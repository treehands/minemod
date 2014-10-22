package items;
import java.util.List;

import lib.Constants;
import btomoduno.btomod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class pito2 extends Item {
private String name = "pito2";
public pito2() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + name);
setCreativeTab(btomod.tabName);
}
@Override
public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
{
if (!world.isRemote)
{
for (final Object obj : world.loadedEntityList)
{
if (obj instanceof entities.EntityEscorpion)
{
final entities.EntityEscorpion child = (entities.EntityEscorpion) obj;
{
child.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
if (child.isRiding())
{
child.ridingEntity.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
}
}
}

}
}
return itemStack;
}
@Override
public void registerIcons(IIconRegister IIconRegister)
{
itemIcon = IIconRegister.registerIcon(Constants.MODID + ":" + name);
}
}