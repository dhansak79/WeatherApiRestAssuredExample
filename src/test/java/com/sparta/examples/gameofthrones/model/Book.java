
package com.sparta.examples.gameofthrones.model;

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
    "url",
    "name",
    "isbn",
    "authors",
    "numberOfPages",
    "publisher",
    "country",
    "mediaType",
    "released",
    "characters",
    "povCharacters"
})
@Generated("jsonschema2pojo")
public class Book {

    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("authors")
    private List<String> authors = new ArrayList<String>();
    @JsonProperty("numberOfPages")
    private Integer numberOfPages;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("country")
    private String country;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("released")
    private String released;
    @JsonProperty("characters")
    private List<String> characters = new ArrayList<String>();
    @JsonProperty("povCharacters")
    private List<String> povCharacters = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Book withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Book withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    @JsonProperty("numberOfPages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @JsonProperty("numberOfPages")
    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book withNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Book withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    @JsonProperty("mediaType")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Book withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @JsonProperty("released")
    public String getReleased() {
        return released;
    }

    @JsonProperty("released")
    public void setReleased(String released) {
        this.released = released;
    }

    public Book withReleased(String released) {
        this.released = released;
        return this;
    }

    @JsonProperty("characters")
    public List<String> getCharacters() {
        return characters;
    }

    @JsonProperty("characters")
    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public Book withCharacters(List<String> characters) {
        this.characters = characters;
        return this;
    }

    @JsonProperty("povCharacters")
    public List<String> getPovCharacters() {
        return povCharacters;
    }

    @JsonProperty("povCharacters")
    public void setPovCharacters(List<String> povCharacters) {
        this.povCharacters = povCharacters;
    }

    public Book withPovCharacters(List<String> povCharacters) {
        this.povCharacters = povCharacters;
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

    public Book withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Book.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("isbn");
        sb.append('=');
        sb.append(((this.isbn == null)?"<null>":this.isbn));
        sb.append(',');
        sb.append("authors");
        sb.append('=');
        sb.append(((this.authors == null)?"<null>":this.authors));
        sb.append(',');
        sb.append("numberOfPages");
        sb.append('=');
        sb.append(((this.numberOfPages == null)?"<null>":this.numberOfPages));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("mediaType");
        sb.append('=');
        sb.append(((this.mediaType == null)?"<null>":this.mediaType));
        sb.append(',');
        sb.append("released");
        sb.append('=');
        sb.append(((this.released == null)?"<null>":this.released));
        sb.append(',');
        sb.append("characters");
        sb.append('=');
        sb.append(((this.characters == null)?"<null>":this.characters));
        sb.append(',');
        sb.append("povCharacters");
        sb.append('=');
        sb.append(((this.povCharacters == null)?"<null>":this.povCharacters));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.isbn == null)? 0 :this.isbn.hashCode()));
        result = ((result* 31)+((this.mediaType == null)? 0 :this.mediaType.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.povCharacters == null)? 0 :this.povCharacters.hashCode()));
        result = ((result* 31)+((this.characters == null)? 0 :this.characters.hashCode()));
        result = ((result* 31)+((this.numberOfPages == null)? 0 :this.numberOfPages.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.released == null)? 0 :this.released.hashCode()));
        result = ((result* 31)+((this.authors == null)? 0 :this.authors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Book) == false) {
            return false;
        }
        Book rhs = ((Book) other);
        return (((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.isbn == rhs.isbn)||((this.isbn!= null)&&this.isbn.equals(rhs.isbn))))&&((this.mediaType == rhs.mediaType)||((this.mediaType!= null)&&this.mediaType.equals(rhs.mediaType))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.povCharacters == rhs.povCharacters)||((this.povCharacters!= null)&&this.povCharacters.equals(rhs.povCharacters))))&&((this.characters == rhs.characters)||((this.characters!= null)&&this.characters.equals(rhs.characters))))&&((this.numberOfPages == rhs.numberOfPages)||((this.numberOfPages!= null)&&this.numberOfPages.equals(rhs.numberOfPages))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.released == rhs.released)||((this.released!= null)&&this.released.equals(rhs.released))))&&((this.authors == rhs.authors)||((this.authors!= null)&&this.authors.equals(rhs.authors))));
    }

}
