package plants;
 
import lib.Constants;
import btomoduno.btomod;
import plants.RecipeItemSeedFood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
 
public class ItemBlueberry extends RecipeItemSeedFood {
 
// Constructors
public ItemBlueberry() {
super(1, 0.3F, btomod.blockBlueberry, Blocks.farmland);
this.setUnlocalizedName("blueberry");
this.setTextureName(Constants.MODID + ":" + "arandano");
this.setCreativeTab(CreativeTabs.tabFood);
 
}
}
