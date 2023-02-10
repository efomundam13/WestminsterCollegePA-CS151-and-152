
import java.util.ArrayList;
import java.util.Random;

public class HW4P4 <T> {
   protected ArrayList <T> items; // list of items in the box

   // default constructor
   public void Box() {
       items = new ArrayList<T>();
   }

   // adds a given item to the box
   public void addItem(T item) {
       items.add(item);
   }

   // checks if the box is empty or not
   public boolean isEmpty() {
       if (items.size() == 0) {
           return true;
       }
       return false;
   }

   // draws a random item from the box
   public T drawItem() {
       Random rnd = new Random();
       if (isEmpty()) {
    	   return null;
       }
       return items.get(rnd.nextInt(items.size()));
   }
}