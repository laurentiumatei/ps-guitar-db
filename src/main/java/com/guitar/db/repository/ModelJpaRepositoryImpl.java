package com.guitar.db.repository;

public class ModelJpaRepositoryImpl implements ModelJpaRepositoryCustom {

	//Here we can autowire different classes using Spring
	
	@Override
	public void customMethod() {
		System.out.println("I'm a custom method");

	}

}
