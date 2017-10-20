package com.example.abdulbasith.airquality.data;

import com.example.abdulbasith.airquality.AppApiHelper;
import com.example.abdulbasith.airquality.IApiHelper;
import com.example.abdulbasith.airquality.data.network.model.CitiesListModel;
import com.example.abdulbasith.airquality.data.network.model.CountriesListModel;
import com.example.abdulbasith.airquality.data.network.model.LastestDataModel;

import io.reactivex.Observable;

/**
 * Created by AbdulBasit on 17/10/2017.
 */

public class AppDataManager implements IDataManager {

    IApiHelper iApiHelper;

    public AppDataManager(){
        this.iApiHelper = new AppApiHelper();
    }
    @Override
    public Observable<CitiesListModel> getCity() {
        return iApiHelper.getCity();
    }

    @Override
    public Observable<CountriesListModel> getCountry() {
        return iApiHelper.getCountry();
    }

    @Override
    public Observable<LastestDataModel> getLatestData() {
        return iApiHelper.getLatestData();
    }
}
