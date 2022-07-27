package com.gabrielsousa.pizzaamore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabrielsousa.pizzaamore.domain.BestSellers;
import com.gabrielsousa.pizzaamore.domain.Pizza;
import com.gabrielsousa.pizzaamore.repository.BestSellersRepository;
import com.gabrielsousa.pizzaamore.repository.PizzaRepository;

@SpringBootApplication
public class PizzaamoreApplication implements CommandLineRunner {

	@Autowired
	PizzaRepository pizzaRepository;
	
	@Autowired
	BestSellersRepository bestSellersRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PizzaamoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<String> ing1 = new ArrayList<>();
		ing1.add("Banana");
		ing1.add("Nutela");
		ing1.add("Queijo");
		
		Pizza p1 = new Pizza(null, "Pizza de Banana com Nutela", 1, 45.00, 40.00, ing1);
		
		List<String> ing2 = new ArrayList<>();
		ing2.add("Chocolate");
		ing2.add("Nutela");
		ing2.add("Queijo");
		
		Pizza p2 = new Pizza(null, "Pizza de Chocolate com Nutela", 1, 45.00, 40.00, ing2);
		
		List<String> ing3 = new ArrayList<>();
		ing3.add("Presunto");
		ing3.add("Ovos");
		ing3.add("Azeitona");
		ing3.add("Pimentão");
		ing3.add("Queijo");
		
		Pizza p3 = new Pizza(null, "Pizza de Portuguesa", 2, 35.00, 30.00, ing3);
		
		List<String> ing4 = new ArrayList<>();
		ing4.add("Calabresa");
		ing4.add("Queijo");
		
		Pizza p4 = new Pizza(null, "Pizza de Calabresa", 2, 30.00, 30.00, ing4);
		
		List<String> ing5 = new ArrayList<>();
		ing5.add("Chocolate");
		ing5.add("Queijo");
		
		Pizza p5 = new Pizza(null, "Pizza de Chocolate", 3, 45.00, 40.00, ing5);
		
		List<String> ing6 = new ArrayList<>();
		ing6.add("Banana");
		ing6.add("Canela");
		ing6.add("Queijo");
		
		Pizza p6 = new Pizza(null, "Pizza de Banana", 3, 45.00, 40.00, ing6);
		
		
		pizzaRepository.save(p1);
		pizzaRepository.save(p2);
		pizzaRepository.save(p3);
		pizzaRepository.save(p4);
		pizzaRepository.save(p5);
		pizzaRepository.save(p6);
		
		
		BestSellers bs1 = new BestSellers(null, 1, 3000, 5000.00, 1000.00,p2);
		BestSellers bs2 = new BestSellers(null, 2, 2000, 3500.00, 800.00,p4);
		BestSellers bs3 = new BestSellers(null, 3, 1500, 2500.00, 500.00,p5);
		
		
		bestSellersRepository.save(bs1);
		bestSellersRepository.save(bs2);
		bestSellersRepository.save(bs3);
	}

}
