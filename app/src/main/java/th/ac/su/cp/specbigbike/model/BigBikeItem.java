package th.ac.su.cp.specbigbike.model;

public class BigBikeItem {
    public final int imageResId;
    public final String brand;
    public final String model;

    public BigBikeItem(int imageResId, String brand, String model) {
        this.imageResId = imageResId;
        this.brand = brand;
        this.model = model;
    }
}
