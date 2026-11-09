package net.ornithemc.osl.gui.api;

public interface Color {
	Color withAlpha(double a);

	int red();

	int green();

	int blue();

	double alpha();

	int hexWithAlpha();
}
