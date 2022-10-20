package com.gabrielsousa.pizzaamore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.pizzaamore.domain.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

	public List<Pizza> findByPizzaType(@Param("pizzaType") Integer pizzaType);


}
