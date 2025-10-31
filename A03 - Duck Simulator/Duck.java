package headfirst.designpatterns.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
    WalkBehavior walkBehavior;
    SwimBehavior swimBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

    public void setSwimBehavior(SwimBehavior sb) { swimBehavior = sb; }

    public void setWalkBehavior(WalkBehavior wb) { walkBehavior = wb; }

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

    public void performSwim() { swimBehavior.swim(); }

    public void performWalk() { walkBehavior.walk(); }

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
