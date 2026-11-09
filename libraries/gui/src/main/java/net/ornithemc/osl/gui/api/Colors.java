package net.ornithemc.osl.gui.api;

public abstract class Colors {
	public static final double MAX_ALPHA = 1;

	public static final Color WHITE = Colors.hex(0xffffff);
	public static final Color BLACK = Colors.hex(0x000000);

	static Color rgb(int r, int g, int b) {
		return rgba(r, g, b, MAX_ALPHA);
	}

	static Color hex(int hex) {
		return hexWithAlpha(hex, MAX_ALPHA);
	}

	static Color rgba(int r, int g, int b, double a) {
		// TODO
	}

	static Color hexWithAlpha(int hex, double a) {
		// TODO
	}
}
