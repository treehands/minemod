package items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
public class btofood extends ItemFood {
	 
	private String name = "btofood";
	public btofood(int heal, float saturation, boolean wolfMeat) {
	super(heal, saturation, wolfMeat);
	setUnlocalizedName(Constants.MODID + "_" + name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(CreativeTabs.tabFood);
	GameRegistry.registerItem(this, name);
	setPotionEffect(Potion.moveSpeed.id, 100, 0, 1.0F);

	}
	}
	
	
