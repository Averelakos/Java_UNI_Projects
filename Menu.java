package com.company;
// Iraklis Tsikas
// MPPL20082

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    public void menu(ArrayList<Contacts> contactsList) throws IOException {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Utilities unit = new Utilities();
            // Print the menu on the user and the choices he can make
            System.out.println("___________________________________________");
            System.out.println("|-------------------MENU-------------------|");
            System.out.println("|    1.Display contacts                    |");
            System.out.println("|    2.Add new contact                     |");
            System.out.println("|    3.Search contact with name            |");
            System.out.println("|    4.Change contact item based with name |");
            System.out.println("|    5.Delete contact based with name      |");
            System.out.println("|    6. Save & Exit                        |");
            System.out.println("|__________________________________________|");
            System.out.println();
            System.out.print("Enter your choice: ");
            String userIn = scanner.next(); // The input of the user

            unit.clearScreen(); // clears the screen after the input of the user (its not working on IJ)



            if (userIn.equals("1")) {
                unit.Display(contactsList); // call the method display from the class utilities

            } else if (userIn.equals("2")) {
                unit.ADD(contactsList); // call the ADD display from the class utilities

            } else if (userIn.equals("3")) {
                unit.Search(contactsList); // call the method Search from the class utilities

            } else if (userIn.equals("4")) {
                unit.change(contactsList); // call the method change from the class utilities

            } else if (userIn.equals("5")) {
                unit.delete(contactsList); // call the method delete from the class utilities

            } else if (userIn.equals("6")) {
                Save_load save = new Save_load();
                save.save(contactsList, "agenda.ser"); // call the method save from the class Save_load
                System.out.println("Data saved......");
                System.out.println("Done");
                return;
            }


        }
    }



}
