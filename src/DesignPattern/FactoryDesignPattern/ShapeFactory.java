package DesignPattern.FactoryDesignPattern;

public class ShapeFactory {

	public Shape createShape(String type) {
		if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (type.equalsIgnoreCase("circle") ) {
			return new Circle();
		}else {
		throw new IllegalArgumentException("Invalid Shape Type");
	}
		}
	
}
