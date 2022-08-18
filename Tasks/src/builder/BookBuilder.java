package builder;

public class BookBuilder {
    private String name;
    private String author;
    private int price;

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Books getBooks(){
        return new Books(name,author,price);
    }
}
