package com.example.abdulbasith.airquality.ui.base.locationList;

import com.example.abdulbasith.airquality.data.AppDataManager;
import com.example.abdulbasith.airquality.data.IDataManager;
import com.example.abdulbasith.airquality.ui.base.BasePresenter;
import com.example.abdulbasith.airquality.ui.base.MvpView;
import com.example.abdulbasith.airquality.ui.base.utility.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public class PlacesListPresenter<V extends IPlacesMVPView & MvpView> extends BasePresenter<V> implements IPlacesListMVPPresenter<V> {


    public PlacesListPresenter(AppDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared(String type) {
        if(type.equals("city")){
        getCompositeDisposable()
                .add((Disposable) getDataManager());
        }else {

        }

    }
}
