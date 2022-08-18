package builder;

public class Library {
    public static void main(String[] args) {
//        Books books = new Books("Aqata Kristinin Seçilmiş Əsərləri", "Aqata Kristi", 15);
//        System.out.println(books);
        Books bookBuilder = new BookBuilder().setName("Alovlu Qasırğa").setAuthor("Endryu Leyn").setPrice(20).getBooks();
        System.out.println(bookBuilder);
    }
}
