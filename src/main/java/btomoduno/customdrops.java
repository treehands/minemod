package btomoduno;

import java.util.Random;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class customdrops
{
public static Random random;
public static int dropped;

@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
random = new Random();
dropped = random.nextInt(2) + 1; //DO NOT CHANGE THIS

if(event.entityLiving instanceof EntitySheep)
{
event.entityLiving.entityDropItem(new ItemStack(items.ModItems.chuleta), dropped);
}
}
}