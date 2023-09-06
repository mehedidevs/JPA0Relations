package com.mehedi.JpaRelations.dto;

import com.mehedi.JpaRelations.entity.Customer;
import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {

    private Customer customer;


}
