public class Main {

    public static void main(String[] args) {
        Student student1 =new Student(1,"Alperen","Ayaz",3232);
        Student student2 =new Student(2,"Erencan","Arslantaş",3131);
        Student student3 =new Student(3,"Tuna","Özen",3030);

        Student[] students = {student1,student2,student3};
        for (Student student:students) {
            System.out.println(student.getFirstName());
        }
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.removeStudent(student1);


        Lessons lessons1 =new Lessons(1,"Matematik");
        Lessons lessons2 = new Lessons(2,"Biyoloji");

        Lessons[] lessons = {lessons1,lessons2};
        for (Lessons lesson:lessons) {
            System.out.println(lesson.getLessonName());
        }
    }
}
