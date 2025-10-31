package headfirst.designpatterns.strategy;

public class SwimNoWay implements SwimBehavior{
    public void swim(){ System.out.println("I can't swim, but I can float.");}
}
