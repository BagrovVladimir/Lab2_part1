
package lab2_part1;

public class Teacher extends Person{
    private Deegree deegree;
    private String specialnost;

    public Deegree getDeegree() {
        return deegree;
    }

    public Teacher(String name, Sex sex, String department, Deegree deegree, String specialnost) {
        super(name, sex, department, "teaches");
        setDeegree(deegree);
        setSpecialnost(specialnost);
    }
    
    

    public void setDeegree(Deegree deegree) {
        if (deegree!=null) {
             this.deegree = deegree;} 
        else {throw new IllegalArgumentException();}
    }

    public String getSpecialnost() {
        return specialnost;
    }

    public void setSpecialnost(String specialnost) {
        if (specialnost!=null && !specialnost.trim().isEmpty()) {
             this.specialnost = specialnost;} 
        else {throw new IllegalArgumentException();}
    }

    @Override
    public String printAboutPerson() {
        return getSex().getPronoun() + " has " + deegree + " in " + specialnost + ".";
       
    }
    
    
    
}
