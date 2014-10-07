package items;

import net.minecraft.item.Item;

public final class ModItems {

	public static Item trozocuero;
	public static Item btofood;
	public static Item harina;
	public static Item semilla;
	public static Item guindilla;
	public static Item superguindilla;
	public static Item chuleta;
	public static Item chuletaasada;
	public static Item zafiro;
	public static Item lingote;
	public static Item polvozafiro;
	public static Item huevizador;
	public static Item mochila;
	public static void init() {
		
		mochila = new mochila();
		huevizador = new huevizador();
		trozocuero = new trozocuero();
		lingote = new lingote();
		polvozafiro = new polvozafiro();
		harina = new harina();
		zafiro = new zafiro();
		semilla = new semilla();
		guindilla = new guindilla();
		superguindilla = new superguindilla();
		btofood = new btofood(4, 0.3f, false);
		chuleta = new chuleta(6, 0.3f, true);
		chuletaasada = new chuletaasada(8, 0.3f, true);
	}
}
