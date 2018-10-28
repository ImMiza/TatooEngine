package com.engine.utils;

import com.engine.utils.enums.Direction;

public class Location {

	private double x;
	private double y;
	private Direction direction;
	private Vector2D vector;
	
	/*
	 * TODO faire la classe location
	 */
	
	public Location() {
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Vector2D getVector() {
		return vector;
	}

	public void setVector(Vector2D vector) {
		this.vector = vector;
	}
}
