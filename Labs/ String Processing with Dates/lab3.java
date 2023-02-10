
public class lab3 {

	/** Manny Fomundam
	 * 09/17/2021
	 * Lab 3: String Processing with Dates
	 * Using the string process to change the date format from mm/dd/yyyy to dd/mm/yyyy
	 */
	
	public static void main(String[] args) {
	String date = "9/20/2021";
			
	int pos1 = date.indexOf("/");
	System.out.println("first index:"+pos1);
	int pos2 = date.indexOf("/",pos1+1);
	System.out.println("second index:"+pos2);
	
	String d=date.substring(pos1+1,pos2);
	String m=date.substring(0,pos1);
	String y=date.substring(pos2+1);
	
	y=date.substring(7,9);
	
	String newdate = d + "/" + m + "/" + y;
	System.out.print(newdate);
	}

}