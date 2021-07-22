package com.company;
// Iraklis Tsikas
// MPPL20082

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {

    Contacts c1 =new Contacts();
    Scanner scanner=new Scanner(System.in);
    public void ADD(ArrayList<Contacts> contactsList){

        // prints the area and waits the answer from the user to fill a contact
        System.out.println("Enter name");
        String x=scanner.next();
        c1.setName(x);
        System.out.println("Enter surname");
        x=scanner.next();
        c1.setSurname(x);
        System.out.println("Enter mobile number:");
        x=scanner.next();
        c1.setMobile(x);
        System.out.println("Enter address");
        x=scanner.next();
        c1.setAddress(x);
        System.out.println("Enter birth date with '/' between numbers: ");
        x=scanner.next();
        c1.setBirth_date(x);
        contactsList.add(c1);
        System.out.println();
        System.out.println("The contact was added");
        System.out.println("Fullname: "+c1.getName() +" "+c1.getSurname()+" Phone: "+c1.getMobile()+" "+"Address: "+c1.getAddress()+" "+"Birthday: "+c1.getBirth_date());
        System.out.println();
        System.out.println("Press enter to return to menu");
        scanner.nextLine(); // doesnt work



    }

    public void Display(ArrayList<Contacts> contactsList)  {
        for (Contacts s:contactsList){ // for every contact in contactlist prints all the elements of every contact in the arraylist
            System.out.println("Fullname: "+s.getName() +" "+s.getSurname()+" Phone: "+s.getMobile()+" "+"Address: "+s.getAddress()+" "+"Birthday: "+s.getBirth_date());

        }
        System.out.println();
        System.out.println("Press enter to return to menu");
        scanner.nextLine(); // waits enter from the user to return to the menu

    }

    public void Search(ArrayList<Contacts> contactsList){
        System.out.println("Enter the name of the contact:");
        String name=scanner.next(); // the user enter a string
        for(Contacts s:contactsList){ // for every contact in contactlist
            if(name.equals(s.getName())) { // checks every name value in the arraylist if it match with the string the user input
                System.out.println("Fullname: "+s.getName() +" "+s.getSurname()+" Phone: "+s.getMobile()+" "+"Address: "+s.getAddress()+" "+"Birthday: "+s.getBirth_date());
                System.out.println();
                System.out.println("Press enter to return to menu");
                scanner.nextLine();
                return;
            }
        }
        // if the string the is not inside the arraylist prints that is not inside the arraylist
        System.out.println("Contact with that name is not registered");
    }

    public void change(ArrayList<Contacts> contactsList){
        System.out.println("Enter the name of the contact:");
        String name=scanner.next(); // the user enter a string
        for(Contacts s:contactsList){ // for every contact in contactlist
            if(name.equals(s.getName())) { // checks every name value in the arraylist if it match with the string the user input

                while(true) {
                    System.out.println("Fullname: "+s.getName() +" "+s.getSurname()+" Phone: "+s.getMobile()+" "+"Address: "+s.getAddress()+" "+"Birthday: "+s.getBirth_date());
                    System.out.println();
                    // returns the contact and prints the menu with the choices for the value the user wants to change
                    //after a change returns the contact with change and print the menu again for another change or exit
                    System.out.println("____________________________ ");
                    System.out.println("|What do you want to change:|");
                    System.out.println("|         1.name            |");
                    System.out.println("|         2.surname         |");
                    System.out.println("|         3.mobile          |");
                    System.out.println("|         4.address         |");
                    System.out.println("|         5.birthday        |");
                    System.out.println("|         6.return to menu  |");
                    System.out.println("|___________________________|");
                    String choice=scanner.next();
                    if(choice.equals("1")){ // change name
                        System.out.println("Enter your change:");
                        String x = scanner.next();
                        s.setName(x);

                    }else if(choice.equals("2")){ // change surname
                        System.out.println("Enter your change:");
                        String x = scanner.next();
                        s.setSurname(x);

                    }else if(choice.equals("3")){ // change mobile
                        System.out.println("Enter your change:");
                        String x = scanner.next();
                        s.setMobile(x);

                    }else if(choice.equals("4")){ // change address
                        System.out.println("Enter your change:");
                        String x = scanner.next();
                        s.setAddress(x);

                    }else if(choice.equals("5")){ // change birthday
                        System.out.println("Enter your change:");
                        String x = scanner.next();
                        s.setBirth_date(x);

                    }else if(choice.equals("6")){ // exit and return to the main menu

                        return;
                    }

                }
            }
        }
        // if the contact does not exist print that is not registered
        System.out.println("Contact with that name is not registered");
        System.out.println();
    }

    public void delete(ArrayList<Contacts> contactsList){
        System.out.println("Enter the name of the contact:");
        String name=scanner.next(); // the user inputs the string with the name of the contact he wants to delete
        for(Contacts s:contactsList){
            if(name.equals(s.getName())) { // if the string match a contact get inside the if and prints the full contact
                System.out.println("Contact found successfully");
                System.out.println("Fullname: "+s.getName() +" "+s.getSurname()+" Phone: "+s.getMobile()+" "+"Address: "+s.getAddress()+" "+"Birthday: "+s.getBirth_date());
                while (true){ // in case the user change his mind or made a mistake
                    System.out.println("Continue with deleting the contact");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    System.out.print("Enter: ");
                    String YN=scanner.next();
                    if(YN.equals("1")){
                        contactsList.remove(s); // if the user is sure and press the yes choice it removes the contact from the arraylist
                        System.out.println("Contact was removed successfully");
                        System.out.println();

                        return;
                    }else{ // if the user chose the no returns to the main menu
                        return;
                    }

                }

            }
        }
        // if the contact is not inside the arraylist prints that is not registered
        System.out.println("Contact with that name is not registered");
        System.out.println();

    }
    public static void clearScreen() { // to clear the screen after a choice(for some reason doesnt work in IJ and not in all chooses of the main menu)

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }



}
