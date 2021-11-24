package fi.faunalr.faunaduck;

/**
 * The Duck Simulator
 */
public class AppDynamic
{
    public static void main( String[] args )
    {
        System.out.println( "=== Rubber Duck presents before ===" );

        RubberDuck bathie = new RubberDuck();
        DuckWithStrategy(bathie);

        System.out.println( "=== ... and after some tuning ===" );
        bathie.setFlyBehavior(new FlyRocketPowered());
        DuckWithStrategy(bathie);
    }

    private static void DuckWithStrategy (Duck duck) {
        System.out.println("--- " + duck.display());
        if (duck.performQuack().isEmpty()) {
            System.out.println("..sorry, I cannot quack");
        } else {
            System.out.println(duck.performQuack());
        }
        System.out.println(duck.swim());
        System.out.println(duck.performFly());
    }
}
