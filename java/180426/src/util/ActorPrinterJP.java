package util;

import vo.Actor;

public class ActorPrinterJP implements ActorPrinter{

	private Actor actor;
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public void print() {
		System.out.println("番号 : " + actor.getNo() + 
				" / 名前 : " + actor.getName() + 
				" / 年齢 : " + actor.getAge()
				);
	}
}
