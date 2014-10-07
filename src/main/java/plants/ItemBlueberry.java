package plants;

import lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import btomoduno.btomod;


public class ItemBlueberry extends RecipeItemSeedFood 
{

    public ItemBlueberry() 
    {
        super(1, 0.3F, btomod.blockBlueberry, Blocks.farmland);
        setUnlocalizedName("blueberry");
        setTextureName(Constants.MODID + ":" + "arandano");
        setCreativeTab(CreativeTabs.tabFood);
    }
}

