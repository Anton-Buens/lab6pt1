import java.util.Scanner;

public class Triangle {
    private String name;
    private double base;
    private double height;
    
    public Triangle() {
        this.name = "Unknown";
        this.base = 0.0;
        this.height = 0.0;
    }
    
    public Triangle(String inName, double inBase, double inHeight) {
        this.name = inName;
        this.base = inBase;
        this.height = inHeight;
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
        this.name = scanner.nextLine();
        System.out.println("What is the triangle's base");
        this.base = scanner.nextDouble();
        System.out.println("What is the triangle's height");
        this.height = scanner.nextDouble();
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setBase(double newBase) {
        this.base = newBase;
    }
    
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
    
    private double getArea() {
        return 0.5 * base * height;
    }
}

