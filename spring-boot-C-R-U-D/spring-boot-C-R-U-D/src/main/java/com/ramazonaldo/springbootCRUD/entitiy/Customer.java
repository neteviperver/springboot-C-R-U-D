package com.ramazonaldo.springbootCRUD.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String firstName;
    private String lastName;
}
