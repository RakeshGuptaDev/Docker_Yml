package com.laptop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.entity.Laptop;

@Repository
public interface Repo extends JpaRepository<Laptop, Integer> {
	
	

}
