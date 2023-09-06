package com.mehedi.JpaRelations.repository;

import com.mehedi.JpaRelations.entity.Customer;
import com.mehedi.JpaRelations.entity.JoinResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.mehedi.JpaRelations.entity.JoinResponse(c.id, c.name, p.name,p.price) FROM Customer c JOIN c.products p")
    public List<JoinResponse> getJoinInfo();


}
