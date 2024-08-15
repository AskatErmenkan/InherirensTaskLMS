public class Programmer extends Person {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getName() {
        return super.getName();
    }

    public String getDesignation() {
        return super.getDesignation();
    }

    public String codding(){
        return (getName() + " " + companyName + " " + getDesignation() + " developer bolup ishteit");
    }



        @Override
        public String toString() {
            return "Programmer: " + super.toString() +
                    "companyName: " + companyName + '\'';
        }
    }

