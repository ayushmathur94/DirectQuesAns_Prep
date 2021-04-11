package abstractionInterfaceExample;

public class ClassFirstOneImpl  implements InterfaceFirstOne {

	@Override
	public void suvFeatures() {
		// TODO Auto-generated method stub
		System.out.println("suv Feature method from Interface First One");
	}

	
	public static void main(String[] args) {
		ClassFirstOneImpl class1st = new ClassFirstOneImpl();
		
		class1st.suvFeatures();
		
	}
	
}
