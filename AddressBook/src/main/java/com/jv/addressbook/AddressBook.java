/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jv.addressbook;

import com.jv.addressbook.controller.AddressBookController;
import com.jv.addressbook.dao.AddressBookFileImpl;
import com.jv.addressbook.ui.AddressBookView;
import com.jv.addressbook.ui.UserIO;
import com.jv.addressbook.ui.UserIOConsoleImpl;

/**
 *
 * @author offbe
 */
public class AddressBook {

    public static void main(String[] args) {
       UserIO io = new UserIOConsoleImpl();
       AddressBookView view = new AddressBookView(io);
       AddressBookFileImpl dao = new AddressBookFileImpl();
       AddressBookController controller = new AddressBookController(dao, view);
       controller.run();
               
        
    }
}
