import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(132, "+99421212121", "California");
        HR appleEmp = new HR(3,2000, "John", "Cage", "HR","Teamwork");
        apple.addEmployee(appleEmp);
        System.out.println(appleEmp);
        apple.operatingSystem();
        apple.website();


        System.out.println("\n");
        Samsung samsung = new Samsung(34, "+9941212121212", "Korea");
        Developer samsungEmp = new Developer(4,2500,"Elnur", "Aliyev", "Developer","Programming knowledge");
        samsung.addEmployee(samsungEmp);
        System.out.println(samsungEmp);
        samsung.operatingSystem();
        samsung.website();


    }
}
