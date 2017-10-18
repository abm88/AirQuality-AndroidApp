package com.example.abdulbasith.airquality;

import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;

import io.reactivex.Observable;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public interface IApiHelper {

    Observable<CitiesListModel> getCity();

    Observable<CitiesListModel> getCountry();

    Observable<CitiesListModel> getLatestData();
}
