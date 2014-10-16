package items;

import btomoduno.btomod;
import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class mochila extends Item {
	private String name = "mochila";
	public mochila() {
	setUnlocalizedName(Constants.MODID + "_" + name);
	GameRegistry.registerItem(this, name);
	setTextureName(Constants.MODID + ":" + name);
	setCreativeTab(btomod.tabName);
	}

	
}
