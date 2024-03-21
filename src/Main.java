//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Order order1 = new Order(30); // Total harga pesanan $30
//
//        order1.setShippingStrategy(new StandardShipping());
//        System.out.println("Biaya Pengiriman Standar: $" + order1.calculateShippingCost());
//
//        order1.setShippingStrategy(new ExpressShipping());
//        System.out.println("Biaya Pengiriman Ekspres: $" + order1.calculateShippingCost());
//
//        order1.setShippingStrategy(new FreeShipping());
//        System.out.println("Biaya Pengiriman Gratis: $" + order1.calculateShippingCost());

//        Player yohsimitsu = new Player();
//        yohsimitsu.pushCross("flying kick");
//        yohsimitsu.pushTrianlge("sword");
//        Player paul = new Player();
//        paul.pushCross("lower kick");
//        paul.pushTrianlge("uppercut");
        Player yoshimitsu = new Player();
        yoshimitsu.pushCross(new FlyingKick());
        yoshimitsu.pushTrianlge(new SwordPunch());

        Player paul = new Player();
        paul.pushCross(new LowerKick());
        paul.pushTrianlge(new UppercutPunch());

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil contructor modelduck(FlyNoway)
        modelduck.setFlyBehavior((new FlyWithRocketPower()));
        modelduck.performFly();
    }
}