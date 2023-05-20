package com.learningspring.courier.company.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Tracking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T02:17:06.878038300+02:00[Europe/Warsaw]")
public class Tracking {

  private Integer trackingId;

  private Object delivery;

  private String status;

  private String location;

  public Tracking trackingId(Integer trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
  */
  
  @Schema(name = "trackingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackingId")
  public Integer getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(Integer trackingId) {
    this.trackingId = trackingId;
  }

  public Tracking delivery(Object delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  */
  
  @Schema(name = "delivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery")
  public Object getDelivery() {
    return delivery;
  }

  public void setDelivery(Object delivery) {
    this.delivery = delivery;
  }

  public Tracking status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Tracking location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tracking tracking = (Tracking) o;
    return Objects.equals(this.trackingId, tracking.trackingId) &&
        Objects.equals(this.delivery, tracking.delivery) &&
        Objects.equals(this.status, tracking.status) &&
        Objects.equals(this.location, tracking.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId, delivery, status, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tracking {\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

