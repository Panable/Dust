package com.entropy.game.entity;

import java.awt.Graphics;
import java.util.Random;

import com.entropy.game.level.Level;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();

	public void update() {	
	}
	
	public void render(Graphics g) {
	}
	
	public void remove() {
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}

}
