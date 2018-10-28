package com.engine.entity.player;

import com.engine.entity.Entity;
import com.engine.utils.Location;

public class Player extends Entity{

		private double health;
		private double maxHealth;
		private double minHealth;
		
		private String name;
		private Location location;
		private double damage;
		private double speed;
		
		
		private boolean invulnerable;
		private boolean dead;

		/*
		 * Class pour le joueur, qui est le joueur pricipal
		 * est pilotable du jeu
		 */

		public Player() {
			this.health = 20.0;
			this.maxHealth = 20.0;
			this.minHealth = 0.0;
			
			this.name = "player";
			//TODO la Location
			
			this.damage = 0.0;
			this.speed = 1.0;
			
			this.invulnerable = false;
			this.dead = false;
		}
		
		public Player(String name) {
			this.health = 20.0;
			this.maxHealth = 20.0;
			this.minHealth = 0.0;
			
			this.name = name;
			//TODO la Location
			
			this.damage = 0.0;
			this.speed = 1.0;
			
			this.invulnerable = false;
			this.dead = false;
		}
		
		public Player(String name, int defaultHealth) {
			this.health = defaultHealth;
			this.maxHealth = defaultHealth;
			this.minHealth = 0.0;
			
			this.name = name;
			//TODO la Location
			
			this.damage = 0.0;
			this.speed = 1.0;
			
			this.invulnerable = false;
			this.dead = false;
		}
		
		@Override
		public double getHealth() {
			return health;
		}


		@Override
		public void setHealth(double health) {
			if(health > this.maxHealth)
				this.health = this.maxHealth;
			else if(health < minHealth)
				this.health = this.minHealth;
			else
				this.health = health;
			
		}


		@Override
		public double getLastDamage() {
			return damage;
		}


		@Override
		public void setDamage(double damage) {
			this.damage = damage;
			
			if(this.invulnerable == false)
				setHealth((this.health - this.damage));

			if(this.health <= this.minHealth)
				this.dead = true;
		}


		@Override
		public double getSpeed() {
			return speed;
		}


		@Override
		public void setSpeed(double speed) {
			this.speed = speed;
		}


		@Override
		public double getMaxHealth() {
			return maxHealth;
		}


		@Override
		public void setMaxHealth(double maxHealth) {
			this.maxHealth = maxHealth;
		}


		@Override
		public double getMinHealth() {
			return minHealth;
		}


		@Override
		public void setMinHealth(double minHealth) {
			this.minHealth = minHealth;
		}


		@Override
		public String getName() {
			return name;
		}


		@Override
		public void setName(String name) {
			this.name = name;
		}


		@Override
		public Location getLocation() {
			return location;
		}


		@Override
		public void setLocation(Location location) {
			this.location = location;
		}


		@Override
		public boolean isInvulnerable() {
			return invulnerable;
		}


		@Override
		public void setInvulnerable(boolean invulnerable) {
			this.invulnerable = invulnerable;
		}


		@Override
		public boolean isDead() {
			return dead;
		}


		@Override
		public void setDead(boolean dead) {
			this.dead = dead;
		}


}
