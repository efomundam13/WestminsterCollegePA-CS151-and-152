
/** Manny Fomundam
	 * 12/06/2021
	 * Lab 11: Inheritance Hierarchy
	 * Using multiple classes to output a college or professional team
	 */

public class Sport {
	
	private String sport;
	
	public Sport() {
		this.sport = "no sport";
	}
	
	public Sport(String theSport) {
		 if (theSport == null)
	        {
	             System.out.println("Fatal Error creating sport.");
	             System.exit(0);
	        }
	        sport = theSport;
	    }
	
	public Sport(Sport originalSport) {
		sport = originalSport.sport;
	}
	 
	public String getSport() 
	{
		return sport;
	}
	
	public void setSport(String newSport) {
		 if (newSport == null)
	        {
	             System.out.println("Fatal Error setting sport.");
	             System.exit(0);
	        }
	       else
	            sport = newSport;
	    }
	
	public String toString() {
		return "Sport: " + sport;
	}
	
	 public boolean equals(Sport otherSport) {
	        return (sport.equals(otherSport.sport));
	    }
	}
