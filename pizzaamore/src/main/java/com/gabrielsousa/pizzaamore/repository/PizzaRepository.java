package com.gabrielsousa.pizzaamore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.pizzaamore.domain.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {


}