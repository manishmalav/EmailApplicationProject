package emailapp;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Manish","Malav");


        em1.setAlternateEmail("mm@foodiepo.com");
        System.out.println("Alternate Email is: " + em1.getAlternateEmail());

        System.out.println();

        Email em2 = new Email("Dilesh","Nagar");

        em2.setAlternateEmail("dd@foodiepo.com");
        System.out.println("Alternate Email is: " + em2.getAlternateEmail());

        System.out.println(em1.getInfo());
     }
}
