package com.org.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Data
@Entity(name = "customer_details_table")
@EntityListeners(AuditingEntityListener.class)
public class CustomerRegistrationEntity implements Serializable {
    @Id
    @Column(nullable = false)
    private String customerId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String dob;
}
