package com.screen.AbstractFactory;

import com.screen.beans.PCScreen;
import com.screen.beans.Screen;

public class PCFactory implements ScreenAbstractFactory {

	private String brand;
	private String size;
	private String resolution;
	
	
	
	public PCFactory(String brand, String size, String resolution) {
		this.brand = brand;
		this.size = size;
		this.resolution = resolution;
	}



	@Override
	public Screen createScreen() {
		// TODO Auto-generated method stub
		return new PCScreen(this.brand, this.size, this.resolution);
	}

}
