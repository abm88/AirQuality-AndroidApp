package com.example.abdulbasith.airquality.data.network.adapter.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public class Fetch {
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

    public class Failures {

        @SerializedName("Failed to load entry point url")
        @Expose
        private Integer failedToLoadEntryPointUrl;
        @SerializedName("instance.coordinates.latitude is not of a type(s) number")
        @Expose
        private Integer instanceCoordinatesLatitudeIsNotOfATypeSNumber;
        @SerializedName("instance.coordinates.latitude must have a minimum value of -90")
        @Expose
        private Integer instanceCoordinatesLatitudeMustHaveAMinimumValueOf90;
        @SerializedName("instance.coordinates.latitude must have a maximum value of 90")
        @Expose
        private Integer instanceCoordinatesLatitudeMustHaveAMaximumValueOf90;
        @SerializedName("instance.coordinates.longitude is not of a type(s) number")
        @Expose
        private Integer instanceCoordinatesLongitudeIsNotOfATypeSNumber;
        @SerializedName("instance.coordinates.longitude must have a minimum value of -180")
        @Expose
        private Integer instanceCoordinatesLongitudeMustHaveAMinimumValueOf180;
        @SerializedName("instance.coordinates.longitude must have a maximum value of 180")
        @Expose
        private Integer instanceCoordinatesLongitudeMustHaveAMaximumValueOf180;
        @SerializedName("Failure to load data url.")
        @Expose
        private Integer failureToLoadDataUrl;

        public Integer getFailedToLoadEntryPointUrl() {
            return failedToLoadEntryPointUrl;
        }

        public void setFailedToLoadEntryPointUrl(Integer failedToLoadEntryPointUrl) {
            this.failedToLoadEntryPointUrl = failedToLoadEntryPointUrl;
        }

        public Integer getInstanceCoordinatesLatitudeIsNotOfATypeSNumber() {
            return instanceCoordinatesLatitudeIsNotOfATypeSNumber;
        }

        public void setInstanceCoordinatesLatitudeIsNotOfATypeSNumber(Integer instanceCoordinatesLatitudeIsNotOfATypeSNumber) {
            this.instanceCoordinatesLatitudeIsNotOfATypeSNumber = instanceCoordinatesLatitudeIsNotOfATypeSNumber;
        }

        public Integer getInstanceCoordinatesLatitudeMustHaveAMinimumValueOf90() {
            return instanceCoordinatesLatitudeMustHaveAMinimumValueOf90;
        }

        public void setInstanceCoordinatesLatitudeMustHaveAMinimumValueOf90(Integer instanceCoordinatesLatitudeMustHaveAMinimumValueOf90) {
            this.instanceCoordinatesLatitudeMustHaveAMinimumValueOf90 = instanceCoordinatesLatitudeMustHaveAMinimumValueOf90;
        }

        public Integer getInstanceCoordinatesLatitudeMustHaveAMaximumValueOf90() {
            return instanceCoordinatesLatitudeMustHaveAMaximumValueOf90;
        }

        public void setInstanceCoordinatesLatitudeMustHaveAMaximumValueOf90(Integer instanceCoordinatesLatitudeMustHaveAMaximumValueOf90) {
            this.instanceCoordinatesLatitudeMustHaveAMaximumValueOf90 = instanceCoordinatesLatitudeMustHaveAMaximumValueOf90;
        }

        public Integer getInstanceCoordinatesLongitudeIsNotOfATypeSNumber() {
            return instanceCoordinatesLongitudeIsNotOfATypeSNumber;
        }

        public void setInstanceCoordinatesLongitudeIsNotOfATypeSNumber(Integer instanceCoordinatesLongitudeIsNotOfATypeSNumber) {
            this.instanceCoordinatesLongitudeIsNotOfATypeSNumber = instanceCoordinatesLongitudeIsNotOfATypeSNumber;
        }

        public Integer getInstanceCoordinatesLongitudeMustHaveAMinimumValueOf180() {
            return instanceCoordinatesLongitudeMustHaveAMinimumValueOf180;
        }

        public void setInstanceCoordinatesLongitudeMustHaveAMinimumValueOf180(Integer instanceCoordinatesLongitudeMustHaveAMinimumValueOf180) {
            this.instanceCoordinatesLongitudeMustHaveAMinimumValueOf180 = instanceCoordinatesLongitudeMustHaveAMinimumValueOf180;
        }

        public Integer getInstanceCoordinatesLongitudeMustHaveAMaximumValueOf180() {
            return instanceCoordinatesLongitudeMustHaveAMaximumValueOf180;
        }

        public void setInstanceCoordinatesLongitudeMustHaveAMaximumValueOf180(Integer instanceCoordinatesLongitudeMustHaveAMaximumValueOf180) {
            this.instanceCoordinatesLongitudeMustHaveAMaximumValueOf180 = instanceCoordinatesLongitudeMustHaveAMaximumValueOf180;
        }

        public Integer getFailureToLoadDataUrl() {
            return failureToLoadDataUrl;
        }

        public void setFailureToLoadDataUrl(Integer failureToLoadDataUrl) {
            this.failureToLoadDataUrl = failureToLoadDataUrl;
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

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("results")
        @Expose
        private List<Result_> results = null;
        @SerializedName("timeStarted")
        @Expose
        private String timeStarted;
        @SerializedName("timeEnded")
        @Expose
        private String timeEnded;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<Result_> getResults() {
            return results;
        }

        public void setResults(List<Result_> results) {
            this.results = results;
        }

        public String getTimeStarted() {
            return timeStarted;
        }

        public void setTimeStarted(String timeStarted) {
            this.timeStarted = timeStarted;
        }

        public String getTimeEnded() {
            return timeEnded;
        }

        public void setTimeEnded(String timeEnded) {
            this.timeEnded = timeEnded;
        }

    }

    public class Result_ {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("failures")
        @Expose
        private Failures failures;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("duration")
        @Expose
        private Double duration;
        @SerializedName("sourceName")
        @Expose
        private String sourceName;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Failures getFailures() {
            return failures;
        }

        public void setFailures(Failures failures) {
            this.failures = failures;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            this.duration = duration;
        }

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

    }
}
