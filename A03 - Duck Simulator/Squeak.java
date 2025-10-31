package headfirst.designpatterns.strategy;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("I can Squeak, but I can't quack.");
	}
}
