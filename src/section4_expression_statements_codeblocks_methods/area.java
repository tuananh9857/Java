package section4_expression_statements_codeblocks_methods;

public class area {
	public static void main(String[] args) {
		System.out.println("Area of circle with radius = 5 is "+ area(5));
		System.out.println("Area of the rectangle with width = 3 and height = 5 is " + area(3,5));
		
	}

	public static double area (double radius) {
		double area = radius*radius*(Math.PI);
		return area;
	}
	public static double area (double x, double y) {
		double area = x*y;
		return area;
	}
}
