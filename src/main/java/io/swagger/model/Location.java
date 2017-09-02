package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-24T16:07:52.906Z")

public class Location   {
  @JsonProperty("locationType")
  private String locationType = null;

  @JsonProperty("specialMessage")
  private String specialMessage = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("streetAddress")
  private String streetAddress = null;

  @JsonProperty("distance")
  private String distance = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("hourOfOperation")
  private String hourOfOperation = null;

  public Location locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @ApiModelProperty(value = "")


  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public Location specialMessage(String specialMessage) {
    this.specialMessage = specialMessage;
    return this;
  }

   /**
   * Get specialMessage
   * @return specialMessage
  **/
  @ApiModelProperty(value = "")


  public String getSpecialMessage() {
    return specialMessage;
  }

  public void setSpecialMessage(String specialMessage) {
    this.specialMessage = specialMessage;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Location zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Location streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @ApiModelProperty(value = "")


  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Location distance(String distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(value = "")


  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public Location latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Location longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Location telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Location fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Location hourOfOperation(String hourOfOperation) {
    this.hourOfOperation = hourOfOperation;
    return this;
  }

   /**
   * Get hourOfOperation
   * @return hourOfOperation
  **/
  @ApiModelProperty(value = "")


  public String getHourOfOperation() {
    return hourOfOperation;
  }

  public void setHourOfOperation(String hourOfOperation) {
    this.hourOfOperation = hourOfOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.locationType, location.locationType) &&
        Objects.equals(this.specialMessage, location.specialMessage) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.zipCode, location.zipCode) &&
        Objects.equals(this.streetAddress, location.streetAddress) &&
        Objects.equals(this.distance, location.distance) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.telephone, location.telephone) &&
        Objects.equals(this.fax, location.fax) &&
        Objects.equals(this.hourOfOperation, location.hourOfOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationType, specialMessage, name, city, state, zipCode, streetAddress, distance, latitude, longitude, telephone, fax, hourOfOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    specialMessage: ").append(toIndentedString(specialMessage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    hourOfOperation: ").append(toIndentedString(hourOfOperation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

