package blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import lib.Constants;

public class btoblock extends Block {
	
	   private String name = "btoblock";
	   private IIcon[] icons = new IIcon[6];
	   
	    public btoblock(){
	 
	        super(Material.rock);
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
	}
	
