package lamaatech.com.tourguideapp.ClubLayout;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import lamaatech.com.tourguideapp.R;


@SuppressWarnings("ALL")
public class ClubModel {


    public ArrayList<Club> ITEMS;

    public ClubModel(Context context) {
        Resources res = context.getResources();
        ITEMS = new ArrayList<Club>();
        addItem(new Club(R.drawable.mok, res.getString(R.string.mokattam_club), res.getString(R.string.mokattam_desc)));
        addItem(new Club(R.drawable.masr, res.getString(R.string.masr_club), res.getString(R.string.masr_desc)));
        addItem(new Club(R.drawable.ahly, res.getString(R.string.ahly_club), res.getString(R.string.ahly_desc)));
    }

    private void addItem(Club item) {
        ITEMS.add(item);
    }

    public ArrayList<Club> getClubItems() {
        return ITEMS;
    }
}
