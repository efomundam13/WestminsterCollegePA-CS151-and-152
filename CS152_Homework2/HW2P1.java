
/**Programmer: Manny Fomundam
	 * Homework 2: Problem 1 (Programming Project 2, pg. 758)
	 * Making an InventoryItem class
	 * Date: 2/14/2022
	 **/

import java.util.*;

public class HW2P1 {

	class InventoryItem {

		private String name;
		private int uniqueItemID;
		
		public InventoryItem(String n, int uiID) { //sets id and mane
			name = n;
			this.uniqueItemID = uiID;
		}
		
		public String getName() { //gets name
			return name; 
        }    
		
        public int getUniqueItemID() {  //gets id
        	return uniqueItemID; 
        }       
		
        public String toString() { //change sthem to a string method
        	return String.format("(%s),%s", name, uniqueItemID);
        }
        
        public int comparedByName(InventoryItem object1, InventoryItem object2) {  //compares the objects by name
        	if(object1.getName().compareTo(object2.getName()) < 0)
        		return -1;
        	else if (object1.getName().compareTo(object2.getName()) == 0)
        		return 0;
        	else {
        		return 1;
        	}
        }
        
        public int comparedByID(InventoryItem object1, InventoryItem object2) { //compares the objects by id
        	if(object1.getUniqueItemID() < object2.getUniqueItemID())
        		return -1;
        	else if(object1.getUniqueItemID() == object2.getUniqueItemID())
        		return 0;
        	else {
        		return 1;
        	}
        }
        
		void compareByName() {
			comparedByName(null, null);
		}
		
		void compareByID() {
			comparedByID(null, null);
		}
	}
}
