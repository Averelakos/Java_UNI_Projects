package com.company;

// Iraklis Tsikas
// MPPL20082

import java.io.*;
import java.util.ArrayList;

public class Save_load {

    public void save(ArrayList<Contacts> contactsList, String filename){// saves the contacts from an arraylist in a file
        FileOutputStream fileout= null;
        try {
            fileout = new FileOutputStream(filename);
            ObjectOutputStream objectOut=new ObjectOutputStream(fileout);
            objectOut.writeObject(contactsList);
            objectOut.close();
            fileout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public ArrayList load(String s){ // loads the contact from a file to an arraylist
        ArrayList<Contacts> contactsList=null;
        try {
            FileInputStream fileIn=new FileInputStream(s);
            ObjectInputStream objectIn =new ObjectInputStream(fileIn);
            contactsList=(ArrayList<Contacts>)objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contactsList;


    }




}
