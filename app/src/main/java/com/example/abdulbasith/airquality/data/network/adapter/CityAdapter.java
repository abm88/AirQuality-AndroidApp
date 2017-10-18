package com.example.abdulbasith.airquality.data.network.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abdulbasith.airquality.R;
import com.example.abdulbasith.airquality.data.network.adapter.model.CitiesListModel;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    CitiesListModel citiesListModel;
    int row;
    Context ApplicationContext;

    public CityAdapter(CitiesListModel citiesListModel, int row, Context applicationContext) {
        this.citiesListModel = citiesListModel;
        this.row = row;
        ApplicationContext = applicationContext;
    }

    public CitiesListModel getCitiesListModel() {
        return citiesListModel;
    }

    public void setCitiesListModel(CitiesListModel citiesListModel) {
        this.citiesListModel = citiesListModel;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Context getApplicationContext() {
        return ApplicationContext;
    }

    public void setApplicationContext(Context applicationContext) {
        ApplicationContext = applicationContext;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(row,parent,false);

        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        holder.textView.setText((CharSequence) citiesListModel.getResults().get(position));

    }

    @Override
    public int getItemCount() {
        return citiesListModel.getResults().size();
    }

    public class CityViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public CityViewHolder(View itemView) {
            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.textView);
        }
    }
}
