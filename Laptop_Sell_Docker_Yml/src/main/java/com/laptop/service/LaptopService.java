package com.laptop.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.entity.Laptop;
import com.laptop.exception.LaptopNotFoundException;
import com.laptop.repo.Repo;

@Service
public class LaptopService {
	
	@Autowired
	private Repo r;
	
	public Laptop addLaptop(Laptop l)
	{
		
		
		return r.save(l);
	}
	
	public Laptop updateLaptop(Laptop l)
	{
		
		return r.save(l);
	}
	
public List<Laptop> getLaptopAll() {
		
//		Optional<Laptop> laptop = laptopRepository.findById(id).ifPresentOrElse(()->{return },());; 
		
			return r.findAll();
		
	}
	
	
public Laptop getLaptop(int id) throws LaptopNotFoundException{
		
//		Optional<Laptop> laptop = laptopRepository.findById(id).ifPresentOrElse(()->{return },());; 
		try{
			return r.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new LaptopNotFoundException("This laptop is not present");
		}

	}
	
	

}
