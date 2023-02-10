
public class ProfessionalTeam extends CollegeTeam{

	private String CityName;
	
	public ProfessionalTeam() {
		super( );
		CityName = "no city name";
	}

	public ProfessionalTeam(String theSport, String theNickName, String theCityName, int theTeamSize) {
	super (theSport, theNickName, theTeamSize, theCityName);
	if ((theCityName.equals(null)) && (theTeamSize == 0) && theNickName.equals(null) && theSport.equals(null))	{
        CityName = theCityName;
     }
     else
     {
         System.out.println("Fatal Error: creating a professional team with no existance.");
         System.exit(0);
     }
	}
	
	public ProfessionalTeam(ProfessionalTeam originalProfessionalTeam)	{
        super(originalProfessionalTeam);
		CityName = originalProfessionalTeam.CityName;
    }

	 public String getCityName( )	{
	        return CityName;
	    }
	 
	 public void setCityName(String NewCityName) {
		  if (NewCityName != null)
	             CityName = NewCityName;
	         else
	         {
	             System.out.println("Fatal Error: No city name founded.");
	             System.exit(0);
	         }
	}
	 
	 public String toString( )	{
	        return  (getCollegeName() + " " + getNickName() + " " + getCityName() + " " + getTeamSize() + " ");
	    }
	 
	 public boolean equals(ProfessionalTeam other)	{
	       return (getCollegeName().equals(other.getCollegeName()) && getNickName().equals(other.getNickName()) && getCityName().equals(getCityName()) && getTeamSize() == other.getTeamSize());
	    }
	}
