package builder;

public class Library {
    public static void main(String[] args) {
        Books bookBuilder =BookBuilder.bookBuilder().setName("Alovlu Qasırğa").setAuthor("Endryu Leyn").setPrice(20).getBooks();
        System.out.println(bookBuilder);
    }
}
