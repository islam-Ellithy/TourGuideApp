package lamaatech.com.tourguideapp.RestaurantLayout;

import java.util.List;

/**
 * Created by MrHacker on 10/9/2017.
 */

class RestaurantContract {
    interface Presenter{
        List<Restaurant> getListOfRestaurants();
    }

    interface Model{
        List<Restaurant> getListOfRestaurantsFromModel();
    }

}
