package com.gabrielsousa.pizzaamore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.pizzaamore.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {


}
