package com.engine.utils.remote;

public class Key {

	private String name;
	private int keyCode;
	private KeyAction keyAction;
	
	
	/*
	 * Class representant une touche du clavier et de son action
	 */
	
	public Key(int keyCode) {
		this.name = "";
		this.keyCode = keyCode;
		this.keyAction = null;
	}
	
	public Key(String name, int keyCode) {
		this.name = name;
		this.keyCode = keyCode;
		this.keyAction = null;
	}
	
	public Key(String name, int keyCode, KeyAction action) {
		this.name = name;
		this.keyCode = keyCode;
		this.keyAction = action;
	}
	
	public Key(int keyCode, KeyAction action) {
		this.name = "";
		this.keyCode = keyCode;
		this.keyAction = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getkeyCode() {
		return keyCode;
	}

	public void setkeyCode(int keyCode) {
		this.keyCode = keyCode;
	}

	public KeyAction getKeyAction() {
		return keyAction;
	}

	public void setKeyAction(KeyAction keyAction) {
		this.keyAction = keyAction;
	}
	
}
