package lamaatech.com.tourguideapp.ClubLayout;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by MrHacker on 10/9/2017.
 */

 class ClubPresenter implements ClubContract.Presenter {

    private ClubModel model;

    ClubPresenter(Context context) {
        model = new ClubModel(context);
    }

    @Override
    public ArrayList<Club> getListOfClubs() {
        return model.getClubItems();
    }
}
