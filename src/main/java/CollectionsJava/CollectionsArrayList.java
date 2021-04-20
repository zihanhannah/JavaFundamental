package CollectionsJava;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class CollectionsArrayList {
    public static void main(String[] args) {
        Product p1 = new Food("Cake");
        Product p2 = new Drink("Tea");
//         todo List ArrayList
//         if want to creat a List for primitive, need to use the wrapper class. Object only
        List<Product> menu = new ArrayList<>(2);
        menu.add(p1);
        menu.add(p2);
//         in the list we can add null into it.
        menu.add(2, null);
        menu.add(3,p1);

//         .add() p1 will be added at the index of 2, null will be changed to the index of 3
        menu.add(2,p1);
        for(Product p : menu){
            System.out.print(p + " ");
        }
        System.out.println();
//         .set() will set the value at index of 3 from null to p2.
        menu.set(3,p2);
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();

        menu.remove(0);
//         .remove(p2) will remove the first p2 in this list
        menu.remove(p2);
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
//         .contains() returns boolean value
        boolean hasTea = menu.contains(p2);
//         .indexOf() get the first location of certain object.
        int index = menu.indexOf(p1);
        int index1 = menu.indexOf(null);
        System.out.println(hasTea);
        System.out.println(index);
        System.out.println(index1);

//         this will set p1's Name as Cookie for p1, then all the p1 in List will change to "Cookie"
        menu.get(index).setName("Cookie");
        for(Product p: menu){
            System.out.print(p.getName() + " ");
        }
        System.out.println();

////       Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
//        menu.add(4,p2);

        Iterator<Product> iter = menu.iterator();
        while(iter.hasNext()){
            if(iter.next().getName().contains("Tea")){
                iter.remove();
                continue;
            }
////            todo tricky
//            if(iter.hasNext()){
//                System.out.println(iter.next().getName());
//            }
        }





    }
}
