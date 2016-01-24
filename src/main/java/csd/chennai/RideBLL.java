package csd.chennai;

public class RideBLL {
	
	public String Validate(Ride ride)
	{
		if(ride.getName().isEmpty())
		{
			return "Posting failed";
		}
		else
		{
		return "Posting was successful";
		}
	}

}
