package com.engine.gamemain;

import com.engine.events.manager.EventManager;
import com.engine.graphics.Window;
import com.engine.utils.TatooLog;
import com.engine.utils.remote.RemoteControl;

public class TatooGame{ //Main class to import in the main class of your game
	
	final static private boolean DEBUG = true;
	
	private static TatooLog tatooLog;
	private static TatooGame instance;
	
	private Window window;
	private RemoteControl remoteControl;
	private EventManager eventManager;

	public void startGame() {
		this.remoteControl = new RemoteControl();
		this.window = new Window();
		this.eventManager = new EventManager();
		
		instance = this;
	}
	
	/*
	 * le startGame sera celui qui devra etre appeler dans les autres programme
	 * le main on le garde pour test les debug ;)
	 */
	
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


	public RemoteControl getRemoteControl() {
		return remoteControl;
	}


	public Window getWindow() {
		return window;
	}


	public static TatooGame getInstance() {
		return instance;
	}

	public EventManager getEventManager() {
		return eventManager;
	}

	public void setEventManager(EventManager eventManager) {
		this.eventManager = eventManager;
	}
	
	
}
