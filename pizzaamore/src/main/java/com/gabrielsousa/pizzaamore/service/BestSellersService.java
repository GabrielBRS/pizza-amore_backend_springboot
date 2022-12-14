package com.gabrielsousa.pizzaamore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielsousa.pizzaamore.domain.BestSellers;
import com.gabrielsousa.pizzaamore.repository.BestSellersRepository;
import com.gabrielsousa.pizzaamore.repository.PizzaRepository;

@Service
public class BestSellersService {

	@Autowired
	private BestSellersRepository bestSellersRepository;
	
	@Autowired
	private PizzaRepository pizzaRepository;
	
	public BestSellers find(Integer id) {
		Optional<BestSellers> obj = bestSellersRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<BestSellers> findAll(){
		BestSellers bs;
		
		return bestSellersRepository.findAll();
	}
	
}
