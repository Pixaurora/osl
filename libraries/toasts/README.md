# Toasts API

The Toasts API provides utilities to submit and render notifications.

## Creating Custom Toasts

To make a custom toast, simply implement the toast interface.
```java
package net.ornithemc.osl.toasts.impl;

import net.ornithemc.osl.core.api.util.NamespacedIdentifier;
import net.ornithemc.osl.core.api.util.NamespacedIdentifiers;
import net.ornithemc.osl.gui.api.Colors;
import net.ornithemc.osl.gui.api.FinchGraphics;
import net.ornithemc.osl.text.api.TextComponent;
import net.ornithemc.osl.text.api.TextComponents;
import net.ornithemc.osl.toasts.api.Toast;
import net.ornithemc.osl.toasts.api.Visibility;

public class ExampleToast implements Toast {
	private static final NamespacedIdentifier BACKGROUND = NamespacedIdentifier.from("example-mod:toast");
	private static final TextComponent TITLE = TextComponents.literal("Hi from example mod!");

	private Visibility visibility = Visibility.SHOWN;

	@Override
	public void render(FinchGraphics gui) {
		gui.draw(BACKGROUND, 0, 0, 160, 32);
		gui.draw(TITLE, Colors.BLACK, 5, 5, true);
	}

	@Override
	public Visibility visibility() {
		return this.visibility;
	}

	@Override
	public void update(long visibleMs) {
		// Can do anything that requires UI ticks here.

		if (visibleMs > 5000) {
			this.visibility = Visibility.HIDDEN;
		}
	}

	@Override
	public int width() {
		return 160;
	}

	@Override
	public int height() {
		return 32;
	}
}

```

Then you can call `Toasts.submit(new ExampleToast())`

## Pausing Toast Display

If notifications will distract your users at an inopportune time or be missed, you can register an inhibitor with a simple condition.

```java
package com.example;

import net.ornithemc.osl.entrypoints.api.ModInitializer;
import net.ornithemc.osl.toasts.api.Toasts;

public class ExampleInitializer implements ModInitializer {
	@Override
	public void init() {
		Toasts.registerInhibitor(() -> !isBusy());
	}

	public static boolean isBusy();
}
```
