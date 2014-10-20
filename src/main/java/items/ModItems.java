package items;

import net.minecraft.item.Item;

public final class ModItems {

	public static Item trozocuero;
	public static Item btofood;
	public static Item harina;
	public static Item semilla;
	public static Item superguindilla;
	public static Item chuleta;
	public static Item chuletaasada;
	public static Item zafiro;
	public static Item lingote;
	public static Item polvozafiro;
	public static Item huevizador;
	public static Item mochila;
	public static Item tarrolleno;
	public static Item tarrovacio;
	public static Item mermeladafresa;
	public static Item mermeladaarandano;
	public static Item panconmermelada;
	public static Item botellavacia;
	public static Item botellavino;
	public static Item tabasco;
	public static Item veneno;
	public static Item polvoveneno;
	public static Item zumoraro;
	public static Item botellaaceite;
	public static Item chip;
	public static Item robot;
	public static Item cerebro;
	public static Item pito;
	public static Item llave;
	public static Item briqueta;
	
	public static void init() {
		briqueta = new briqueta();
		llave = new llave();
		pito = new pito();
		cerebro = new cerebro();
		chip = new chip();
		robot = new robot();
		botellaaceite = new botellaaceite();
		zumoraro = new zumoraro();
		polvoveneno = new polvoveneno();
		veneno = new veneno();
		botellavacia = new botellavacia();
		tarrovacio = new tarrovacio();		
		mermeladafresa = new mermeladafresa();
		mermeladaarandano = new mermeladaarandano();
		mochila = new mochila();
		huevizador = new huevizador();
		trozocuero = new trozocuero();
		lingote = new lingote();
		polvozafiro = new polvozafiro();
		harina = new harina();
		zafiro = new zafiro();
		semilla = new semilla();
		superguindilla = new superguindilla();
		btofood = new btofood(4, 0.3f, false);
		botellavino = new botellavino(4, 0.3f, false);
		tabasco = new tabasco(1, 0.3f, false);
		chuleta = new chuleta(4, 0.3f, true);
		chuletaasada = new chuletaasada(8, 0.3f, true);
		panconmermelada = new panconmermelada(5, 0.3f, false);
		tarrolleno = new tarrolleno(8, 0.3f, true);
	}
}
