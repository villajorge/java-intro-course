/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jv.addressbook.controller;

import com.jv.addressbook.dao.AddressBook;
import com.jv.addressbook.dto.Address;
import com.jv.addressbook.ui.AddressBookView;
import java.util.List;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class AddressBookController {
    private AddressBook dao;
    private AddressBookView view;
    
    public AddressBookController(AddressBook dao, AddressBookView view){
        this.dao = dao;
        this.view = view;
    }
    
    public void run(){
        boolean keepGoing = true;
        int selection = 0;
        while (keepGoing){
            selection = getMenuSelection();
            
            switch(selection){
                case 1: 
                    addAddress();
                    break;
                case 2: 
                    deleteAddress();
                    break;
                case 3:
                    findAddress();
                    break;
                case 4:
                    addressCount();
                    break;
                case 5:
                    listAllAddresses();
                    break;
                default:
                    view.displayUknownCommand();
            }
        }
    }
    
    private int getMenuSelection(){
        return view.printMenuAndSelection();
    }
    
    private void addAddress(){
        view.displayAddAddressBanner();
        Address add = view.getAddressInfo();
        dao.addAddress(add.getLastName(), add);
        view.displaySuccessCreateBanner();
    }
    
    private void deleteAddress(){
        view.displayRemoveAddressBanner();
        String lastName = view.getLastName();
        Address removed = dao.removeAddress(lastName);
        view.displayRemoveResult(removed);
    }
    
    private void findAddress(){
        view.displayFindAddressBanner();
        String lastName = view.getLastName();
        Address add = dao.findAddress(lastName);
        view.displayAddress(add);
    }
    
    private void addressCount(){
        int count = dao.addressCount();
        view.displayCount(count);
    }
    
    private void listAllAddresses(){
        view.displayAllAddressesBanner();
        List<Address> address = dao.returnAddress();
        view.displayAddressList(address);
    }
}
