package com.example.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="shipping_details")
public class ShippingDetails {
    @Id
    private String trackingNumber;
    private String userId;
    private String order_id;
    private Date shippingDate;
    private Date arrivalDate;
    private String shippingStatus;
    private String shippedBy;

}
