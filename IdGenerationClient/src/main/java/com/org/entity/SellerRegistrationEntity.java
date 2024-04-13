package com.org.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "seller_details_table")
@EntityListeners(AuditingEntityListener.class)
public class SellerRegistrationEntity implements Serializable {
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

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}
