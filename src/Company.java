import java.lang.reflect.Field;
import java.util.ArrayList;

public class Company {
    private final int id;
    //public String name;
    private String phoneNumber;
    private String address;


    private ArrayList<Employee> employees= new ArrayList<>();


    public Company(int id, String phoneNumber, String address) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    public int getId() {
        return id;
    }

//   // public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addEmployees(ArrayList<Employee> employees) {
        this.employees.addAll(employees);
    }



    public void website(){
        System.out.println("Website of the company");
    }


}
