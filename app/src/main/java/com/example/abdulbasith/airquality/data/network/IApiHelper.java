package com.example.abdulbasith.airquality;

import com.example.abdulbasith.airquality.data.network.model.CitiesListModel;
import com.example.abdulbasith.airquality.data.network.model.CountriesListModel;
import com.example.abdulbasith.airquality.data.network.model.LastestDataModel;

import io.reactivex.Observable;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public interface IApiHelper {

    Observable<CitiesListModel> getCity();

    Observable<CountriesListModel> getCountry();

    Observable<LastestDataModel> getLatestData();
}
