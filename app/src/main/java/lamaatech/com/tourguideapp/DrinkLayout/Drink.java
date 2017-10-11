package lamaatech.com.tourguideapp.DrinkLayout;

class Drink {
    public final String id;
    public final String title;
    public final String details;

    public Drink(String id, String title, String details) {
        this.id = id;
        this.title = title;
        this.details = details;
    }

    @Override
    public String toString() {
        return title;
    }
}