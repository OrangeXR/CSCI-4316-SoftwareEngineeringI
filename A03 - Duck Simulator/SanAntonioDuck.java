package headfirst.designpatterns.strategy;

public class SanAntonioDuck extends Duck {

    public SanAntonioDuck() {

        swimBehavior = new SwimWithFeet();
        flyBehavior = new FlyWithWings();
        walkBehavior = new WalkWithFeet();
        quackBehavior = () -> System.out.println("I quack at boats.");
    }

    public SanAntonioDuck(SwimBehavior swimBehavior, FlyBehavior flyBehavior, WalkBehavior walkBehavior,QuackBehavior quackBehavior) {
        this.swimBehavior = swimBehavior;
        this.flyBehavior = flyBehavior;
        this.walkBehavior = walkBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I'm a San Antonio duck");
    }
}
