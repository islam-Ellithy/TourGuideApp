package lamaatech.com.tourguideapp.HyperMarketLayout;

import java.util.List;

/**
 * Created by MrHacker on 10/9/2017.
 */

class HyperMarketContract {
    interface Presenter{
        List<HyperMarket> getListOfHyperMarkets();
    }

    interface Model{
        List<HyperMarket> getListOfHyperMarketsFromModel();
    }

}
