package lamaatech.com.tourguideapp.DrinkLayout;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import lamaatech.com.tourguideapp.R;


@SuppressWarnings("ALL")
public class DrinkModel implements DrinkContract.Model {

    public List<Drink> ITEMS;

    DrinkModel(Context context) {
        Resources res = context.getResources();

        String[] drinkNames = res.getStringArray(R.array.drink_names_array);
        String[] drinkDesc = res.getStringArray(R.array.drink_names_array);

        ITEMS = new ArrayList<Drink>();
        addItem(new Drink("", drinkNames[0],drinkDesc[0]));
        addItem(new Drink("", drinkNames[1], drinkDesc[1]));
        addItem(new Drink("",  drinkNames[2], drinkDesc[2]));

    }

    private void addItem(Drink item) {
        ITEMS.add(item);
    }


    @Override
    public List<Drink> getListOfClubsFromModel() {
        return ITEMS;
    }

}
