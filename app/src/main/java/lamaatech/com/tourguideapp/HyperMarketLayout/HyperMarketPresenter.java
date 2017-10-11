package lamaatech.com.tourguideapp.HyperMarketLayout;

import android.content.Context;

import java.util.List;


class HyperMarketPresenter implements HyperMarketContract.Presenter {

    private HyperMarketModel model;

    HyperMarketPresenter(Context context) {
        model = new HyperMarketModel(context);
    }

    @Override
    public List<HyperMarket> getListOfHyperMarkets() {
        return model.getListOfHyperMarketsFromModel();
    }
}
