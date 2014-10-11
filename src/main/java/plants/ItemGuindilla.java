package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
 
public class ItemGuindilla extends RecipeItemSeedFood {
 
// Constructors
public ItemGuindilla() {
super(1, 0.3F, btomod.blockGuindilla, Blocks.farmland);
this.setUnlocalizedName("guindilla");
this.setTextureName(Constants.MODID + ":" + "guindilla");
this.setCreativeTab(btomod.tabName);
 
}
 
}
