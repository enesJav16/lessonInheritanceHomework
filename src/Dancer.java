public class Dancer extends Person{
    private String groupName;

    public Dancer(){}
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    String dancing(){
        return "Dancing method.";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nGroup name: "+this.groupName+"\n"+dancing();
    }
}
