package com.lineage.providerservices.service;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lineage.providerservices.model.Provider;

public interface ProviderRepository extends MongoRepository<Provider,String>{
	
	public Provider findByName(String name);
	public List<Provider> findAll();

}