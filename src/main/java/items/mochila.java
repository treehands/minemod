package items;

import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class mochila extends Item {
	private String name = "mochila";
	public mochila() {
	setUnlocalizedName(Constants.MODID + "_" + name);
	GameRegistry.registerItem(this, name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(CreativeTabs.tabMaterials);
	}

}
