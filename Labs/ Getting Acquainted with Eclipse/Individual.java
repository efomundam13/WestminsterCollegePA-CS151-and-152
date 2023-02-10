
public class Individual extends Sport {

	private String Name;
	
	public Individual() {
		Name = "no name";
	}
	
	public Individual(String theSport, String theName) {
		super(theSport);
		Name=theName;
		if (theName == null) {
             System.out.println("Fatal Error, can't find the person or person doesn't exist.");
             System.exit(0);
        }
        Name = theName;
    }
	
	public Individual(Individual originalSport) {
        super(originalSport);
        Name = originalSport.Name;
    }
	
	public String getName() {
		return Name;	
	}
	
	public void setName(String NewName) {
		 if (NewName == null)	{
	             System.out.println("Fatal Error setting new mname.");
	             System.exit(0);
	        }
	        else
	            Name = NewName;
	    }
	
	 public String toString( )	{
		 return getSport() + "Name: " + Name;
	 }
	 
	 public boolean equals(Individual other) {
		 return getSport().equals(other.getSport()) && Name.equals(other.Name);
	 }
}

