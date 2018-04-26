package util;

import vo.Actor;

public class ActorPrinterEN implements ActorPrinter {

	private Actor actor;
	
	public void print() {
		System.out.println("no : " + actor.getNo() + " / name : " + actor.getName() + " / age : " + actor.getAge());
	}
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
}
