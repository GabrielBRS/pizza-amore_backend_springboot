package com.gabrielsousa.pizzaamore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.pizzaamore.domain.Requests;

@Repository
public interface RequestRepository extends JpaRepository<Requests, Integer> {


}
