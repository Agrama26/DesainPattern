//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Serangan Player 1 : ");
        Player yoshimitsu = new Player();
        yoshimitsu.kick = new FlyingKick();
        yoshimitsu.punch = new SwordPunch();
        yoshimitsu.pushCross();
        yoshimitsu.pushTriangle();

        System.out.println("\nSerangan Player 2 : ");
        Player Akatsuki = new Player();
        Akatsuki.kick = new LowerKick();
        Akatsuki.punch = new UppercutPunch();
        Akatsuki.pushCross();
        Akatsuki.pushTriangle();

        System.out.println("\nJenis Jenis Bebek : ");
        System.out.println("\nBebek 1 : ");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.display();

        System.out.println("\nBebek 2 :");
        Duck Read = new RedHeadDuck();
        Read.display();
        Read.performQuack();
        Read.swim();
        Read.performFly();

        System.out.println("\nBebek 3 :");
        Duck Wodden = new WoodenDuck();
        Wodden.display();
        Wodden.swim();
        Wodden.performFly();
        Wodden.performQuack();

        System.out.println("\nBebek 4 :");
        Duck Ber = new RubberDuck();
        Ber.display();
        Ber.swim();
        Ber.performQuack();

        System.out.println("\nBebek Mainan : ");
        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil contructor modelduck(FlyNoway)
        modelduck.setFlyBehavior((new FlyWithRocketPower()));
        modelduck.performFly();
        modelduck.performQuack();
        modelduck.setQuackBehavior((new Squeak()));
        modelduck.performQuack();
    }
}