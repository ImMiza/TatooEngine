package com.engine.utils.remote;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

	private List<Key> keyList;
	
	private Key right, up, left, down;
	
	/*
	 * Class permettant de gerer toutes les touches du claviers et de leurs actions
	 */
	public RemoteControl() {
		this.keyList = new ArrayList<Key>();
		
		this.right = new Key(39); // fleche droite
		this.up = new Key(38); // fleche up
		this.left = new Key(37); // fleche gauche
		this.down = new Key(40); // fleche bas
	}

	public Key getKeyRight() {
		return right;
	}

	public void setKeyRight(Key right) {
		this.right = right;
	}

	public Key getKeyUp() {
		return up;
	}

	public void setKeyUp(Key up) {
		this.up = up;
	}

	public Key getKeyLeft() {
		return left;
	}

	public void setKeyLeft(Key left) {
		this.left = left;
	}

	public Key getKeyDown() {
		return down;
	}

	public void setKeyDown(Key down) {
		this.down = down;
	}

	public List<Key> getKeyList() {
		return keyList;
	}
}
