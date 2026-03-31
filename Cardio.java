
public class Cardio implements Machine{

	
	@Override
	public void use() {
		System.out.println("Cardio machine is being used to improve endurance");
	}
	
	
	@Override
	public Machine copy() {
		return new Cardio();
	}
	
}
