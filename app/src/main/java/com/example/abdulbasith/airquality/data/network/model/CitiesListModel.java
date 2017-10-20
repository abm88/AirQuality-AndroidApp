package com.example.abdulbasith.airquality.data.network.adapter.model;

/**
 * Created by AbdulBasit on 18/10/2017.
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class CitiesListModel {
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

        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("locations")
        @Expose
        private Integer locations;
        @SerializedName("count")
        @Expose
        private Integer count;

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

        public Integer getLocations() {
            return locations;
        }

        public void setLocations(Integer locations) {
            this.locations = locations;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

    }

}
