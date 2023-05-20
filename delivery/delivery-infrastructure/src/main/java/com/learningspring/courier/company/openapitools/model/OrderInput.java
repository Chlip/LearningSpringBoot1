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
 * OrderInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T02:17:06.878038300+02:00[Europe/Warsaw]")
public class OrderInput {

  private Object customer;

  private Object courier;

  private String deliveryAddress;

  private String pickupAddress;

  private String pickupDate;

  private String status;

  public OrderInput customer(Object customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public Object getCustomer() {
    return customer;
  }

  public void setCustomer(Object customer) {
    this.customer = customer;
  }

  public OrderInput courier(Object courier) {
    this.courier = courier;
    return this;
  }

  /**
   * Get courier
   * @return courier
  */
  
  @Schema(name = "courier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("courier")
  public Object getCourier() {
    return courier;
  }

  public void setCourier(Object courier) {
    this.courier = courier;
  }

  public OrderInput deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  */
  
  @Schema(name = "deliveryAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public OrderInput pickupAddress(String pickupAddress) {
    this.pickupAddress = pickupAddress;
    return this;
  }

  /**
   * Get pickupAddress
   * @return pickupAddress
  */
  
  @Schema(name = "pickupAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupAddress")
  public String getPickupAddress() {
    return pickupAddress;
  }

  public void setPickupAddress(String pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public OrderInput pickupDate(String pickupDate) {
    this.pickupDate = pickupDate;
    return this;
  }

  /**
   * Get pickupDate
   * @return pickupDate
  */
  
  @Schema(name = "pickupDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupDate")
  public String getPickupDate() {
    return pickupDate;
  }

  public void setPickupDate(String pickupDate) {
    this.pickupDate = pickupDate;
  }

  public OrderInput status(String status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInput orderInput = (OrderInput) o;
    return Objects.equals(this.customer, orderInput.customer) &&
        Objects.equals(this.courier, orderInput.courier) &&
        Objects.equals(this.deliveryAddress, orderInput.deliveryAddress) &&
        Objects.equals(this.pickupAddress, orderInput.pickupAddress) &&
        Objects.equals(this.pickupDate, orderInput.pickupDate) &&
        Objects.equals(this.status, orderInput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, courier, deliveryAddress, pickupAddress, pickupDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInput {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    courier: ").append(toIndentedString(courier)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    pickupDate: ").append(toIndentedString(pickupDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

