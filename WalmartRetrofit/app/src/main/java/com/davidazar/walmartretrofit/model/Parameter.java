package com.davidazar.walmartretrofit.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David on 28/02/17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "eventtype",
        "q",
        "collection",
        "channel",
        "resultdId"
})
public class Parameter {

    @JsonProperty("eventtype")
    private String eventtype;
    @JsonProperty("q")
    private String q;
    @JsonProperty("collection")
    private String collection;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("resultdId")
    private String resultdId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Parameter(String q) {
        this.q = q;
        this.eventtype = "search";
        this.collection = "dah";
        this.channel = "android";
        this.resultdId = "";


    }

    @JsonProperty("eventtype")
    public String getEventtype() {
        return eventtype;
    }

    @JsonProperty("eventtype")
    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    @JsonProperty("q")
    public String getQ() {
        return q;
    }

    @JsonProperty("q")
    public void setQ(String q) {
        this.q = q;
    }

    @JsonProperty("collection")
    public String getCollection() {
        return collection;
    }

    @JsonProperty("collection")
    public void setCollection(String collection) {
        this.collection = collection;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("resultdId")
    public String getResultdId() {
        return resultdId;
    }

    @JsonProperty("resultdId")
    public void setResultdId(String resultdId) {
        this.resultdId = resultdId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}