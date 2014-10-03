package items;

import net.minecraft.item.Item;

public final class ModItems {

	public static Item trozocuero;
	public static Item btofood;
	public static Item harina;
	
	public static void init() {
		
		trozocuero = new trozocuero();
		harina = new harina();
		btofood = new Itembtofood(4, 0.3f, false);
	}
}
