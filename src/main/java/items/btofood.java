package items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class btofood extends ItemFood {
	 
	private String name = "btofood";
	public btofood(int heal, float saturation, boolean wolfMeat) {
	super(heal, saturation, wolfMeat);
	setUnlocalizedName(Constants.MODID + "_" + name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(CreativeTabs.tabFood);
	GameRegistry.registerItem(this, name);
	}
	}
