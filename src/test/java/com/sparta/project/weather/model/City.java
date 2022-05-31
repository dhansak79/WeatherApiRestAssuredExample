
package com.sparta.project.weather.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "local_names",
    "lat",
    "lon",
    "country",
    "state"
})
@Generated("jsonschema2pojo")
public class City implements Serializable {

  @JsonProperty("name")
  private String name;
  @JsonProperty("local_names")
  private LocalNames localNames;
  @JsonProperty("lat")
  private Double lat;
  @JsonProperty("lon")
  private Double lon;
  @JsonProperty("country")
  private String country;
  @JsonProperty("state")
  private String state;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private final static long serialVersionUID = -6383412618166760562L;

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("local_names")
  public LocalNames getLocalNames() {
    return localNames;
  }

  @JsonProperty("local_names")
  public void setLocalNames(LocalNames localNames) {
    this.localNames = localNames;
  }

  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  @JsonProperty("lat")
  public void setLat(Double lat) {
    this.lat = lat;
  }

  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  @JsonProperty("lon")
  public void setLon(Double lon) {
    this.lon = lon;
  }

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(City.class.getName()).append('@')
        .append(Integer.toHexString(System.identityHashCode(this))).append('[');
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null) ? "<null>" : this.name));
    sb.append(',');
    sb.append("localNames");
    sb.append('=');
    sb.append(((this.localNames == null) ? "<null>" : this.localNames));
    sb.append(',');
    sb.append("lat");
    sb.append('=');
    sb.append(((this.lat == null) ? "<null>" : this.lat));
    sb.append(',');
    sb.append("lon");
    sb.append('=');
    sb.append(((this.lon == null) ? "<null>" : this.lon));
    sb.append(',');
    sb.append("country");
    sb.append('=');
    sb.append(((this.country == null) ? "<null>" : this.country));
    sb.append(',');
    sb.append("state");
    sb.append('=');
    sb.append(((this.state == null) ? "<null>" : this.state));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

}
