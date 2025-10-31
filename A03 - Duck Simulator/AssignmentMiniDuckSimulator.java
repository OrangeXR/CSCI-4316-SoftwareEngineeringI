package headfirst.designpatterns.strategy;

/*  Please submit the source code and outputs.
    San Antonio Duck, Mallard Duck, Decoy Duck, and Rubber Duck.
    Write a duck simulator using the strategy design pattern.

    - San Antonio Ducks can swim, fly, walk, and quack to boat.
    - Mallard Ducks can swim, fly, and quack.
    - Rubber ducks can squick and swim but cannot fly.
    - Decoy ducks cannot fly, cannot swim, and cannot quack.

    Each type of duck flies and quacks differently. ex) you can just print out
    "I am a Mallard Duck, I can fly with a wing",
    "I am a Mallard Duck, I can quack",
    “I am a Decoy Duck, I can't fly”,
    “I am a Rubber Duck, I can squick but I can’t quack.”,
    etc. */


public class AssignmentMiniDuckSimulator {
 
	public static void main(String[] args) {

        System.out.println("\n--===== Duck 1 =====--");
        Duck sanantonio = new SanAntonioDuck();
        sanantonio.display();
        sanantonio.performSwim();
        sanantonio.performFly();
        sanantonio.performWalk();
        sanantonio.performQuack();

        System.out.println("\n--===== Duck 2 =====--");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performSwim();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("\n--===== Duck 3 =====--");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();

        System.out.println("\n--===== Duck 4 =====--");
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performSwim();
        decoy.performQuack();



	}
}
