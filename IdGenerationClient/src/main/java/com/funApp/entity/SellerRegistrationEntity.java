package com.funApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seller_details_table")
public class SellerRegistrationEntity {
    @Id
    @Column(nullable = false)
    private String sellerId;

    @Column(nullable = false)
    private String sellerName;

    @Column(nullable = false)
    private String gstNumber;

    @Column(nullable = false)
    private Integer pinCode;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Long phoneNumber;
}
