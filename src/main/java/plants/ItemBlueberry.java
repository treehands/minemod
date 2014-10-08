package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
 
public class ItemBlueberry extends RecipeItemSeedFood {
 
// Constructors
public ItemBlueberry() {
super(1, 0.3F, btomod.blockBlueberry, Blocks.farmland);
this.setUnlocalizedName("blueberry");
this.setTextureName(Constants.MODID + ":" + "arandano");
this.setCreativeTab(CreativeTabs.tabFood);
 
}
 
}
