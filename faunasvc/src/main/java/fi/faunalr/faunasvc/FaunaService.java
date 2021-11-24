package fi.faunalr.faunasvc;

public class FaunaService {

    private static FaunaService uniqueInstance = new FaunaService();
    private FaunaService() {}

    public static FaunaService instance() {
        return uniqueInstance;
    }

    public String getServiceInfo () {
        return "Service Here";
    }

    /*
    public Duck getDuck (String type) {
        if (type.equals("rubber")) {
            return new RubberDuck();
        } else if (type.equals("red")) {
            return new RedheadDuck();
        }
        return new MallardDuck();
    }
*/


}
