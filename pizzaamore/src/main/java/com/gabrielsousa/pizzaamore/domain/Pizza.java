package com.gabrielsousa.pizzaamore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pizza implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String namePizza;
	
	private Integer pizzaType;
	
	private Double price;
	
	private Double priceWithPromotion;
	
	@ElementCollection
	@CollectionTable(name="INGREDIENTES")
	private List<String> ingredients = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy ="pizzas")
	private BestSellers bestsellers;
	
	public Pizza() {
		
	}

	public Pizza(Integer id, String namePizza, Integer pizzaType, Double price, Double priceWithPromotion,
			List<String> ingredients) {
		super();
		this.id = id;
		this.namePizza = namePizza;
		this.pizzaType = pizzaType;
		this.price = price;
		this.priceWithPromotion = priceWithPromotion;
		this.ingredients = ingredients;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamePizza() {
		return namePizza;
	}

	public void setNamePizza(String namePizza) {
		this.namePizza = namePizza;
	}

	public Integer getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(Integer pizzaType) {
		this.pizzaType = pizzaType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPriceWithPromotion() {
		return priceWithPromotion;
	}

	public void setPriceWithPromotion(Double priceWithPromotion) {
		this.priceWithPromotion = priceWithPromotion;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public BestSellers getBestSellers() {
		return bestsellers;
	}

	public void setBestSellers(BestSellers bestSellers) {
		this.bestsellers = bestSellers;
	}
	
}
