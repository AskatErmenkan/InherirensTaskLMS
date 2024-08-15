public class Dancer extends Person{

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getName(){
        return super.getName();
    }
    public String getDesignation(){
        return super.getDesignation();
    }
//    public String getDancerLearn(){}
    public String dancing(){
        return (getName() + " " + groupName + " " + getDesignation() + " " + "tobunda byileit");
    }



    @Override
    public String toString() {
        return "Dancer{" +super.toString() +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
