import java.util.Scanner;
public class Triangle {
	private String name;
	private double base;
	private double height;
	public Triangle() {
		name = "Unknown";
		base = 0.0;
		height = 0.0;
	}
	public Triangle(String inName, double inBase, double inHeight) {
		.name = inName;
		base = inBase;
		height = inHeight;
	}
	public void writeOutput() {
		System.out.println("Triangle name is: " + name);
		System.out.println("Triangle base is: " + base);
		System.out.println("Triangle height is: " + height);
		System.out.printf("Triangle area is: %.1f%n", getArea());
	}
	public void readInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the triangle's name");
		name = scanner.nextLine();
		System.out.println("What is the triangle's base");
		base = scanner.nextDouble();
		System.out.println("What is the triangle's height");
		height = scanner.nextDouble();
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setBase(double newBase) {
		base = newBase;
	}
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	private double getArea() {
		return 0.5 * base * height;
	}
}
