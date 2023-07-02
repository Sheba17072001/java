package Method;

public class Shapes {
	  public static double areaOfTriangle(double base, double height) {
	        return 0.5 * base * height;
	    }
	    
	    public static double areaOfRectangle(double length, double breadth) {
	        return length * breadth;
	    }
	    
	    public static double areaOfCircle(double radius) {
	        return 3.14 * radius * radius;
	    }
	    
	    public static double areaOfSquare(double side) {
	        return side * side;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        double base = 5;
	        double height = 10;
	        double length = 8;
	        double breadth = 6;
	        double radius = 4;
	        double side = 3;
	        
	        double areaTriangle = areaOfTriangle(base, height);
	        double areaRectangle = areaOfRectangle(length, breadth);
	        double areaCircle = areaOfCircle(radius);
	        double areaSquare = areaOfSquare(side);
	        
	        System.out.println("Area of Triangle: " + areaTriangle);
	        System.out.println("Area of Rectangle: " + areaRectangle);
	        System.out.println("Area of Circle: " + areaCircle);
	        System.out.println("Area of Square: " + areaSquare);
	    

	}

}
