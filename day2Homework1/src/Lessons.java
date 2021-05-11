public class Lessons {
    private int id;
    private String lessonName;

    public Lessons(int id,String lessonName){
        this.setId(id);
        this.setLessonName(lessonName);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
