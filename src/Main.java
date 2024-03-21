//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Jenis Jenis Serangan : ");
        Player yoshimitsu = new Player();
        yoshimitsu.pushCross(new FlyingKick());
        yoshimitsu.pushTrianlge(new SwordPunch());

        Player paul = new Player();
        paul.pushCross(new LowerKick());
        paul.pushTrianlge(new UppercutPunch());

        System.out.println("\nJenis Jenis Bebek : ");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.display();

        System.out.println("\nBebek 2 : ");
        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil contructor modelduck(FlyNoway)
        modelduck.setFlyBehavior((new FlyWithRocketPower()));
        modelduck.performFly();


    }
}