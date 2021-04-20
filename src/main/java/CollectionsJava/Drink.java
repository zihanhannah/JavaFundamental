package CollectionsJava;

class Product{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Food extends Product{

    public Food(String name) {
        super(name);
    }
}
class Drink extends Product{
    public Drink(String name) {
        super(name);
    }
}