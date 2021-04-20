package CollectionsJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class CollectionsHashSet {
    public static void main(String[] args) {
        Product p1 = new Food("Cake");
        Product p2 = new Drink("Tea");
        Product p3 = new Food("Cookie");
//      todo HashSet : only have unique value
        Set<Product> menu = new HashSet<>();
        menu.add(p1);
        menu.add(p2);
        menu.add(p1);
        menu.add(p3);
        menu.removeIf(s -> menu.contains(p2));
        boolean hasTea = menu.contains(p2);
        System.out.println(hasTea);
//        todo .remove() return a boolean value
        System.out.println(menu.remove(p1));
        Iterator<Product> iter = menu.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getName());
        }
    }


}
