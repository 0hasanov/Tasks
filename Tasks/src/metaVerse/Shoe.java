package metaVerse;

import metaVerse.eNUM.Gender;
import metaVerse.eNUM.Starred_Products;

public class Shoe {
    private Gender gender;
    private String brand;
    private String size;
    private String colour;
    private int price;
    private Starred_Products starred_products;

    public Shoe() {
    }

    public Shoe(Gender gender, String brand, String size, String colour, int price, Starred_Products starred_products) {
        this.gender = gender;
        this.brand = brand;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        return "Shoe{" +
                "gender=" + gender +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", starred_products=" + starred_products +
                '}';
    }
}
