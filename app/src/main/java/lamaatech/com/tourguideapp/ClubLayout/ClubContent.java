package lamaatech.com.tourguideapp.ClubLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample clubName for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ClubContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ClubItem> ITEMS = new ArrayList<ClubItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ClubItem> ITEM_MAP = new HashMap<String, ClubItem>();

    private static final int COUNT = 4;

    static {
        // Add some sample items.
        addItem(new ClubItem("", "Mokattam Club", "Is a sporting club that is there near to elqudos mosuque"));
        addItem(new ClubItem("", "Elshark Club", "Is a sporting club that is there near to elqudos mosuque"));
        addItem(new ClubItem("", "Marks shabab El-Mokattam Club", "Is a sporting club"));
        /*
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }*/
    }

    private static void addItem(ClubItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ClubItem createDummyItem(int position) {
        return new ClubItem(String.valueOf(position), "Item " + position, makeDetails(position));
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
     * A dummy item representing a piece of clubName.
     */
    public static class ClubItem {
        public final String id;
        public final String clubName;
        public final String details;

        public ClubItem(String id, String clubName, String details) {
            this.id = id;
            this.clubName = clubName;
            this.details = details;
        }

        @Override
        public String toString() {
            return clubName;
        }
    }
}
