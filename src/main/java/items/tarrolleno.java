package items;

import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class tarrolleno extends ItemFood {
	private String name = "tarrolleno";
	public tarrolleno(int heal, float saturation, boolean wolfMeat) {
	super(heal, saturation, wolfMeat);
	setUnlocalizedName(Constants.MODID + "_" + name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(CreativeTabs.tabFood);
	GameRegistry.registerItem(this, name);

	}
}
	
