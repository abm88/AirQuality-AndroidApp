package com.example.abdulbasith.airquality;

/**
 * Created by AbdulBasit on 18/10/2017.
 *
 */
import com.example.abdulbasith.airquality.data.network.model.CitiesListModel;
import com.example.abdulbasith.airquality.data.network.model.CountriesListModel;
import com.example.abdulbasith.airquality.data.network.model.LastestDataModel;
import com.example.abdulbasith.airquality.data.network.service.IRequestInterface;

import io.reactivex.Observable;

public class AppApiHelper implements IApiHelper{

    private IRequestInterface requestInterface;

    public AppApiHelper() {
        this.requestInterface = ConnectionService.getConnectionService();
    }

    @Override
    public Observable<CitiesListModel> getCity() {
        return requestInterface.getCity();
    }

    @Override
    public Observable<CountriesListModel> getCountry() {
        return requestInterface.getCountries();
    }

    @Override
    public Observable<LastestDataModel> getLatestData() {
        return requestInterface.getLatestData();
    }


}
