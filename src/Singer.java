public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public String getName(){
        return super.getName();
    }
    public String getDesignation(){
        return super.getDesignation();
    }

    public String singer() {
        return (getName()+ " " + bandName + " " + getDesignation() + " " + "tobunda yrdait");
    }
    public String playGitar(){
        return (getName()+ " " + bandName + " " + getDesignation() + " " + "tobunda gitarada oinoit");
    }

    @Override
    public String toString() {
        return "Singer{" + super.toString() +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
