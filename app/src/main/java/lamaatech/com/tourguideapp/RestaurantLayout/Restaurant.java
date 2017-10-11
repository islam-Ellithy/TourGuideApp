package lamaatech.com.tourguideapp.RestaurantLayout;

class Restaurant {
    final int restaurantImage;
    final String title;
    final String details;

    public Restaurant(int newImage, String title, String details) {
        this.restaurantImage = newImage;
        this.title = title;
        this.details = details;
    }

    @Override
    public String toString() {
        return title;
    }
}