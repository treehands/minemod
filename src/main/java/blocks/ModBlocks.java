package blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public final class ModBlocks {
	public static Block oreblock;
	public static Block minablock;
	public static Block mesablock;
    public static void init(){
        oreblock = new oreblock();
       	minablock = new minablock(Material.rock).setBlockName("MinaBlock");
    	mesablock = new mesablock(Material.wood).setBlockName("MesaBlock");
        
   }
}
