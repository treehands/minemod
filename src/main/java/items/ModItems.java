package items;

import net.minecraft.item.Item;

public final class ModItems {

	public static Item trozocuero;
	public static Item btofood;
	public static Item harina;
	public static Item semilla;
	public static Item tirachinas;
	public static Item tiramobs;
	public static void init() {
		
		trozocuero = new trozocuero();
		harina = new harina();
		semilla = new semilla();
		tirachinas = new tirachinas();
		tiramobs = new tiramobs();
		btofood = new btofood(4, 0.3f, false);
	}
}
