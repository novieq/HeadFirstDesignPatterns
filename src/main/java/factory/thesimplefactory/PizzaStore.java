package factory.thesimplefactory;

public class PizzaStore {
    public SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }
    
    public void orderPizza() {
        /*Rather than keeping the object creation code here, it is moved to the factory. 
         * Otherwise this class wont be closed for modification*/
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza("CheesePizza");
        
        pizza.bake();
        pizza.box();
        pizza.cut();
    }
}
