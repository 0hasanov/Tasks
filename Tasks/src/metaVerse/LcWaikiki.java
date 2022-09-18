package metaVerse;

public class LcWaikiki {
    private String clothing_goods;
    private int price;

    public LcWaikiki() {
    }

    public LcWaikiki(String clothing_goods, int price) {
        this.clothing_goods = clothing_goods;
        this.price = price;
    }

    public String getClothing_goods() {
        return clothing_goods;
    }

    public void setClothing_goods(String clothing_goods) {
        this.clothing_goods = clothing_goods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LcWaikiki{" +
                "clothing_goods='" + clothing_goods + '\'' +
                ", price=" + price +
                '}';
    }
}

