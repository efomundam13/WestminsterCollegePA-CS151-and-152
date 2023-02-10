
public class CollegeTeam extends Sport{

	public String CollegeName;
	public String NickName;
	public int TeamSize;
	
	public CollegeTeam () {
		super( );
		NickName = "no nickname";
		CollegeName = "no college team";
		TeamSize = 0;
	}
	
	public CollegeTeam (String theSport, String theNickName, int theTeamSize, String theCollegeName) {
		super(theSport);
		if ((theCollegeName.equals(null)) && (theNickName.equals(null)) && theTeamSize == 0){
            CollegeName = theCollegeName;
            NickName = theNickName;
            TeamSize = theTeamSize;
        }
        else {
            System.out.println(
                      "Fatal Error: creating an college team.");
            System.exit(0);
        }
	}
		
	public CollegeTeam(CollegeTeam originalSport)
    {
        super(originalSport);
        CollegeName = originalSport.CollegeName;
        NickName = originalSport.NickName;
        TeamSize = originalSport.TeamSize;
    }
	
	public String getNickName() {
		return NickName;	
	}
	
	public String getCollegeName () {
		return CollegeName;
		
	}
	
	public int getTeamSize() {
		return TeamSize;
	}
	
	public void setNickName(String NewNickName) {
		  if (NewNickName != null)
	             NickName = NewNickName;
	         else
	         {
	             System.out.println("Fatal Error: No nickname founded.");
	             System.exit(0);
	         }
	}
	
	public void setCollegeName(String NewCollegeName) {
		  if (NewCollegeName != null)
	            CollegeName = NewCollegeName;
	         else
	         {
	             System.out.println("Fatal Error: No college name founded.");
	             System.exit(0);
	         }
	     }
	
	public void setTeamSize(int NewTeamSize) {
		  if (NewTeamSize >= 0)
	             TeamSize = NewTeamSize;
	         else
	         {
	             System.out.println("Fatal Error: No Team Size.");
	             System.exit(0);
	         }
	     }

public String toString( ) {
    return (getSport() + " " + "College Name: " + CollegeName + "NickName: " + NickName + "TeamSize: " + TeamSize);
}

public boolean equals(CollegeTeam other) {
	return getSport().equals(other.getSport()) && CollegeName.equals(other.CollegeName) && NickName.equals(other.NickName) && TeamSize == other.TeamSize;
	}
}

