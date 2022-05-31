
package com.sparta.weather.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coord",
    "list"
})
@Generated("jsonschema2pojo")
public class AirPollution {

    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("list")
    private java.util.List<com.sparta.weather.model.List> list = new ArrayList<com.sparta.weather.model.List>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("coord")
    public Coord getCoord() {
        return coord;
    }

    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public AirPollution withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    @JsonProperty("list")
    public java.util.List<com.sparta.weather.model.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.sparta.weather.model.List> list) {
        this.list = list;
    }

    public AirPollution withList(java.util.List<com.sparta.weather.model.List> list) {
        this.list = list;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AirPollution withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirPollution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coord");
        sb.append('=');
        sb.append(((this.coord == null)?"<null>":this.coord));
        sb.append(',');
        sb.append("list");
        sb.append('=');
        sb.append(((this.list == null)?"<null>":this.list));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.coord == null)? 0 :this.coord.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.list == null)? 0 :this.list.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirPollution) == false) {
            return false;
        }
        AirPollution rhs = ((AirPollution) other);
        return ((((this.coord == rhs.coord)||((this.coord!= null)&&this.coord.equals(rhs.coord)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.list == rhs.list)||((this.list!= null)&&this.list.equals(rhs.list))));
    }

}
