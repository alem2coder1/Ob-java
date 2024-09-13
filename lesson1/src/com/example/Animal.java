public String name;
public int age;
public boolean res;
public static class Animal(String name,int age) {
    this.name = name;
    if(age > 0){
        this.age = age;
        res = true;
    }

}
public void setPrice(double price){
this.price = price
}
public void method1(string a){
    a.setName("aray");
}
public void method2(){
   student b = new student();
    b.setName("nur")
}
class PassRef {
    public static void main(String[] args) {
        Pencil plainPencil = new Pencil("PLAIN");

        System.out.println("Original color: " + plainPencil.color);

        paintRed(plainPencil);
        System.out.println("New color: " + plainPencil.color);
    }

    public static void paintRed(Pencil p) {
        p.color = "RED";
        p = null;
    }
}
//Original color: PLAIN
//New color: RED
//class Pencil {
//    String color;
//    public Pencil(String color) {
//        this.color = color;
//    }
//}
//class Car {
//
//    String brand;
//    int year;
//
//
//    public Car(String brand, int year) {
//        this.brand = brand;
//        this.year = year;
//    }
//
//
//    public void displayInfo() {
//        System.out.println("Brand: " + brand + ", Year: " + year);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Car myCar = new Car("Toyota", 2021);
//
//
//        myCar.displayInfo();
//    }
//}