package com.engine.graphics;


import javax.swing.JFrame;


public class Window extends JFrame{

	/**
	 * Class permettant de creer/gerer la fenetre afficher pour le jeu
	 */
	private static final long serialVersionUID = 1L;
	
	private String title = "TATOO ENGINE";
	private int x = 500, y = 400;
	private int closeOperation = EXIT_ON_CLOSE;

	public Window() {
		this.setTitle(this.title);
		this.setSize(this.x, this.y);
		this.setDefaultCloseOperation(this.closeOperation);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public Window(String title) {
		this.setTitle(title);
		this.setSize(this.x, this.y);
		this.setDefaultCloseOperation(this.closeOperation);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public Window(String title, int width, int heigth) {
		this.setTitle(title);
		this.setSize(width, heigth);
		this.setDefaultCloseOperation(this.closeOperation);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
