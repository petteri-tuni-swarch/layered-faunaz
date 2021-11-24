package fi.faunalr.faunaduck;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected String name = "";
    protected int swimSpeed = 0;

    public abstract String display();

    // Generic behavior
    public String swim() {
        return "The swim speed is " + swimSpeed;
    }
    // Strategy pattern based behavior methods
    public String performFly() {
        return this.flyBehavior.fly();
    }
    public String performQuack() {
        return this.quackBehavior.quack();
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
