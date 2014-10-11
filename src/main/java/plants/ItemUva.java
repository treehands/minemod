package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
 
public class ItemUva extends RecipeItemSeedFood {
 
// Constructors
public ItemUva() {
super(1, 0.3F, btomod.blockUva, Blocks.farmland);
this.setUnlocalizedName("uva");
this.setTextureName(Constants.MODID + ":" + "uva");
this.setCreativeTab(btomod.tabName);
 
}
 
}
