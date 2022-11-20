package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckUserRepository extends JpaRepository<checkoutusers, Long> {
	@Query("SELECT u from checkoutusers u WHERE u.email= ?1")
     checkoutusers findByEmail(String email);
}
