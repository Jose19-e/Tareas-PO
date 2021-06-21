/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg5;

import objetos.CPU;
import objetos.Mause;
import objetos.Monitor;
import objetos.Teclado;
import objetos.compu.Computadora;

/**
 *
 * @author jose_
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora HP = new Computadora("HP","Pavilion x360", new Teclado(), new CPU(), new Mause(), new Monitor());
        System.out.println(HP);
       
    }
    
}
