public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook();
        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        AdultUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount();
        adultUser1.requestBook();
        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();

    }// close main
}// close class
