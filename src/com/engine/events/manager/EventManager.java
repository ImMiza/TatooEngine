package com.engine.events.manager;

import javax.swing.event.EventListenerList;

public class EventManager {

	private EventListenerList events;
	
	/*
	 * Class permettant de gerer et de centraliser les evenements
	 * pour pouvoir en creer plus facilement et de mieux les gerer
	 */
	
	public EventManager() {
		events = new EventListenerList();
	}

	public EventListenerList getEvents() {
		return events;
	}
}
