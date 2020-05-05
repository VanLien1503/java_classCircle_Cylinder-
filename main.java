package java_classCircle_Cylinder;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // tạo ra đối tượng circle
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập bán kính Circle");
        Circle circle=new Circle(scanner.nextInt(),"blue");
        System.out.println(circle.isArea());
        // nhầm lẫn giư đối tượng circle với class cirle;
        System.out.println("Nhập Bán chiều Cao Cylinder");
        Cylinder cylinder=new Cylinder(circle.getRadius(),circle.getColor(),scanner.nextInt());
        System.out.println(cylinder.isVolume());
    }
}
