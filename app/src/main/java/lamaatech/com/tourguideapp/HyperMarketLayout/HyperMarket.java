package lamaatech.com.tourguideapp.HyperMarketLayout;

class HyperMarket {
    public final int imagePath;
    public final String hyberMarketName;
    public final String details;

    public HyperMarket(int newImage, String hyberMarketName, String details) {
        this.imagePath = newImage;
        this.hyberMarketName = hyberMarketName;
        this.details = details;
    }

    @Override
    public String toString() {
        return hyberMarketName;
    }
}