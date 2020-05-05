package java_classCircle_Cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(){
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double isVolume(){
        return this.isArea()*height;
    }
}
