package lamaatech.com.tourguideapp.HyperMarketLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HyberMarketContent {

    public static final List<HyberMarketItem> ITEMS = new ArrayList<HyberMarketItem>();

    public static final Map<String, HyberMarketItem> ITEM_MAP = new HashMap<String, HyberMarketItem>();

    private static final int COUNT = 4;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(HyberMarketItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static HyberMarketItem createDummyItem(int position) {
        return new HyberMarketItem(String.valueOf(position), "HyberMarket " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static class HyberMarketItem {
        public final String id;
        public final String hyberMarketName;
        public final String details;

        public HyberMarketItem(String id, String hyberMarketName, String details) {
            this.id = id;
            this.hyberMarketName = hyberMarketName;
            this.details = details;
        }

        @Override
        public String toString() {
            return hyberMarketName;
        }
    }
}
