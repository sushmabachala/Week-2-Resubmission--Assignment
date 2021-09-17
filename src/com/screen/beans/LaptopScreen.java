package com.screen.beans;

public class LaptopScreen implements Screen {
	private String brand;
	private String size;
	private String resolution;
	
	
	public LaptopScreen(String brand, String size, String resolution) {
		this.brand = brand;
		this.size = size;
		this.resolution = resolution;
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String getResolution() {
		// TODO Auto-generated method stub
		return this.resolution;
	}

	@Override
	public String toString() {
		return "LaptopScreen [brand=" + brand + ", size=" + size + ", resolution=" + resolution + "]";
	}

}
