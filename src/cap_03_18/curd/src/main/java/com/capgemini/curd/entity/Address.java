package com.capgemini.curd.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String country;
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employee;
}
