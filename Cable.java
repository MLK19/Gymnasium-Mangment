
public class Cable implements Machine{
	
	
@Override
public void use() {
	System.out.println("Cable machine is being used for Strngth exercises");
}

@Override
public Machine copy() {
	return new Cable();
}

}