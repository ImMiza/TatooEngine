package com.engine.utils;

public class Vector2D {

	private double x, y;
	
	/*
	 * Class Vector permet de gerer les vectorielles des objets
	 */
	
	public Vector2D() { 
		setZero();
	}

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(Vector2D vector) {
        set(vector);
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void setZero() {
        this.x = 0;
        this.y = 0;
    }

    public double[] getComponents() {
        return new double[]{x, y};
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double getLengthSq() {
        return (x * x + y * y);
    }

    public double distanceSq(double vectorX, double vectorY) {
        vectorX -= this.x;
        vectorY -= this.y;
        return (vectorX * vectorX + vectorY * vectorY);
    }

    public double distanceSq(Vector2D vector) {
        double vx = vector.getX() - this.x;
        double vy = vector.getY() - this.y;
        return (vx * vx + vy * vy);
    }

    public double distance(double vectorX, double vectorY) {
    	vectorX -= x;
    	vectorY -= y;
        return Math.sqrt(vectorX * vectorX + vectorY * vectorY);
    }

    public double distance(Vector2D vector) {
        double vx = vector.getX() - this.x;
        double vy = vector.getY() - this.y;
        return Math.sqrt(vx * vx + vy * vy);
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public void add(Vector2D vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    public void subtract(Vector2D vector) {
        this.x -= vector.getX();
        this.y -= vector.getY();
    }

    public void subtract(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public static Vector2D subtract(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    public void multiply(double scalar) {
        x *= scalar;
        y *= scalar;
    }

    public void divide(double scalar) {
        x /= scalar;
        y /= scalar;
    }


    public double dot(Vector2D v) {
        return (this.x * v.x + this.y * v.y);
    }

    public double dot(double vx, double vy) {
        return (this.x * vx + this.y * vy);
    }

    public static double dot(Vector2D v1, Vector2D v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    public double cross(Vector2D v) {
        return (this.x * v.y - this.y * v.x);
    }

    public double cross(double vx, double vy) {
        return (this.x * vy - this.y * vx);
    }

    public static double cross(Vector2D v1, Vector2D v2) {
        return (v1.x * v2.y - v1.y * v2.x);
    }

    public double project(Vector2D v) {
        return (this.dot(v) / this.getLength());
    }

    public double project(double vx, double vy) {
        return (this.dot(vx, vy) / this.getLength());
    }

    public static double project(Vector2D v1, Vector2D v2) {
        return (dot(v1, v2) / v1.getLength());
    }

    public void rotateBy(double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        double rx = x * cos - y * sin;
        y = x * sin + y * cos;
        x = rx;
    }

    public void reverse() {
        x = -x;
        y = -y;
    }
    
    public boolean isZero() {
    	if(this.x == 0.0 && this.y == 0.0)
    		return true;
    	else
    		return false;
    }

    @Override
    public Vector2D clone() {
        return new Vector2D(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Vector2D) {
            Vector2D v = (Vector2D) obj;
            return (x == v.x) && (y == v.y);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector2D[" + x + ", " + y + "]";
}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
