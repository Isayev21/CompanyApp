public class HR extends Employee{

    public HR(int id, int salary, String firstName, String lastName, String workDetail) {
        super(id, salary, firstName, lastName, workDetail);
    }

    @Override
    public void setSkills(String skills) {
        System.out.println("Employee Relations, Teamwork, Colloboration");
    }

}

