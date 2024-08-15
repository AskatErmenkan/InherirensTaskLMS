public class Person {

    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String learn(){
        return (name + " Peaksoft houseta " + designation + " kursun okugan");
    }
    public String walk(){
        return (name + " Peaksoft houseka " + designation + " kursuna joo barat");
    }
    public String eat(){
        return (name + " Peaksoft houseta " + "kafeteriyde tyshtonot");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
