package com.example.abdulbasith.airquality.data.network.adapter.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by AbdulBasit on 18/10/2017.
 */
//Provides a list of measurement locations and their meta data.
public class LocationListModel {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public class Coordinates {

        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

    }

    public class Meta {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("license")
        @Expose
        private String license;
        @SerializedName("website")
        @Expose
        private String website;
        @SerializedName("page")
        @Expose
        private Integer page;
        @SerializedName("limit")
        @Expose
        private Integer limit;
        @SerializedName("found")
        @Expose
        private Integer found;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public Integer getFound() {
            return found;
        }

        public void setFound(Integer found) {
            this.found = found;
        }

    }

    public class Result {

        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("sourceNames")
        @Expose
        private List<String> sourceNames = null;
        @SerializedName("lastUpdated")
        @Expose
        private String lastUpdated;
        @SerializedName("firstUpdated")
        @Expose
        private String firstUpdated;
        @SerializedName("parameters")
        @Expose
        private List<String> parameters = null;
        @SerializedName("sourceName")
        @Expose
        private String sourceName;
        @SerializedName("coordinates")
        @Expose
        private Coordinates coordinates;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<String> getSourceNames() {
            return sourceNames;
        }

        public void setSourceNames(List<String> sourceNames) {
            this.sourceNames = sourceNames;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public String getFirstUpdated() {
            return firstUpdated;
        }

        public void setFirstUpdated(String firstUpdated) {
            this.firstUpdated = firstUpdated;
        }

        public List<String> getParameters() {
            return parameters;
        }

        public void setParameters(List<String> parameters) {
            this.parameters = parameters;
        }

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

    }

}
