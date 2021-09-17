package com.screen.AbstractFactory;

import com.screen.beans.LaptopScreen;
import com.screen.beans.Screen;

public class LaptopFactory implements ScreenAbstractFactory {
	
	
	private String brand;
	private String size;
	private String resolution;
	
	public LaptopFactory(String brand, String size, String resolution) {
		super();
		this.brand = brand;
		this.size = size;
		this.resolution = resolution;
	}

	@Override
	public Screen createScreen() {
		// TODO Auto-generated method stub
		return new LaptopScreen(this.brand, this.size, this.resolution);
	}

}
