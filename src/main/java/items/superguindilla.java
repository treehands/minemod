package items;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

 
public class superguindilla extends Item {
private String name = "superguindilla";
public superguindilla() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + name);
setMaxDamage(100);
setCreativeTab(btomod.tabName);
}

public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
if(!target.worldObj.isRemote){
if(target instanceof EntityAnimal){
{
double calculatedX = -1 * (double) (-MathHelper.sin(target.rotationYaw/ 180.0F * (float) Math.PI)* MathHelper.cos(target.rotationPitch / 180.0F* (float) Math.PI) * 0.4f);
double calculatedZ = 1 * (double) (MathHelper.cos(target.rotationYaw / 180.0F * (float) Math.PI)* MathHelper.cos(target.rotationPitch / 180.0F* (float) Math.PI) * 0.4f);
double calculatedY = 20 * (double) (-MathHelper.sin((target.rotationPitch)/ 180.0F * (float) Math.PI) * 0.4f);

target.motionX = calculatedX;
target.motionY = calculatedY;
target.motionZ = calculatedZ;
itemstack.damageItem(1, player);
{player.worldObj.playSoundAtEntity(player, Constants.MODID + ":" + name, 0.4f, 1);}
}
}else{
{player.worldObj.playSoundAtEntity(player, Constants.MODID + ":" + "blop", 0.4f, 1);}

player.addChatMessage(new ChatComponentText("No Lamb,No Go!"));
}
}
return false;
}
public boolean hasEffect(ItemStack itemStack, int pass){return true;}
}