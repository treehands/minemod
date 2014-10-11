package items;

import lib.Constants;
import btomoduno.btomod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class botellavacia extends Item {
	private String name = "botellavacia";
	public botellavacia() {
	setUnlocalizedName(Constants.MODID + "_" + name);
	GameRegistry.registerItem(this, name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(btomod.tabName);
	}

}
