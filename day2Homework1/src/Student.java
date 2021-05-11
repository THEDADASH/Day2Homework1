public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int studentNumber;

    public Student(int id,String firstName,String lastName,int studentNumber){
        this.setFirstName(firstName);
        this.setId(id);
        this.setStudentNumber(studentNumber);
        this.setLastName(lastName);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
