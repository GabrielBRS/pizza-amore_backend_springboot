package com.gabrielsousa.pizzaamore.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielsousa.pizzaamore.domain.BestSellers;
import com.gabrielsousa.pizzaamore.dto.BestSellersDTO;
import com.gabrielsousa.pizzaamore.service.BestSellersService;

@RestController
@RequestMapping(value="/best-sellers")
public class BestSellersController {
	
	@Autowired
	private BestSellersService bestSellersService;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<BestSellers> find(@PathVariable Integer id) {
		BestSellers obj = bestSellersService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<BestSellersDTO>> findAll() {
		List<BestSellers> list = bestSellersService.findAll();
		List<BestSellersDTO> listDTO = list.stream().map(obj
				-> new BestSellersDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

}
