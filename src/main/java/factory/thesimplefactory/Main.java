package factory.thesimplefactory;

public class Main {
    public static void main(String args[]) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza();
    }
}
