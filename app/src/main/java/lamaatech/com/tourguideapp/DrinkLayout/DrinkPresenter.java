package lamaatech.com.tourguideapp.DrinkLayout;

import android.content.Context;

import java.util.List;

/**
 * Created by MrHacker on 10/9/2017.
 */

class DrinkPresenter implements DrinkContract.Presenter {

    private DrinkModel model;

    DrinkPresenter(Context context) {
        model = new DrinkModel(context);
    }

    @Override
    public List<Drink> getListOfClubs() {
        return model.getListOfClubsFromModel();
    }
}
