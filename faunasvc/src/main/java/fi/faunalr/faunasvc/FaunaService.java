package fi.faunalr.faunasvc;

import fi.faunalr.faunaduck.Duck;
import fi.faunalr.faunaduck.MallardDuck;
import fi.faunalr.faunaduck.RedheadDuck;
import fi.faunalr.faunaduck.RubberDuck;

public class FaunaService {

    private static FaunaService uniqueInstance = new FaunaService();
    private FaunaService() {}

    public static FaunaService instance() {
        return uniqueInstance;
    }

    public String getServiceInfo () {
        return "Service Here";
    }

    public String getDuckInfo (String type) {
        Duck localDuck;
        if (type.equals("rubber")) {
            localDuck = new RubberDuck();
        } else if (type.equals("red")) {
            localDuck = new RedheadDuck();
        } else {
            localDuck = new MallardDuck();
        }
        String duckInfo = "Looks like: " +localDuck.display() + "\n";
        duckInfo += "Flies " +localDuck.performFly() + "\n";
        duckInfo += "Quacks " +localDuck.performQuack() + "\n";

        return duckInfo;
    }



}
