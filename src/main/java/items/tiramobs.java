package items;

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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

 
public class tiramobs extends Item {
private String name = "tiramobs";
public tiramobs() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + name);
setCreativeTab(CreativeTabs.tabCombat);
}

public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
if(!target.worldObj.isRemote){
if(target instanceof EntityMob){
{
double calculatedX = -1 * (double) (-MathHelper.sin(target.rotationYaw/ 180.0F * (float) Math.PI)* MathHelper.cos(target.rotationPitch / 180.0F* (float) Math.PI) * 0.4f);
double calculatedZ = 1 * (double) (MathHelper.cos(target.rotationYaw / 180.0F * (float) Math.PI)* MathHelper.cos(target.rotationPitch / 180.0F* (float) Math.PI) * 0.4f);
double calculatedY = 16 * (double) (-MathHelper.sin((target.rotationPitch)/ 180.0F * (float) Math.PI) * 0.4f);

target.motionX = calculatedX;
target.motionY = calculatedY;
target.motionZ = calculatedZ;

{player.worldObj.playSoundAtEntity(player, Constants.MODID + ":" + name, 0.4f, 1);}
}
}else{
Minecraft.getMinecraft().thePlayer.sendChatMessage("Only for Braaaiinss!");
}
}
return false;
}

}