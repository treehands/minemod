package btomoduno;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == items.ModItems.briqueta){
			return 4000;
		}
		return 0;
	}

}