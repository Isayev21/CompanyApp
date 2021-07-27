import java.util.ArrayList;

public class Apple extends Company{


    public Apple(int id, String phoneNumber, String address) {
        super(id, phoneNumber, address);
    }

    public void operatingSystem(){
        System.out.println("Operating system of Apple: Ios");
    }

    @Override
    public void website(){
        System.out.println("Website: apple.com");
    }







}
