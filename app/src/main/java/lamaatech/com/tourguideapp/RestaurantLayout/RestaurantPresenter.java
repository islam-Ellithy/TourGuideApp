package lamaatech.com.tourguideapp.RestaurantLayout;

import android.content.Context;

import java.util.List;


class RestaurantPresenter implements RestaurantContract.Presenter {

    private RestaurantModel model;

    RestaurantPresenter(Context context) {
        model = new RestaurantModel(context);
    }

    @Override
    public List<Restaurant> getListOfRestaurants() {
        return model.getListOfRestaurantsFromModel();
    }
}
