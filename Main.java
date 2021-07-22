package com.company;

// Iraklis Tsikas
// MPPL20082

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
		Menu UI = new Menu();
		File temp;
		temp = new File("agenda.ser");
		if (temp.exists()) { // checks if there is a file with contacts
			Save_load load = new Save_load();
			ArrayList<Contacts> contactsList = load.load("agenda.ser"); // if there is loads the content of the file in the arraylist
			UI.menu(contactsList);
		}else { // if there is no file it creates an empty arraylist
			ArrayList<Contacts> contactsList = new ArrayList<>();

			UI.menu(contactsList);
		}


	}

}
