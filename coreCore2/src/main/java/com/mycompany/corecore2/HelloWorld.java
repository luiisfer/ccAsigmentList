/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corecore2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NewUser
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int one = Integer.parseInt(args[1]);
        if (one % 2 == 0) {
            Casa casa = new Casa("verde", 3);
            casa.Mostrar();
        } else {
            Casa casa = new Casa("Negro", 2, 3, "Zona 1", Arrays.asList(1, 2, 3, 4, 5));
            casa.Mostrar();
        }
        
        Casa casa1 = new Casa();   
        int two = Integer.parseInt(args[0]);
        if (two % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                
                if (i%2==0) {
                    
                    casa1.addToList(i);
                }
            }
        } else {
            for (int i = 0; i <= 20; i++) {
                if (i%2!=0) {
                    //System.out.println(i);
                    casa1.addToList(i);
                }
            }
        }
        
        casa1.MostrarLista();
    }

}
