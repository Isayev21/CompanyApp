public class Samsung extends Company {

    public Samsung(int id, String phoneNumber, String address) {
        super(id, phoneNumber, address);
    }

    public void operatingSystem(){
        System.out.println("Operating system of Samsung: Android");
    }

    @Override
    public void website(){
        System.out.println("Website: samsung.com");
    }



}
