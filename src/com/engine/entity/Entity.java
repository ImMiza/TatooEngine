package com.engine.entity;

import com.engine.utils.Location;

public abstract class Entity {

	/*
	 * Class pour toutes les entités du jeu "vivant"
	 * tel que le joueur, créature, etc...
	 */

	public abstract double getHealth();


	public abstract void setHealth(double health);


	public abstract double getLastDamage();


	public abstract void setDamage(double damage);


	public abstract double getSpeed();


	public abstract void setSpeed(double speed);

	
	public abstract double getMaxHealth();


	public abstract void setMaxHealth(double maxHealth);


	public abstract double getMinHealth();

	
	public abstract void setMinHealth(double minHealth);


	public abstract String getName();


	public abstract void setName(String name);

	
	public abstract Location getLocation();


	public abstract void setLocation(Location location);


	public abstract boolean isInvulnerable();


	public abstract void setInvulnerable(boolean invulnerable);


	public abstract boolean isDead();


	public abstract void setDead(boolean dead);

	
	public abstract void move(boolean move);
	
	
	public abstract boolean canMove();
}
