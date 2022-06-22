package com.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.entity.Laptop;
import com.laptop.service.LaptopService;

@RestController
@RequestMapping("/lp")
public class LaptopController {
	@Autowired
	private LaptopService ls;
	
	@PostMapping
	public Laptop addLappy(@RequestBody Laptop l)
	{
		return ls.addLaptop(l);
	}
	
	@PutMapping
	public Laptop updateLappy(@RequestBody Laptop l)
	{
		return ls.updateLaptop(l);
	}
	
	@GetMapping
	public List<Laptop> allLappy()
	{
		return ls.getLaptopAll();
	}
	
	@GetMapping("/{id}")
	public Laptop getLappy(@PathVariable int id)
	{
		return ls.getLaptop(id);
	}
	
	
	
}
