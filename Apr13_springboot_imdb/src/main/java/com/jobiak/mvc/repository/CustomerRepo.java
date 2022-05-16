package com.jobiak.mvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jobiak.mvc.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
