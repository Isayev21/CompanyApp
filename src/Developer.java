public class Developer extends Employee{
    public Developer(int id, int salary, String firstName, String lastName, String workDetail) {
        super(id, salary, firstName, lastName, workDetail);
    }

    @Override
    public void setSkills(String skills){
        System.out.println("Programming language knowledge, Teamwork");
    }

}
