import java.util.*;
public class DisplayList {
    public static void displayList(List<Object> list){
        System.out.println(Arrays.toString(list.toArray())); 
    }
    
    public static void main(String[] args) {
    	List<Object> list = Arrays.asList("Grandpa", "Dad", "Son");
        displayList(list);
    }
}