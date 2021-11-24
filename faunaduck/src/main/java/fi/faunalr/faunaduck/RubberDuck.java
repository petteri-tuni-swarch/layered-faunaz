package fi.faunalr.faunaduck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();

        swimSpeed = 2;
    }

    public String display() {
        String returnValue = "Here you see ";
        if (name.isEmpty()) {
            returnValue += "one of many funny Rubber Ducks";
        } else {
            returnValue += "the funny Rubber Duck " + name;
        }
        return returnValue;
    }
}
