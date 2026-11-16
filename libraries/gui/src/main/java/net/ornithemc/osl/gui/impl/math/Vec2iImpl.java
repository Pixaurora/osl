package net.ornithemc.osl.gui.impl.math;

import net.ornithemc.osl.gui.api.math.Vec2i;

public class Vec2iImpl implements Vec2i {
	private final int x;
	private final int y;

	public Vec2iImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int x() {
		return this.x;
	}

	@Override
	public int y() {
		return this.y;
	}
}
