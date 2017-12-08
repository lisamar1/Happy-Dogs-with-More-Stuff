package com.lmig.gfc.happydogs.api;

import com.lmig.gfc.happydogs.models.Dog;

public class DogView {

	private Dog dog;

	public DogView(Dog dog) {
		this.dog = dog;
	}

	public Long getId() {
		return dog.getId();

	}

	public String getName() {
		return dog.getName();
	}

	public String getBreed() {
		return dog.getBreed();
	}
	
	
}
