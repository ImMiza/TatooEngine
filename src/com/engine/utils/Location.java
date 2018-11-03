package com.engine.utils;

import com.engine.utils.enums.Direction;

public class Location {

	private double x;
	private double y;
	private Direction direction;
	private Vector2D vector;

	public Location(double x, double y) {
		this.x = x;
		this.y = y;
		this.direction = Direction.STAY;
		this.vector = new Vector2D(0.0, 0.0);
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

	@Override
	public String toString() {
		return 	"X: " + getX() + "\n" + 
				"Y: " + getY() + "\n" + 
				"Direction: " + getDirection() + "\n" + 
				"Vecteur: " + getVector().toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Location) {
			Location loc = (Location) obj;
			return (this.getX() == loc.getX()) && (this.getY() == loc.getY())
					&& (this.getDirection() == loc.getDirection()) && (this.getVector().equals(loc.getVector()));
		}
		return false;
	}
}
