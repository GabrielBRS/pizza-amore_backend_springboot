package com.gabrielsousa.pizzaamore.dto;

import java.io.Serializable;

import com.gabrielsousa.pizzaamore.domain.BestSellers;
import com.gabrielsousa.pizzaamore.domain.Pizza;

public class PizzaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private BestSellers bestSellers;
	
	private Integer sellers;
	
	private Double invoicing;
	
	private Double profit;
	
	private Pizza pizza;
	
//	private String namePizza;
//	
//	private Integer pizzaType;
//	
//	private Double price;
//	
//	private Double priceWithPromotion;
//	
//	private List<String> ingredients = new ArrayList<>();
	
	public PizzaDTO() {
		
	}

	public PizzaDTO(Pizza pizza) {
	super();
	this.id = pizza.getId();
	this.bestSellers = pizza.getBestSellers();
	this.sellers = sellers;
	this.invoicing = invoicing;
	this.profit = profit;
	this.pizza = pizza;
}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BestSellers getBestSellers() {
		return bestSellers;
	}

	public void setBestSellers(BestSellers bestSellers) {
		this.bestSellers = bestSellers;
	}

	public Integer getSellers() {
		return sellers;
	}

	public void setSellers(Integer sellers) {
		this.sellers = sellers;
	}

	public Double getInvoicing() {
		return invoicing;
	}

	public void setInvoicing(Double invoicing) {
		this.invoicing = invoicing;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
