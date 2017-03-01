package com.davidazar.walmartretrofit.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by David on 28/02/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "responseArray",
        "priority",
        "sessionATG",
        "codeMessage",
        "message"
})
public class ProductSearchResponse {

    @JsonProperty("responseArray")
    private List<ProductResponse> responseArray = null;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("sessionATG")
    private String sessionATG;
    @JsonProperty("codeMessage")
    private Integer codeMessage;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("responseArray")
    public List<ProductResponse> getResponseArray() {
        return responseArray;
    }

    @JsonProperty("responseArray")
    public void setResponseArray(List<ProductResponse> responseArray) {
        this.responseArray = responseArray;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("sessionATG")
    public String getSessionATG() {
        return sessionATG;
    }

    @JsonProperty("sessionATG")
    public void setSessionATG(String sessionATG) {
        this.sessionATG = sessionATG;
    }

    @JsonProperty("codeMessage")
    public Integer getCodeMessage() {
        return codeMessage;
    }

    @JsonProperty("codeMessage")
    public void setCodeMessage(Integer codeMessage) {
        this.codeMessage = codeMessage;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
