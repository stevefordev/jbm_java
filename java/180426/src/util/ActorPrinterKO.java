package util;

import vo.Actor;

/**
 * 배우의 데이터를 출력하는 기능을 가진 클래스
 * @author 9acer
 *
 */
public class ActorPrinterKO implements ActorPrinter{
	
	private Actor actor;
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public void print() {
		System.out.println("번호 : " + actor.getNo() + 
				" / 이름 : " + actor.getName() + 
				" / 나이 : " + actor.getAge()
				);
	}

}
