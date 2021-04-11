package abstractionInterfaceExample.multipleInterfacesForOneClass;


/*  Java programming language does not allow you to extend more than one class, However you can implement more
    than one interfaces in your class. 
 */

/* Even though this class is only implementing the
 * interface InterfaceA2, it has to implement all the methods 
 * of InterfaceA1 as well because the interface InterfaceA2 extends InterfaceA1
 */



public class DriverImplementClass  implements InterfaceA2 {

	
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
		System.out.println("MethodOne of InterfaceA1");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
		System.out.println("MethodTwo of InterfaceA2");
	}

	
   public static void main(String[] args) {
	
	 //  InterfaceA2 dic = new DriverImplementClass();
	   
	   DriverImplementClass dicObj = new DriverImplementClass();
	   
	   dicObj.methodTwo();
	   dicObj.methodOne();
   }


}
