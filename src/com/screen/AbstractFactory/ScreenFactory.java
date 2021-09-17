package com.screen.AbstractFactory;

import com.screen.beans.Screen;

public class ScreenFactory {

	public static Screen createScreen(ScreenAbstractFactory obj) {
		return obj.createScreen();
	}
	
}
