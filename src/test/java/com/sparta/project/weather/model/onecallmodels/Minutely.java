
package com.sparta.project.weather.model.onecallmodels;

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
    "dt",
    "precipitation"
})
@Generated("jsonschema2pojo")
public class Minutely {

    @JsonProperty("dt")
    private Integer dt;
    @JsonProperty("precipitation")
    private Integer precipitation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("dt")
    public Integer getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Minutely withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    @JsonProperty("precipitation")
    public Integer getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(Integer precipitation) {
        this.precipitation = precipitation;
    }

    public Minutely withPrecipitation(Integer precipitation) {
        this.precipitation = precipitation;
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

    public Minutely withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Minutely.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("precipitation");
        sb.append('=');
        sb.append(((this.precipitation == null)?"<null>":this.precipitation));
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
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.precipitation == null)? 0 :this.precipitation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Minutely) == false) {
            return false;
        }
        Minutely rhs = ((Minutely) other);
        return ((((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt)))&&((this.precipitation == rhs.precipitation)||((this.precipitation!= null)&&this.precipitation.equals(rhs.precipitation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
