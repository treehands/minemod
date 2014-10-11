package items;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class lingote extends Item {
private String name = "lingote";
public lingote() {
setUnlocalizedName(Constants.MODID + "_" + name);
GameRegistry.registerItem(this, name);
setTextureName(Constants.MODID + ":" + name);
setCreativeTab(btomod.tabName);
}
}