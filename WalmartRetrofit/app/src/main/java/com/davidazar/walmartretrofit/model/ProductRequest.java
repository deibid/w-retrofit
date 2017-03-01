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

public class ProductRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "idLine",
            "startOffSet",
            "idFamily",
            "pText",
            "idDepartment",
            "maxResults",
            "sort",
            "brand",
            "parameter"
    })


    @JsonProperty("idLine")
    private String idLine;
    @JsonProperty("startOffSet")
    private String startOffSet;
    @JsonProperty("idFamily")
    private String idFamily;
    @JsonProperty("pText")
    private String pText;
    @JsonProperty("idDepartment")
    private String idDepartment;
    @JsonProperty("maxResults")
    private String maxResults;
    @JsonProperty("sort")
    private String sort;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("parameter")
    private Parameter parameter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public static final String CATEGORY_MG = "mg";
    public static final String CATEGORY_GR = "gr";


    public ProductRequest(String pText) {
        this.pText = pText;
        this.idLine = "";
        this.startOffSet = "0";
        this.idFamily = "";
        this.idDepartment = "";
        this.maxResults = "20";
        this.sort = "rankingASC";
        this.brand = "";
        this.parameter = new Parameter(pText);

    }

    @JsonProperty("idLine")
    public String getIdLine() {
        return idLine;
    }

    @JsonProperty("idLine")
    public void setIdLine(String idLine) {
        this.idLine = idLine;
    }

    @JsonProperty("startOffSet")
    public String getStartOffSet() {
        return startOffSet;
    }

    @JsonProperty("startOffSet")
    public void setStartOffSet(String startOffSet) {
        this.startOffSet = startOffSet;
    }

    @JsonProperty("idFamily")
    public String getIdFamily() {
        return idFamily;
    }

    @JsonProperty("idFamily")
    public void setIdFamily(String idFamily) {
        this.idFamily = idFamily;
    }

    @JsonProperty("pText")
    public String getPText() {
        return pText;
    }

    @JsonProperty("pText")
    public void setPText(String pText) {
        this.pText = pText;
    }

    @JsonProperty("idDepartment")
    public String getIdDepartment() {
        return idDepartment;
    }

    @JsonProperty("idDepartment")
    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    @JsonProperty("maxResults")
    public String getMaxResults() {
        return maxResults;
    }

    @JsonProperty("maxResults")
    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    @JsonProperty("sort")
    public String getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("parameter")
    public Parameter getParameter() {
        return parameter;
    }

    @JsonProperty("parameter")
    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
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


