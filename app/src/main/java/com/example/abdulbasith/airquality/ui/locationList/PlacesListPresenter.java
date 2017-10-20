package com.example.abdulbasith.airquality.ui.base.locationList;

import com.example.abdulbasith.airquality.data.AppDataManager;
import com.example.abdulbasith.airquality.data.IDataManager;
import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;
import com.example.abdulbasith.airquality.ui.base.BasePresenter;
import com.example.abdulbasith.airquality.ui.base.MvpView;
import com.example.abdulbasith.airquality.ui.base.utility.rx.SchedulerProvider;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public class PlacesListPresenter<V extends IPlacesMVPView & MvpView> extends BasePresenter<V> implements IPlacesListMVPPresenter<V> {


    public PlacesListPresenter(AppDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }



    @Override
    public void onViewPrepared(String type) {
        if(type.equals("cities")) {
            getCompositeDisposable()
                    .add(getDataManager().getCity()
                            .subscribeOn(getSchedulerProvider().io())
                            .observeOn(getSchedulerProvider().ui())
                            .subscribe(new Consumer<CitiesListModel>() {
                                           @Override
                                           public void accept(@NonNull CitiesListModel citiesListModel) throws Exception {
                                               getMvpView().onFetchDataCompleted(citiesListModel);
                                           }
                                       },
                                    new Consumer<Throwable>() {
                                        @Override
                                        public void accept(@NonNull Throwable throwable) throws Exception {
                                            getMvpView().onError(throwable.getMessage());
                                        }
                                    }));
        }else {

        }

}
}
