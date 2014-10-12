package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
 
public class ItemCebolla extends RecipeItemSeedFood {
 
// Constructors
public ItemCebolla() {
super(1, 0.3F, btomod.blockCebolla, Blocks.farmland);
this.setUnlocalizedName("cebolla");
this.setTextureName(Constants.MODID + ":" + "cebolla");
this.setCreativeTab(btomod.tabName);
 
}
 
}
