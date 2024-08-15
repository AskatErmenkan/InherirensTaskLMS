//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Urmat", "Java");
        System.out.println(person.learn());
        System.out.println();


        Programmer programmer1 = new Programmer("Atai", "Java", "Peaksoft ");
        Programmer programmer2 = new Programmer("Adilet", "JS", "IT academ ");
        Programmer programmer3 = new Programmer("Babakhan", "Python", "Politeh");

        Dancer dancer1 = new Dancer("Nazik", "Kyrgyz byi", "Akshoola");
        Dancer dancer2 = new Dancer("Aygul", "Lezginka", "Akshoola");
        Dancer dancer3 = new Dancer("Raiana", "Andijanskaia polka", "Akshoola");
        
        Singer singer1 = new Singer("Gulnur", "Kyrgyz jeri", "Kyz Burak");
        Singer singer2 = new Singer("Elmirbek", "Suiuu", "Jebe");
        Singer singer3 = new Singer("Toktobek", "Atbashy", "Dostor");


        /// Programmer
        Programmer[] prog = {programmer1, programmer2, programmer3};
        for (Programmer programmer : prog) {
            System.out.println(programmer);

            System.out.println("    Method learn:               " + programmer.learn());
            System.out.println("    Method walk:                " + programmer.walk());
            System.out.println("    Metod eat:                  " + programmer.eat()) ;
            System.out.println("    Method codding:             " + programmer.codding());
        }
        System.out.println();


        /// Danser
        Dancer[] danc = {dancer1, dancer2, dancer3};
        for (Dancer dancer : danc) {
            System.out.println(dancer);

            System.out.println("    Method learn:               " + dancer.learn());
            System.out.println("    Method walk:                " + dancer.walk());
            System.out.println("    Metod eat:                  " + dancer.eat()) ;
            System.out.println("    Method dancing:             " + dancer.dancing());
        }
        System.out.println();



        /// Singer
        Singer[] sing = {singer1, singer2, singer3};
        for (Singer singer : sing) {
            System.out.println(singer);

            System.out.println("    Method learn:               " + singer.learn());
            System.out.println("    Method walk:                " + singer.walk());
            System.out.println("    Metod eat:                  " + singer.eat()) ;
            System.out.println("    Method codding:             " + singer.singer());
            System.out.println("    Method codding:             " + singer.playGitar());
        }








    }
}