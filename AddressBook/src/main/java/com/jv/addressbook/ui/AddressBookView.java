/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.addressbook.ui;

import com.jv.addressbook.dto.Address;
import java.util.List;


/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class AddressBookView {
    private final UserIO io;
    
    public AddressBookView(UserIO io){
        this.io = io;
    }
    
    
    public int printMenuAndSelection(){
        io.print("Main Menu");
        io.print("1. Add an address");
        io.print("2. Remove an address");
        io.print("3. Find address");
        io.print("4. Count of all addresses");
        io.print("5. List all addresses");
        
        return io.readInt("Please select from above choices.",1,5);  
    }
    

    
    public void displayAllAddressesBanner(){
        io.print("=== All Addresses ===");
    }
    
    public void displayCountAddressBanner(){
        io.print("===Count of Addreses ===");
    }
    
    
    public void displayFindAddressBanner(){
        io.print("=== Find Adddress ===");
    }
    
    public void displayRemoveAddressBanner(){
        io.print("=== Remove Address ===");
    }
    
    public void displayAddAddressBanner(){
        io.print("=== Add Address ===");
    }

    public void displaySuccessCreateBanner(){
        io.print("Created new address");
    }
    
    public Address getAddressInfo(){
        String fName = io.readString("Enter first name.");
        String lName = io.readString("Enter last name.");
        String address = io.readString("Enter street address.");
        Address newAddress = new Address(fName, lName);
        newAddress.setStreetAddress(address);
        return newAddress;
    }
   
    public void displayAddress(Address add){
        if (add != null){
            io.print(add.getFirstName() + " " + add.getLastName());
            io.print(add.getStreetAddress());
        }else{
            io.print("No such address");
        }
        io.readString("Please hit enter to coninue");
        
    }
    
    public void displayRemoveResult(Address add){
        if(add != null){
            io.print("Student successfully removed");
        }else{
            io.print("No such student");
        }
        io.readString("Please hit enter to continue");
    }
    
    public void displayUknownCommand(){
        io.print("Unknown command");
    }
    
    public String getLastName(){
        return io.readString("Enter last name");
    }
    
    public void displayCount(int count){
        io.print("Current address book contains "+count+ " records.");
    }
    
    public void displayAddressList(List<Address> add){
        for (Address address : add){
            String addInfo = String.format("%s %s \n%s",
                    address.getFirstName(),
                    address.getLastName(),
                    address.getStreetAddress());
            io.print(addInfo);
        }
        io.readString("Please hit enter to continue.");
    }
}
