![TeamCity build status](https://spartaglobal.teamcity.com/app/rest/builds/buildType:id:WeatherApiRestAssuredExample_BuildTest/statusIcon.svg)

# OpenWeather API Example Project

API test framework using Openweather's API

## Set Up

* Head over to [The OpenWeather website](https://openweathermap.org/).
* Create a free account and sign in.
* Under your account name, select "My API Keys" and generate a new key.

* You then need to create a `weatherapi.properties` file in `/test/resources` and include
  your api key as `apikey=` followed by the generated key.

**This Key should not be shared with anyone.**

## Description

We created tests for a number of API calls available to us.

1. AirPollutionTest checks the current pollutant consentration using the current air pollution API call, taking in a latitude and longitude, returning a value from 1 to 5 (1 being good, 5 being very poor).

1. CurrentWeatherTest allows access to current weather data for any location, requiring the latitude and logitude, returning the string "stations"

1. CheckFiveDayForcast allows you to search the weather forcast for 5 days using the 5 day/ 3 hour forcast API call. It takes in a latitude and longitude, and returns the city name.

1. GeocodingWeatherTest returns the geographical location when a city is passed using the coordinates by location name API call. Passing the city "London" returns the country "GB".

1. OneCallWeatherTest uses the current forcast weather data API call to return the timezone name for the location defined using the latitude and logitude.

1. WeatherMapTest returns a png based on the parameters passed in using the URL format API call.

## Links

Links to API docs for further reading.

* [Air Pollution API](https://openweathermap.org/api/air-pollution)
* [Current weather data](https://openweathermap.org/current)
* [5 day weather forecast](https://openweathermap.org/forecast5)
* [Geocoding API](https://openweathermap.org/api/geocoding-api)
* [One Call API 1.0](https://openweathermap.org/api/one-call-api)
* [Weather maps 1.0](https://openweathermap.org/api/weathermaps)