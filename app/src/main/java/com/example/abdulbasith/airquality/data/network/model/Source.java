package com.example.abdulbasith.airquality.data.network.adapter.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public class Source {

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

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("adapter")
        @Expose
        private String adapter;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("region")
        @Expose
        private String region;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("sourceURL")
        @Expose
        private String sourceURL;
        @SerializedName("contacts")
        @Expose
        private List<String> contacts = null;
        @SerializedName("active")
        @Expose
        private Boolean active;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("resolution")
        @Expose
        private String resolution;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("organization")
        @Expose
        private String organization;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAdapter() {
            return adapter;
        }

        public void setAdapter(String adapter) {
            this.adapter = adapter;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSourceURL() {
            return sourceURL;
        }

        public void setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
        }

        public List<String> getContacts() {
            return contacts;
        }

        public void setContacts(List<String> contacts) {
            this.contacts = contacts;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

    }
}
