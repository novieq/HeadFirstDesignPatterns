package factory.thesimplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if(type.equals("CheesePizza")){
            return new CheesePizza();
        } else if(type.equals("PeperroniPizza")) {
            return new PeperroniPizza();
        } else {
            return null;
        }
        
    }
}
