package com.gabrielsousa.pizzaamore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.pizzaamore.domain.BestSellers;

@Repository
public interface BestSellersRepository extends JpaRepository<BestSellers, Integer> {

}
