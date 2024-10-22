public class Singer extends Person{
    private String bandName;

    public Singer(){}
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    String singing(){
        return "Singing method.";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBand name: "+this.bandName+"\n"+singing();
    }
}
