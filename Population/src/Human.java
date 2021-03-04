
public class Human {
	
	String name;
	String haircolour;
	
	public Human(String name, String haircolour)
	{
		this.name = name;
		this.haircolour = haircolour;
	}
	
	public Human() {
		
	}
	
	String getHaircolour()
	{
		return this.haircolour;
	}

	public void setHaircolour(String colour) {
		this.haircolour = colour;
	}

}
