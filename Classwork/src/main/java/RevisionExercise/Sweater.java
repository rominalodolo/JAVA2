package RevisionExercise;

public class Sweater extends Clothing{
    private String style;
    private boolean OUTofSTOCK;

    public Sweater(double size, String color, String description, String composition, int price, String sku, long upc, String style, boolean OUTofSTOCK) {
        super(size, color, description, composition, price, sku, upc);
        this.style = style;
        this.OUTofSTOCK = OUTofSTOCK;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isOUTofSTOCK() {
        return OUTofSTOCK;
    }

    public void setOUTofSTOCK(boolean OUTofSTOCK) {
        this.OUTofSTOCK = OUTofSTOCK;
    }
}
