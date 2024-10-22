public class Person {
    private String name;
    private String designation;

    public Person(){}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    String learn(){
       return "Learn method.";
    }
    String walk(){
        return "Walk method.";
    }
    String eat(){
       return "Eat method.";
    }

    @Override
    public String toString() {
        return "Name        : "+getName()+
                "\nDesignation : "+getDesignation()
                +"\n"+learn()+"\n"+walk()+"\n"+eat();
    }
}
