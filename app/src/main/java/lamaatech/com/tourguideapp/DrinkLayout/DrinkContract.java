package lamaatech.com.tourguideapp.DrinkLayout;

import java.util.List;

/**
 * Created by MrHacker on 10/9/2017.
 */

class DrinkContract {
    interface Presenter{
        List<Drink> getListOfClubs();
    }

    interface Model{
        List<Drink> getListOfClubsFromModel();
    }

}
