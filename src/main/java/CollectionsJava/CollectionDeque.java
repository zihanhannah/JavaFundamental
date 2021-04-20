package CollectionsJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

class CollectionDeque {
    public static void main(String[] args) {
        Product p1 = new Food("Cake");
        Product p2 = new Drink("Tea");
        Product p3 = new Food("Cookie");
//        todo Deque FIFO,LIFO can add/delete element from both side(end and front)

        Deque<Product> menu = new ArrayDeque<>();
        Product nullProduct = menu.pollFirst();
        System.out.println(nullProduct);
//        add element in the front
        menu.offerFirst(p1);
        menu.offerFirst(p2);
//        add element in the end
        menu.offerLast(p3);
        for(Product p : menu){
            System.out.print(p.getName());
        }
        System.out.println();
//        .pollFirst() , .pollLast() remove elements from front or end
        Product tea = menu.pollFirst();

//        .peekFirst() .peekLast() get element at the head or tail, doing nothing with the element
        Product cake1 = menu.peekFirst();
        menu.removeIf(s-> s.getName().equals("Cookie"));

        Iterator<Product> iter = menu.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next().getName());
        }
    }
}
