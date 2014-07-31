package factory.thesimplefactory;

public class Pizza {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void bake() {
        System.out.println("Baking the "+name+"Pizza");
    }
    
    public void cut() {
        System.out.println("Cutting the "+name+"Pizza");
    }
    
    public void box() {
        System.out.println("Boxing the" +name+ "Pizza" );
    }
}
