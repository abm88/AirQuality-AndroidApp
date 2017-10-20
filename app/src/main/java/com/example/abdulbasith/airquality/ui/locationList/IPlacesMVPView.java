package com.example.abdulbasith.airquality.ui.base.locationList;

import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;
import com.example.abdulbasith.airquality.ui.base.MvpView;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public interface IPlacesMVPView extends MvpView {
    void onFetchDataCompleted(CitiesListModel citiesListModel);
}
