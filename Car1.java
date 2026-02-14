import java.util.Scanner;
class Car{
    int Speed;
    String brand;
    void show(){
        System.out.println(Speed+ "   " + brand);
    }
}
class Car1{
    public static void main(String[] args){
        Car c1 = new Car();
       
        c1.Speed=101;
        c1.brand="BMW";
        c1.show();
      
    }
}