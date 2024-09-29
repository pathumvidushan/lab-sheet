class Circle {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double computeArea() {
        return Math.PI * radius * radius;
    }

    
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class question5 {
    public static void main(String[] args) {
        
        double innerRadius = 5.0;  
        double outerRadius = 10.0; 

        
        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

    
        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();
        double shadedArea = outerArea - innerArea;

        
        System.out.println("Inner Circle Area: " + innerArea);
        System.out.println("Outer Circle Area: " + outerArea);
        System.out.println("Shaded Area (circular region): " + shadedArea);
    }
}
