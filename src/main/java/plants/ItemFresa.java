package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
 
public class ItemFresa extends RecipeItemSeedFood {
 
// Constructors
public ItemFresa() {
super(1, 0.3F, btomod.blockFresa, Blocks.farmland);
this.setUnlocalizedName("fresa");
this.setTextureName(Constants.MODID + ":" + "fresa");
this.setCreativeTab(btomod.tabName);
 
}
 
}
