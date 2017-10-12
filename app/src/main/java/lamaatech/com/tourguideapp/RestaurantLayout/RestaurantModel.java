package lamaatech.com.tourguideapp.RestaurantLayout;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import lamaatech.com.tourguideapp.R;


@SuppressWarnings("ALL")
public class RestaurantModel implements RestaurantContract.Model {

    public List<Restaurant> ITEMS;

    RestaurantModel(Context context) {
        Resources res = context.getResources();

        ITEMS = new ArrayList<Restaurant>();

        String[] restaurantNames = res.getStringArray(R.array.restaurant_names_array);
        String[] restaurantDesc = res.getStringArray(R.array.restaurant_desc_array);

        addItem(new Restaurant(R.drawable.mcdonalds, restaurantNames[0], restaurantDesc[0]));
        addItem(new Restaurant(R.drawable.kfc, restaurantNames[1], restaurantDesc[1]));
        addItem(new Restaurant(R.drawable.beef, restaurantNames[2], restaurantDesc[2]));
        addItem(new Restaurant(R.drawable.pizza_hut, restaurantNames[3], restaurantDesc[3]));
    }

    private void addItem(Restaurant item) {
        ITEMS.add(item);
    }


    @Override
    public List<Restaurant> getListOfRestaurantsFromModel() {
        return ITEMS;
    }
}
