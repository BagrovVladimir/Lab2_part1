
package lab2_part1;

public class PostGgraduateStudent extends AllStudents{
    private String topicDisser;

    public PostGgraduateStudent(String name, Sex sex, String department, String topicDisser) {
        super(name, sex, department);
        setTopicDisser(topicDisser);
    }
    
    

    public String getTopicDisser() {
        return topicDisser;
    }

    public void setTopicDisser(String topicDisser) {
        if (topicDisser!=null && !topicDisser.trim().isEmpty()) {
             this.topicDisser = topicDisser;} 
        else {throw new IllegalArgumentException();}
    }

    @Override
    public String printAboutPerson() {
        return  getSex().getPronounRP()+" thesis title is "+topicDisser+".";
    }
    
    
    
}
