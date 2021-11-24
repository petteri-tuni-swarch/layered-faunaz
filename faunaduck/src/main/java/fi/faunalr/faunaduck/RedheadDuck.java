package fi.faunalr.faunaduck;

public class RedheadDuck extends Duck {

    public RedheadDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();

        swimSpeed = 13;
    }

    public String display() {
        String returnValue = "Here you see ";
        if (name.isEmpty()) {
            returnValue += "one of many Redhead Ducks";
        } else {
            returnValue += "the Redhead Duck " + name;
        }

        return returnValue;
    }

}
