package com.gabrielsousa.pizzaamore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielsousa.pizzaamore.domain.Pizza;
import com.gabrielsousa.pizzaamore.repository.PizzaRepository;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzaRepository;
	
	public Pizza find(Integer id) {
		Optional<Pizza> obj = pizzaRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Pizza> findAll(){
		return pizzaRepository.findAll();
	}
	
	public List<Pizza> findAllByPizzaType(Integer pizzaType){
		return pizzaRepository.findByPizzaType(pizzaType);
	}
}
