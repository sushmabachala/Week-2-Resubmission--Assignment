package com.screen.test;

import com.screen.AbstractFactory.LaptopFactory;
import com.screen.AbstractFactory.PCFactory;
import com.screen.AbstractFactory.ScreenFactory;
import com.screen.beans.Screen;

public class ScreenClient {
	
	public static void main(String[] args) {
		
		Screen pcScreen = ScreenFactory.createScreen(new PCFactory("Dell", "25 inches", "1920 x 1080 pixels"));
		
		Screen lapScreen = ScreenFactory.createScreen(new LaptopFactory("HP", "32 inches", "3840 × 2160 pixels"));
	    
		System.out.println("PC Screen====>"+pcScreen);
		System.out.println("Laptop Screen====>"+lapScreen);
	
	}

}
