package com.engine.gamemain;

import com.engine.utils.TatooLog;

public class TatooGame { //Main class to import in the main class of your game
	
	final static private boolean DEBUG = true;
	
	private static TatooLog tatooLog;
	
	public static void main(String[] arg) {
		
		tatooLog = new TatooLog(DEBUG);
		tatooLog.dispatch("première log a imprimer pour le test...");
		tatooLog.debugingDispatch("seconde pour le teste");
		tatooLog.dispatch("une dèrniere pour la route.");
		endGame();
	}
	
	public static TatooLog getMainTatooLog() {
		return tatooLog;
	}
	
	public static void endGame() { //a voir si on garde mais au moins faire un truc similaire. 
		getMainTatooLog().printLog();
	}
	/*
	 * OK on garde ça il servira de "stop" le jeu :)
	 */
	
	
}
