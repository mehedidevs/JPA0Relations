package com.mehedi.JpaRelations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Product {
    @Id
    private int pid;
    private String name;
    private int qty;
    private int price;




}
