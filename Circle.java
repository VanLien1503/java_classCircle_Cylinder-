package java_classCircle_Cylinder;

public class Circle {
    // tạo ra 2 thuộc tính
    private int radius ;
    private String color;

    // tạo constructor
public Circle(){

}
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double isArea(){
        return 2*radius*Math.PI;//Math.PI( kiểu double)
    }
}
