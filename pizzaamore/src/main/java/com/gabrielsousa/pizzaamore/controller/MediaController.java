package com.gabrielsousa.pizzaamore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value="/media")
public class MediaController {
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		return ResponseEntity.ok().body("Retorna");
	}
	
	@PostMapping("/picture")
	public ResponseEntity<String> uploadFile(@RequestParam(value="file") MultipartFile file) {
		return new ResponseEntity<String>("Teste", HttpStatus.OK);
	}

}
