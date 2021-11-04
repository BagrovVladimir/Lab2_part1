
package lab2_part1;

public class Student extends AllStudents{
    private Stage stage;
    private int course;

    public Student(String name, Sex sex, String department, Stage stage, int course) {
        super(name, sex, department);
        setStage(stage);
        setCourse(course);
    }
    
    

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        if (stage!=null) {
             this.stage = stage;} 
        else {throw new IllegalArgumentException();}
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course>0 && course<=6) {
           this.course=course; 
        } else {throw new ArrayIndexOutOfBoundsException();} 
    }

    @Override
    public String printAboutPerson() {
        return getSex().getPronoun()+" is "+course+"th year "+stage+" student.";
    }
    
    
    
    
}
