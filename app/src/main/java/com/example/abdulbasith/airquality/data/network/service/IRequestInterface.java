package com.example.abdulbasith.airquality;

import com.example.abdulbasith.airquality.data.network.adapter.API_Constants;
import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;
import com.example.abdulbasith.airquality.data.network.adapter.model.CountriesListModel;
import com.example.abdulbasith.airquality.data.network.adapter.model.Fetch;
import com.example.abdulbasith.airquality.data.network.adapter.model.LastestDataModel;
import com.example.abdulbasith.airquality.data.network.adapter.model.LocationListModel;
import com.example.abdulbasith.airquality.data.network.adapter.model.MeasurementListModel;
import com.example.abdulbasith.airquality.data.network.adapter.model.Parameters;
import com.example.abdulbasith.airquality.data.network.adapter.model.Source;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public interface IRequestInterface {

    @GET(API_Constants.CITY_API)
    Observable<CitiesListModel> getCity();

    @GET(API_Constants.COUNTRIES_API)
    Observable<CountriesListModel> getCountries();

    @GET(API_Constants.LOCATIONS_API)
    Observable<LocationListModel> getLocations();

    @GET(API_Constants.LATEST_API)
    Observable<LastestDataModel> getLatestData();

    @GET(API_Constants.FETCH_API)
    Observable<Fetch> getFetch();

    @GET(API_Constants.MEASUREMENTS_API)
    Observable<MeasurementListModel> getMeasurement();

    @GET(API_Constants.PARAMETERS_API)
    Observable<Parameters> getParameters();

    @GET(API_Constants.SOURCE_API)
    Observable<Source> getSource();
}
