public class StudentManager {
    public void addStudent(Student student){
        System.out.println("Öğrenci eklendi :"+ student.getFirstName());
    }

    public void removeStudent(Student student){
        System.out.println("Öğrenci silindi :"+ student.getFirstName());
    }

}
