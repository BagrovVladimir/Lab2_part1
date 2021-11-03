
package lab2_part1;

public class Lab2_part1 {

    public static void main(String[] args) {
        Person persona1= new Teacher("Ronald Turner", Sex.M, "Computer science", Deegree.PhD, "Programming paradigms");
        Person persona2= new Teacher("Ruth Hollings", Sex.F, "Jurisprudence", Deegree.MSc, "Domestic arbitation");
        
        Person persona3= new Student("Leo Wilkinson", Sex.M, "Computer science", Stage.Bachelor, 3);
        Person persona4= new Student("Anna Cunningham", Sex.F, "World economy", Stage.Bachelor, 1);
        Person persona5= new Student("Jill Lundqvist", Sex.F, "Jurisprudence", Stage.Master, 1);
        
        Person persona6= new PostGgraduateStudent("Ronald Correa", Sex.M, "Computer science", "Design of a functional programming language");
        
        Person[] persons={persona1, persona2, persona3, persona4, persona5, persona6};
        
        Person.printAll(persons);
    }
    
}
