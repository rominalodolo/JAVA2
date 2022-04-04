package RevisionExercise;

public class Pants extends Clothing{
    private String type;
    private boolean OUTofSTOCK;

    public Pants(double size, String color, String description, String composition, int price, String sku, long upc, String type, boolean OUTofSTOCK) {
        super(size, color, description, composition, price, sku, upc);
        this.type = type;
        this.OUTofSTOCK = OUTofSTOCK;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOUTofSTOCK() {
        return OUTofSTOCK;
    }

    public void setOUTofSTOCK(boolean OUTofSTOCK) {
        this.OUTofSTOCK = OUTofSTOCK;
    }



}
