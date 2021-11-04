
package lab2_part1;

public abstract class Person {
    private String name;
    private Sex sex;
    private String department;
    private String verb;

    public Person(String name, Sex sex, String department, String verb) {
        setName(name);
        setSex(sex);
        setDepartment(department);
        if (verb!=null && !verb.trim().isEmpty()) {
            this.verb=verb;} 
        else {throw new IllegalArgumentException();}
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.trim().isEmpty()) {
             this.name = name;} 
        else {throw new IllegalArgumentException();}       
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        if (sex!=null) {
             this.sex = sex;} 
        else {throw new IllegalArgumentException();} 
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department!=null && !department.trim().isEmpty()) {
             this.department = department;} 
        else {throw new IllegalArgumentException();}
    }

    public String getVerb() {
        return verb;
    }
    
    public void print(){
        System.out.println("This is "+name+". "+sex.getPronoun()
                +" "+verb+" at "+department+".");
        System.out.println(printAboutPerson());
    }
    
    public abstract String printAboutPerson();
    
    public static void printAll(Person[] persons){
        for (Person persona : persons) {
            persona.print();
            System.out.println();
        }
    }
            
 
}
