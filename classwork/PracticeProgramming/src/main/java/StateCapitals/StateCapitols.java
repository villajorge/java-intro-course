/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StateCapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class StateCapitols {
    public static void main(String[] args) {
        Map<String, String> stateCapitols = new HashMap<>();
        
        stateCapitols.put("Alabama","Montgomery");
        stateCapitols.put("Alaska","Juneau");
        stateCapitols.put("Arizona", "Pheonix");
        stateCapitols.put("Arkansas","Little Rock");
        
        System.out.println("States:\n========");
        Set<String> states = stateCapitols.keySet();
        
        for(String state : states){
            System.out.println(state);
        }
       
        System.out.println("\nCapitols\n=========");
        Collection<String> capitols = stateCapitols.values();
        for(String capitol : capitols){
            System.out.println(capitol);
        }
        
        System.out.println("\nState/Capitol Pairs\n=======");
        for (String state : states){
            System.out.println(state+" - "+stateCapitols.get(state));
        }
       
    }
}
