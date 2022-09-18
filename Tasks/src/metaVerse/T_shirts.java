package metaVerse;

public class T_shirts {
    private Gender gender;
    private String brand;
    private String body;
    private String colour;
    private int price;
    private Starred_Products starred_products;

    public T_shirts() {
    }

    public T_shirts(Gender gender, String brand, String body, String colour, int price, Starred_Products starred_products) {
        this.gender = gender;
        this.brand = brand;
        this.body = body;
        this.colour = colour;
        this.price = price;
        this.starred_products = starred_products;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Starred_Products getStarred_products() {
        return starred_products;
    }

    public void setStarred_products(Starred_Products starred_products) {
        this.starred_products = starred_products;
    }

    @Override
    public String toString() {
        return "T_shirts{" +
                "gender=" + gender +
                ", brand='" + brand + '\'' +
                ", body='" + body + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", starred_products=" + starred_products +
                '}';
    }
}
