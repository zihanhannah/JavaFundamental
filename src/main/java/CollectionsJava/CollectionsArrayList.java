package CollectionsJava;

import java.util.ArrayList;
import java.util.List;

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
class CollectionsArrayList {
    public static void main(String[] args) {
        Product p1 = new Food("Cake");
        Product p2 = new Drink("Tea");
//        todo if want to creat a List for primitive, need to use the wrapper class. Object only
        List<Product> menu = new ArrayList<>(2);
        menu.add(p1);
        menu.add(p2);
//        todo in the list we can add null into it.
        menu.add(2, null);
        menu.add(3,p1);

//        todo .add() p1 will be added at the index of 2, null will be changed to the index of 3
        menu.add(2,p1);
        for(Product p : menu){
            System.out.print(p + " ");
        }
        System.out.println();
//        todo .set() will set the value at index of 3 from null to p2.
        menu.set(3,p2);
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();

        menu.remove(0);
//        todo .remove(p2) will remove the first p2 in this list
        menu.remove(p2);
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
//        todo .contains() returns boolean value
        boolean hasTea = menu.contains(p2);
//        todo .indexOf() get the first location of certain object.
        int index = menu.indexOf(p1);
        int index1 = menu.indexOf(null);
        System.out.println(hasTea);
        System.out.println(index);
        System.out.println(index1);

//        todo!! this will set p1's Name as Cookie for p1, then all the p1 in List will change to "Cookie"
        menu.get(index).setName("Cookie");
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();

////       todo: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
//        menu.add(4,p2);


    }
}
