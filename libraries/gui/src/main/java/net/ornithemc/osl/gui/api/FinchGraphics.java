package net.ornithemc.osl.gui.api;

import net.ornithemc.osl.core.api.util.NamespacedIdentifier;
import net.ornithemc.osl.text.api.TextComponent;

public interface FinchGraphics {
	void draw(NamespacedIdentifier texture, int x, int y, int width, int height, int textureX, int textureY, int textureWidth, int textureHeight, Color filter);

	default void draw(NamespacedIdentifier texture, int x, int y, int width, int height, int textureX, int textureY, int textureWidth, int textureHeight, double filterAlpha) {
		this.draw(texture, x, y, width, height, textureX, textureY, textureWidth, textureHeight, Colors.WHITE.withAlpha(filterAlpha));
	}

	default void draw(NamespacedIdentifier texture, int x, int y, int width, int height, int textureX, int textureY, int textureWidth, int textureHeight) {
		this.draw(texture, x, y, width, height, textureX, textureY, textureWidth, textureHeight, Colors.WHITE);
	}

	default void draw(NamespacedIdentifier texture, int x, int y, int width, int height, Color filter) {
		this.draw(texture, x, y, width, height, 0, 0, width, height, filter);
	}

	default void draw(NamespacedIdentifier texture, int x, int y, int width, int height, double filterAlpha) {
		this.draw(texture, x, y, width, height, 0, 0, width, height, filterAlpha);
	}

	default void draw(NamespacedIdentifier texture, int x, int y, int width, int height) {
		this.draw(texture, x, y, width, height, 0, 0, width, height);
	}

	void draw(TextComponent text, Color color, int x, int y, boolean isShadowed);
}
