package items;

import net.minecraft.item.Item;

public final class ModItems {

	public static Item btoitem;
	public static Item btofood;
	
	public static void init() {
		
		btoitem = new Itembto();
		btofood = new Itembtofood(4, 0.3f, false);
	}
}
