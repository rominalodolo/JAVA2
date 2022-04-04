package RevisionExercise;

public class Blouse extends Clothing {
    private String details;
    private boolean OUTofSTOCK;

    public Blouse(String details, boolean OUTofSTOCK, double size, String color, String description, String composition, int price, String sku, long upc){
        super(size, color, description, composition, price, sku, upc);
        this.details = details;
        this.OUTofSTOCK = OUTofSTOCK;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isOUTofSTOCK() {
        return OUTofSTOCK;
    }

    public void setOUTofSTOCK(boolean OUTofSTOCK) {
        this.OUTofSTOCK = OUTofSTOCK;
    }

    @Override
    public void displayClothing(){
        super.displayClothing();
        System.out.println("Details: " + getDetails() + "\n" +
                "Out of Stock: " + isOUTofSTOCK()
        );
    }
}


