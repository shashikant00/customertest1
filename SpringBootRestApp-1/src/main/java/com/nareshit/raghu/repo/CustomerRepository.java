package com.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.raghu.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
