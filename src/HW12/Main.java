package HW12;

public class Main {
    public static void main(String[] args) {
        Author jefferyDeaver = new Author("Джеффри", "Дивер");
        System.out.println(jefferyDeaver.getFirstName());
        System.out.println(jefferyDeaver.getLastName());

        Book extinct = new Book("Исчезнувший",  2010, jefferyDeaver);
        System.out.println(extinct.getBookName());
        System.out.println(extinct.getPublicationYear());
        System.out.println(extinct.getAuthor());

        extinct.setPublicationYear(2012);
        System.out.println(extinct.getPublicationYear() );
    }
}