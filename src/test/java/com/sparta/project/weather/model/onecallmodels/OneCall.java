
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

@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonPropertyOrder( {
        "lat",
        "lon",
        "timezone",
        "timezone_offset",
        "current",
        "minutely"
} )
@Generated( "jsonschema2pojo" )
public class OneCall {

  @JsonProperty( "lat" )
  private Double lat;
  @JsonProperty( "lon" )
  private Double lon;
  @JsonProperty( "timezone" )
  private String timezone;
  @JsonProperty( "timezone_offset" )
  private Integer timezoneOffset;
  @JsonProperty( "current" )
  private Current current;
  @JsonProperty( "minutely" )
  private List< Minutely > minutely = new ArrayList< Minutely >();
  @JsonIgnore
  private Map< String, Object > additionalProperties = new LinkedHashMap< String, Object >();

  @JsonProperty( "lat" )
  public Double getLat() {
    return lat;
  }

  @JsonProperty( "lat" )
  public void setLat( Double lat ) {
    this.lat = lat;
  }

  public OneCall withLat( Double lat ) {
    this.lat = lat;
    return this;
  }

  @JsonProperty( "lon" )
  public Double getLon() {
    return lon;
  }

  @JsonProperty( "lon" )
  public void setLon( Double lon ) {
    this.lon = lon;
  }

  public OneCall withLon( Double lon ) {
    this.lon = lon;
    return this;
  }

  @JsonProperty( "timezone" )
  public String getTimezone() {
    return timezone;
  }

  @JsonProperty( "timezone" )
  public void setTimezone( String timezone ) {
    this.timezone = timezone;
  }

  public OneCall withTimezone( String timezone ) {
    this.timezone = timezone;
    return this;
  }

  @JsonProperty( "timezone_offset" )
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  @JsonProperty( "timezone_offset" )
  public void setTimezoneOffset( Integer timezoneOffset ) {
    this.timezoneOffset = timezoneOffset;
  }

  public OneCall withTimezoneOffset( Integer timezoneOffset ) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

  @JsonProperty( "current" )
  public Current getCurrent() {
    return current;
  }

  @JsonProperty( "current" )
  public void setCurrent( Current current ) {
    this.current = current;
  }

  public OneCall withCurrent( Current current ) {
    this.current = current;
    return this;
  }

  @JsonProperty( "minutely" )
  public List< Minutely > getMinutely() {
    return minutely;
  }

  @JsonProperty( "minutely" )
  public void setMinutely( List< Minutely > minutely ) {
    this.minutely = minutely;
  }

  public OneCall withMinutely( List< Minutely > minutely ) {
    this.minutely = minutely;
    return this;
  }

  @JsonAnyGetter
  public Map< String, Object > getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty( String name, Object value ) {
    this.additionalProperties.put( name, value );
  }

  public OneCall withAdditionalProperty( String name, Object value ) {
    this.additionalProperties.put( name, value );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append( OneCall.class.getName() ).append( '@' ).append( Integer.toHexString( System.identityHashCode( this ) ) ).append( '[' );
    sb.append( "lat" );
    sb.append( '=' );
    sb.append( ( ( this.lat == null ) ? "<null>" : this.lat ) );
    sb.append( ',' );
    sb.append( "lon" );
    sb.append( '=' );
    sb.append( ( ( this.lon == null ) ? "<null>" : this.lon ) );
    sb.append( ',' );
    sb.append( "timezone" );
    sb.append( '=' );
    sb.append( ( ( this.timezone == null ) ? "<null>" : this.timezone ) );
    sb.append( ',' );
    sb.append( "timezoneOffset" );
    sb.append( '=' );
    sb.append( ( ( this.timezoneOffset == null ) ? "<null>" : this.timezoneOffset ) );
    sb.append( ',' );
    sb.append( "current" );
    sb.append( '=' );
    sb.append( ( ( this.current == null ) ? "<null>" : this.current ) );
    sb.append( ',' );
    sb.append( "minutely" );
    sb.append( '=' );
    sb.append( ( ( this.minutely == null ) ? "<null>" : this.minutely ) );
    sb.append( ',' );
    sb.append( "additionalProperties" );
    sb.append( '=' );
    sb.append( ( ( this.additionalProperties == null ) ? "<null>" : this.additionalProperties ) );
    sb.append( ',' );
    if ( sb.charAt( ( sb.length() - 1 ) ) == ',' ) {
      sb.setCharAt( ( sb.length() - 1 ), ']' );
    } else {
      sb.append( ']' );
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = ( ( result * 31 ) + ( ( this.current == null ) ? 0 : this.current.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.timezoneOffset == null ) ? 0 : this.timezoneOffset.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.timezone == null ) ? 0 : this.timezone.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.lon == null ) ? 0 : this.lon.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.minutely == null ) ? 0 : this.minutely.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.additionalProperties == null ) ? 0 : this.additionalProperties.hashCode() ) );
    result = ( ( result * 31 ) + ( ( this.lat == null ) ? 0 : this.lat.hashCode() ) );
    return result;
  }

  @Override
  public boolean equals( Object other ) {
    if ( other == this ) {
      return true;
    }
    if ( ( other instanceof OneCall ) == false ) {
      return false;
    }
    OneCall rhs = ( ( OneCall ) other );
    return ( ( ( ( ( ( ( ( this.current == rhs.current ) || ( ( this.current != null ) && this.current.equals( rhs.current ) ) ) && ( ( this.timezoneOffset == rhs.timezoneOffset ) || ( ( this.timezoneOffset != null ) && this.timezoneOffset.equals( rhs.timezoneOffset ) ) ) ) && ( ( this.timezone == rhs.timezone ) || ( ( this.timezone != null ) && this.timezone.equals( rhs.timezone ) ) ) ) && ( ( this.lon == rhs.lon ) || ( ( this.lon != null ) && this.lon.equals( rhs.lon ) ) ) ) && ( ( this.minutely == rhs.minutely ) || ( ( this.minutely != null ) && this.minutely.equals( rhs.minutely ) ) ) ) && ( ( this.additionalProperties == rhs.additionalProperties ) || ( ( this.additionalProperties != null ) && this.additionalProperties.equals( rhs.additionalProperties ) ) ) ) && ( ( this.lat == rhs.lat ) || ( ( this.lat != null ) && this.lat.equals( rhs.lat ) ) ) );
  }

}
