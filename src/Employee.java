import java.util.ArrayList;

public class Employee {
    private final int id;
    private int salary;
    private  String firstName, lastName;
    private String workDetail;
    private String skills;


    private ArrayList<Equipment> equipments = new ArrayList<>();



    public Employee(int id, int salary, String firstName, String lastName, String workDetail,String skills) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workDetail = workDetail;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public int setSalary(){
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getWorkDetail() {
        return workDetail;
    }

    public void setWorkDetail(String workDetail) {
        this.workDetail = workDetail;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void addEquipment(Equipment equipment){
            this.equipments.add(equipment);
    }
    public void addEquipments(ArrayList<Equipment> equipments){
        this.equipments.addAll(equipments);
    }

    @Override
    public String toString(){
        return "Employee: " + firstName + " " + lastName + "\n ID: " + id + "\nwork: " + workDetail + "\nSkill: " + skills + " \nSalary " +this.salary + "$";
    }
}
