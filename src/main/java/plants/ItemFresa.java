package plants;

import lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import btomoduno.btomod;


public class ItemFresa extends RecipeItemSeedFood 
{

    public ItemFresa() 
    {
        super(1, 0.3F, btomod.blockFresa, Blocks.farmland);
        setUnlocalizedName("fresa");
        setTextureName(Constants.MODID + ":" + "fresa");
        setCreativeTab(CreativeTabs.tabFood);
    }
}

