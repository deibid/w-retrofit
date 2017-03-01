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
        "priceEventText",
        "quantity",
        "type",
        "upc",
        "price",
        "longDescription",
        "baseUomcd",
        "description",
        "imageUrl",
        "pesable",
        "stock",
        "equivalenceByPiece",
        "totalResults",
        "startResult",
        "resultsInResponse",
        "promoDescription",
        "productIsInStores",
        "ingredients",
        "listPrice",
        "codeMessage",
        "message"
})
public class ProductResponse {

    @JsonProperty("priceEventText")
    private String priceEventText;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("type")
    private String type;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("baseUomcd")
    private String baseUomcd;
    @JsonProperty("description")
    private String description;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("pesable")
    private String pesable;
    @JsonProperty("stock")
    private Boolean stock;
    @JsonProperty("equivalenceByPiece")
    private String equivalenceByPiece;
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("startResult")
    private String startResult;
    @JsonProperty("resultsInResponse")
    private String resultsInResponse;
    @JsonProperty("promoDescription")
    private String promoDescription;
    @JsonProperty("productIsInStores")
    private String productIsInStores;
    @JsonProperty("ingredients")
    private String ingredients;
    @JsonProperty("listPrice")
    private String listPrice;
    @JsonProperty("codeMessage")
    private Integer codeMessage;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("priceEventText")
    public String getPriceEventText() {
        return priceEventText;
    }

    @JsonProperty("priceEventText")
    public void setPriceEventText(String priceEventText) {
        this.priceEventText = priceEventText;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("baseUomcd")
    public String getBaseUomcd() {
        return baseUomcd;
    }

    @JsonProperty("baseUomcd")
    public void setBaseUomcd(String baseUomcd) {
        this.baseUomcd = baseUomcd;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("pesable")
    public String getPesable() {
        return pesable;
    }

    @JsonProperty("pesable")
    public void setPesable(String pesable) {
        this.pesable = pesable;
    }

    @JsonProperty("stock")
    public Boolean getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    @JsonProperty("equivalenceByPiece")
    public String getEquivalenceByPiece() {
        return equivalenceByPiece;
    }

    @JsonProperty("equivalenceByPiece")
    public void setEquivalenceByPiece(String equivalenceByPiece) {
        this.equivalenceByPiece = equivalenceByPiece;
    }

    @JsonProperty("totalResults")
    public String getTotalResults() {
        return totalResults;
    }

    @JsonProperty("totalResults")
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("startResult")
    public String getStartResult() {
        return startResult;
    }

    @JsonProperty("startResult")
    public void setStartResult(String startResult) {
        this.startResult = startResult;
    }

    @JsonProperty("resultsInResponse")
    public String getResultsInResponse() {
        return resultsInResponse;
    }

    @JsonProperty("resultsInResponse")
    public void setResultsInResponse(String resultsInResponse) {
        this.resultsInResponse = resultsInResponse;
    }

    @JsonProperty("promoDescription")
    public String getPromoDescription() {
        return promoDescription;
    }

    @JsonProperty("promoDescription")
    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    @JsonProperty("productIsInStores")
    public String getProductIsInStores() {
        return productIsInStores;
    }

    @JsonProperty("productIsInStores")
    public void setProductIsInStores(String productIsInStores) {
        this.productIsInStores = productIsInStores;
    }

    @JsonProperty("ingredients")
    public String getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("listPrice")
    public String getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
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