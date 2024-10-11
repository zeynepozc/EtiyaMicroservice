package com.etiya.customerservice.entity;

import com.etiya.customerservice.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_accounts")
@SQLRestriction(value = "deleted_date IS NULL")
public class CustomerAccount extends BaseEntity
{
    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @Column(name = "account_status")
    private String accountStatus;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "action")
    private String action;

    @Column(name = "account_description")
    private String accountDescription;
}
