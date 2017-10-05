package lamaatech.com.tourguideapp.DrinkLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DrinkContent {

    public static final List<DrinkItem> ITEMS = new ArrayList<DrinkItem>();

    public static final Map<String, DrinkItem> ITEM_MAP = new HashMap<String, DrinkItem>();

    private static final int COUNT = 4;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DrinkItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DrinkItem createDummyItem(int position) {
        return new DrinkItem(String.valueOf(position), "Abo Laila " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }


    public static class DrinkItem {
        public final String id;
        public final String title;
        public final String details;

        public DrinkItem(String id, String title, String details) {
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
