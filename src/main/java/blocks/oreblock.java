package blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.MinecraftForge;
import lib.Constants;

public class oreblock extends Block {
	   private String name = "oreblock";
	   private IIcon[] icons = new IIcon[6];
	   
	    public oreblock(){
	        super(Material.rock);
	        this.setHardness(3f); 
	        this.setResistance(30f);
	        this.setCreativeTab(CreativeTabs.tabBlock);
	        this.setBlockName(Constants.MODID + "_" + name);
	        this.setBlockTextureName(Constants.MODID + ":" + name);     
	        GameRegistry.registerBlock(this, name);
	    }
	    
	    @Override
	    public void registerBlockIcons(IIconRegister iconRegister) {
	        for (int i = 0; i < icons.length; i++) {
	            icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
	        }
	    }
	    @Override
	    public IIcon getIcon(int side, int meta) {
	        return icons[side];
	    }
	    
	    
	  //If the block's drop is an item.
        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return items.ModItems.zafiro;}
        //Sets the quantity dropped. it ranges from 4 to 1  
        public int quantityDropped(Random par1Random)
        {
            return par1Random.nextInt(4) + 1;
        }
	}
	
