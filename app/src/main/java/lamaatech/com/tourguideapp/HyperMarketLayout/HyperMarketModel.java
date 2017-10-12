package lamaatech.com.tourguideapp.HyperMarketLayout;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import lamaatech.com.tourguideapp.R;


@SuppressWarnings("ALL")
class HyperMarketModel implements HyperMarketContract.Model{

    public List<HyperMarket> ITEMS;
    HyperMarketModel(Context context){

        Resources res = context.getResources();
        ITEMS = new ArrayList<HyperMarket>();

        String[] hypermarketNames = res.getStringArray(R.array.hypermarket_names_array);
        String[] hypermarketDesc = res.getStringArray(R.array.hypermarket_desc_array);

        addItem(new HyperMarket(R.drawable.coffe_shop, hypermarketNames[0], hypermarketDesc[0]));
        addItem(new HyperMarket(R.drawable.zman, hypermarketNames[1], hypermarketDesc[1]));
        addItem(new HyperMarket(R.drawable.carrefour, hypermarketNames[2], hypermarketDesc[2]));
        addItem(new HyperMarket(R.drawable.ragb, hypermarketNames[3], hypermarketDesc[3]));
    }

    private void addItem(HyperMarket item) {
        ITEMS.add(item);
    }

    @Override
    public List<HyperMarket> getListOfHyperMarketsFromModel() {
        return ITEMS;
    }
}
