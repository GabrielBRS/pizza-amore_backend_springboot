package com.gabrielsousa.pizzaamore.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielsousa.pizzaamore.domain.Pizza;
import com.gabrielsousa.pizzaamore.dto.PizzaDTO;
import com.gabrielsousa.pizzaamore.service.PizzaService;

@RestController
@RequestMapping(value="/pizza")
public class PizzaController {
	
	@Autowired
	private PizzaService pizzaService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pizza obj = pizzaService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Pizza>> findAll() {
		List<Pizza> list = pizzaService.findAll();
//		List<PizzaDTO> listDTO = list.stream().map(obj
//				-> new PizzaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="1/{pizzaType}",method=RequestMethod.GET)
	public ResponseEntity<List<Pizza>> findAllByPizzaType(@PathVariable Integer pizzaType) {
		List<Pizza> list = pizzaService.findAllByPizzaType(pizzaType);
//		List<CategoryDTO> listDTO = list.stream().map(obj
//				-> new CategoryDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}

}
