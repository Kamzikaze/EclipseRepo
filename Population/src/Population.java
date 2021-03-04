
public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human Kamilia = new Human();
		
		Kamilia.getHaircolour();
		Kamilia.setHaircolour("rainbow");
		
		Human humans[] = new Human[2];
		humans [0] = new Human("kamilia", "blue");
		humans [1] = new Human("kamilia2", "blue");
		try {
			humans [2] = new Human("kamilia3", "blue");
		} catch (IndexOutOfBoundsException e ) {
			// TODO: handle exception
		}
		
		System.out.println(humans.length);
		System.out.println("hello");

	}

}
