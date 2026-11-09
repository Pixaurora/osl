package net.ornithemc.osl.toasts.api;

import net.ornithemc.osl.gui.api.FinchGraphics;

public interface Toast {
	void render(FinchGraphics gui);

	Visibility visibility();

	void update(long visibleMs);

	int width();

	int height();

	default int toastSlots() {
		return (int) Math.ceil((double) this.height() / 32);
	}
}
