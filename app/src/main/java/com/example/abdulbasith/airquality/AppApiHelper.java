package com.example.abdulbasith.airquality;

/**
 * Created by AbdulBasit on 18/10/2017.
 *
 */
import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;

import io.reactivex.Observable;

public class AppApiHelper implements IApiHelper{

    private IRequestInterface requestInterface;

    public AppApiHelper() {
        this.requestInterface = ConnectionService.getConnectionService();
    }

    @Override
    public Observable<CitiesListModel> getCity() {
        return null;
    }

    @Override
    public Observable<CitiesListModel> getCountry() {
        return null;
    }

    @Override
    public Observable<CitiesListModel> getLatestData() {
        return null;
    }


}
