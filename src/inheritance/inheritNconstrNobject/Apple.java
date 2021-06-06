package inheritance.inheritNconstrNobject;

public class Apple extends Fruit{
	
	public Apple(){
		System.out.println("______________________________");
		System.out.println("Sub Class constructor invoked");
		System.out.println("Sub Class object  hashcode :  " + this.hashCode());
		System.out.println(this.hashCode() + " " + super.hashCode());
		System.out.println(this.getClass().getName() + " " + super.getClass().getName());
	}
	
  /*As we can see that both super class(Fruit) object hashcode and subclass(Apple) object hashcode are same,
	so only one object is created. This object is of class Apple(subclass) as when we try to print name of class 
	whose object is created, it is printing Apple which is subclass. */

}
