package fi.faunalr.faunaduck;

/**
 * The Duck Simulator
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "=== Welcome to the Duck Simulator ===" );
        MallardDuck fred = new MallardDuck();
        //DuckOnTheStage(fred);
        DuckWithStrategy(fred);

        RedheadDuck ron = new RedheadDuck();
        ron.setName("Ronald");
        DuckWithStrategy(ron);

        RubberDuck bathie = new RubberDuck();
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
