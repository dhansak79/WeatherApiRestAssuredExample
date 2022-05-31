
package com.sparta.project.weather.model.onecallmodels;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "sunrise",
    "sunset",
    "temp",
    "feels_like",
    "pressure",
    "humidity",
    "dew_point",
    "uvi",
    "clouds",
    "visibility",
    "wind_speed",
    "wind_deg",
    "weather"
})
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("dt")
    private Integer dt;
    @JsonProperty("sunrise")
    private Integer sunrise;
    @JsonProperty("sunset")
    private Integer sunset;
    @JsonProperty("temp")
    private Double temp;
    @JsonProperty("feels_like")
    private Double feelsLike;
    @JsonProperty("pressure")
    private Integer pressure;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("dew_point")
    private Double dewPoint;
    @JsonProperty("uvi")
    private Double uvi;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_deg")
    private Integer windDeg;
    @JsonProperty("weather")
    private List<Weather> weather = new ArrayList<Weather>();
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

    public Current withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    @JsonProperty("sunrise")
    public Integer getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Current withSunrise(Integer sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    @JsonProperty("sunset")
    public Integer getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    public Current withSunset(Integer sunset) {
        this.sunset = sunset;
        return this;
    }

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Current withTemp(Double temp) {
        this.temp = temp;
        return this;
    }

    @JsonProperty("feels_like")
    public Double getFeelsLike() {
        return feelsLike;
    }

    @JsonProperty("feels_like")
    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Current withFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    @JsonProperty("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Current withPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Current withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    @JsonProperty("dew_point")
    public Double getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dew_point")
    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Current withDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    @JsonProperty("uvi")
    public Double getUvi() {
        return uvi;
    }

    @JsonProperty("uvi")
    public void setUvi(Double uvi) {
        this.uvi = uvi;
    }

    public Current withUvi(Double uvi) {
        this.uvi = uvi;
        return this;
    }

    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Current withClouds(Integer clouds) {
        this.clouds = clouds;
        return this;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Current withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("wind_speed")
    public Double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Current withWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    @JsonProperty("wind_deg")
    public Integer getWindDeg() {
        return windDeg;
    }

    @JsonProperty("wind_deg")
    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Current withWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Current withWeather(List<Weather> weather) {
        this.weather = weather;
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

    public Current withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Current.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("sunrise");
        sb.append('=');
        sb.append(((this.sunrise == null)?"<null>":this.sunrise));
        sb.append(',');
        sb.append("sunset");
        sb.append('=');
        sb.append(((this.sunset == null)?"<null>":this.sunset));
        sb.append(',');
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null)?"<null>":this.temp));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("dewPoint");
        sb.append('=');
        sb.append(((this.dewPoint == null)?"<null>":this.dewPoint));
        sb.append(',');
        sb.append("uvi");
        sb.append('=');
        sb.append(((this.uvi == null)?"<null>":this.uvi));
        sb.append(',');
        sb.append("clouds");
        sb.append('=');
        sb.append(((this.clouds == null)?"<null>":this.clouds));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDeg");
        sb.append('=');
        sb.append(((this.windDeg == null)?"<null>":this.windDeg));
        sb.append(',');
        sb.append("weather");
        sb.append('=');
        sb.append(((this.weather == null)?"<null>":this.weather));
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
        result = ((result* 31)+((this.sunrise == null)? 0 :this.sunrise.hashCode()));
        result = ((result* 31)+((this.temp == null)? 0 :this.temp.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.uvi == null)? 0 :this.uvi.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.clouds == null)? 0 :this.clouds.hashCode()));
        result = ((result* 31)+((this.dewPoint == null)? 0 :this.dewPoint.hashCode()));
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.feelsLike == null)? 0 :this.feelsLike.hashCode()));
        result = ((result* 31)+((this.windDeg == null)? 0 :this.windDeg.hashCode()));
        result = ((result* 31)+((this.sunset == null)? 0 :this.sunset.hashCode()));
        result = ((result* 31)+((this.weather == null)? 0 :this.weather.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Current) == false) {
            return false;
        }
        Current rhs = ((Current) other);
        return ((((((((((((((((this.sunrise == rhs.sunrise)||((this.sunrise!= null)&&this.sunrise.equals(rhs.sunrise)))&&((this.temp == rhs.temp)||((this.temp!= null)&&this.temp.equals(rhs.temp))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.uvi == rhs.uvi)||((this.uvi!= null)&&this.uvi.equals(rhs.uvi))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.clouds == rhs.clouds)||((this.clouds!= null)&&this.clouds.equals(rhs.clouds))))&&((this.dewPoint == rhs.dewPoint)||((this.dewPoint!= null)&&this.dewPoint.equals(rhs.dewPoint))))&&((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt))))&&((this.feelsLike == rhs.feelsLike)||((this.feelsLike!= null)&&this.feelsLike.equals(rhs.feelsLike))))&&((this.windDeg == rhs.windDeg)||((this.windDeg!= null)&&this.windDeg.equals(rhs.windDeg))))&&((this.sunset == rhs.sunset)||((this.sunset!= null)&&this.sunset.equals(rhs.sunset))))&&((this.weather == rhs.weather)||((this.weather!= null)&&this.weather.equals(rhs.weather))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))));
    }

}
