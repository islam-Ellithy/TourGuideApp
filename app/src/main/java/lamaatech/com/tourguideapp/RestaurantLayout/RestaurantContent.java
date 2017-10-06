package lamaatech.com.tourguideapp.RestaurantLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RestaurantContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Restaurant> ITEMS = new ArrayList<Restaurant>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Restaurant> ITEM_MAP = new HashMap<String, Restaurant>();

    private static final int COUNT = 4;

    static {
        addItem(new Restaurant("", "Macdonals", "beside kornesh el-mokattam"));
        addItem(new Restaurant("", "KFS", "in 9 street"));
        addItem(new Restaurant("", "Bebani Kabab","In front of commerce school" ));
        addItem(new Restaurant("", "Pizza Hut", "In elnafora squrare"));
    }

    private static void addItem(Restaurant item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    //for testing & dummy data
    private static Restaurant createDummyItem(int position) {
        return new Restaurant(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of title.
     */
    public static class Restaurant {
        public final String id;
        public final String title;
        public final String details;

        public Restaurant(String id, String title, String details) {
            this.id = id;
            this.title = title;
            this.details = details;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
