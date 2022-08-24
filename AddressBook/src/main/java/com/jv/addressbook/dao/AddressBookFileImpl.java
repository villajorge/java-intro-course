/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.addressbook.dao;

import com.jv.addressbook.dto.Address;
import com.jv.addressbook.ui.UserIO;
import com.jv.addressbook.ui.UserIOConsoleImpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class AddressBookFileImpl implements AddressBook {
    UserIO io = new UserIOConsoleImpl() {};
    private final static String FILE = "AddressBook.txt";
    private final static String DELIMITER = "::";
    private Scanner scan;
    private Map<String, Address> addresses = new HashMap<>();
    
    @Override
    public Address addAddress(String lastName, Address address) {
        loadAddressBook();
        Address add = addresses.put(lastName, address);
        writeAddressBook();
        return add;
    }

    @Override
    public Address removeAddress(String lastName) {
      loadAddressBook();
      Address removedAddress = addresses.remove(lastName);
      writeAddressBook();
      return removedAddress;
    }

    @Override
    public Address findAddress(String lastName) {
        loadAddressBook();
        return addresses.get(lastName);
    }

    @Override
    public Integer addressCount() {
        loadAddressBook();
        Set<String> lastNames = addresses.keySet();
        return lastNames.size();
    }

    @Override
    public List<Address> returnAddress() {
        loadAddressBook();
        return new ArrayList<Address>(addresses.values());
    }

    public Address unmarshallAddress(String line){
       String[] tokens = line.split(DELIMITER);
       Address newAddress = new Address(tokens[0],tokens[1]);
       newAddress.setStreetAddress(tokens[2]);
       return newAddress;
    }
    
    public void loadAddressBook(){
        try{
        scan = new Scanner(new BufferedReader (new FileReader(FILE)));
        }catch (FileNotFoundException e){
            io.print("File not found");
        }
        String line;
        Address currentAddress;
        
        while (scan.hasNext()){
            line = scan.nextLine();
            currentAddress = unmarshallAddress(line);
            addresses.put(currentAddress.getLastName(),currentAddress);
        }
        scan.close();
        }
    
    private String marshallAddress (Address curAddress){
        String addressStr = curAddress.getFirstName() + DELIMITER;
        addressStr += curAddress.getLastName() + DELIMITER;
        addressStr += curAddress.getStreetAddress();
        return addressStr;
    }
    
    private void writeAddressBook() {
    PrintWriter out = null;
    try{
        out = new PrintWriter(new FileWriter(FILE));
    }   catch (IOException ex) {
            io.print("Could not save address");
        }
    String addressStr;
    List<Address> addressList = this.returnAddress();
    for (Address curAddress : addressList){
        addressStr = marshallAddress(curAddress);
        out.println(addressStr);
        out.flush();
    }
    out.close();
}
}
