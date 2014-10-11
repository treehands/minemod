package items;

import btomoduno.btomod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
 
public class panconmermelada extends ItemFood {
	 
	private String name = "panconmermelada";
	public panconmermelada(int heal, float saturation, boolean wolfMeat) {
	super(heal, saturation, wolfMeat);
	setUnlocalizedName(Constants.MODID + "_" + name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(btomod.tabName);
	GameRegistry.registerItem(this, name);

	}
	}