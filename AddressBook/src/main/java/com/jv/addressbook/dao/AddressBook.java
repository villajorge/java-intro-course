/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jv.addressbook.dao;

import com.jv.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author offbe
 */
public interface AddressBook {
    Address addAddress(String firstName, Address address);
    
    Address removeAddress(String lastName);
    
    Address findAddress(String lastName);
    
    Integer addressCount();
    
    List<Address> returnAddress();
}
