import java.util.*;
class Cars{
    String brand;
    int model;
    String type;
    Cars(){
        brand="BMW";
        model=2008;
        type="V8";
    }
    void drive(){
        System.out.println("your car name is "+brand+"\n your car model is "+model+"\n your engine type is "+type);
    }
}
class car {
    public static void main(String[] args) {
        Cars s=new Cars();
        s.drive();
    }

    
}