package RevisionExercise;

public class Clothing {

    private double size;
    private String color;
    private String description;
    private String composition;
    private int price;
    private String sku;
    private long upc;

    public Clothing(double size, String color, String description, String composition, int price, String sku, long upc) {
        this.size = size;
        this.color = color;
        this.description = description;
        this.composition = composition;
        this.price = price;
        this.sku = sku;
        this.upc = upc;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public long getUpc() {
        return upc;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public String print() {
        return "Size: " + getSize() + "\n" +
                "Color: " + getColor() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Composition: " + getComposition() + "\n" +
                "Price: " + getPrice() + "\n" +
                "SKU: " + getPrice() + "\n" +
                "UPC: " + getUpc() + "\n";
    }


}
