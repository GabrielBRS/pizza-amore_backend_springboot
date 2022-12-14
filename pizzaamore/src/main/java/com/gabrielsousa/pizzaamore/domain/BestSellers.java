package com.gabrielsousa.pizzaamore.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BestSellers implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Integer bestSellers;
	
	private Integer sellers;
	
	private Double invoicing;
	
	private Double profit;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="bestsellers_id")
	private Pizza pizzas;
	
	 
	public BestSellers() {
		
	}

	public BestSellers(Integer id, Integer bestSellers, Integer sellers, Double invoicing, Double profit,
			Pizza pizzas) {
		super();
		this.id = id;
		this.bestSellers = bestSellers;
		this.sellers = sellers;
		this.invoicing = invoicing;
		this.profit = profit;
		this.pizzas = pizzas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBestSellers() {
		return bestSellers;
	}

	public void setBestSellers(Integer bestSellers) {
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

	public Pizza getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizza pizzas) {
		this.pizzas = pizzas;
	}

}
