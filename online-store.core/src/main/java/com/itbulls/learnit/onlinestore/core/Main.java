package com.itbulls.learnit.onlinestore.core;

import java.util.Locale;

import com.itbulls.learnit.onlinestore.core.menu.Menu;
import com.itbulls.learnit.onlinestore.core.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		
		
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}