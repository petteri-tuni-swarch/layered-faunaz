package fi.faunalr.faunaduck;

public class MallardDuck extends Duck {

    public MallardDuck () {
        swimSpeed = 10;
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public String display() {
        String returnValue = "Here you see ";
        if (name.isEmpty()) {
            returnValue += "one of many Mallard Ducks";
        } else {
            returnValue += "the Mallard Duck " + name;
        }

        return returnValue;
    }

}
