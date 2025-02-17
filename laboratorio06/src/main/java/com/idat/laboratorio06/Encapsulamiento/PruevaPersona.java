/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio06.Encapsulamiento;

/**
 *
 * @author IDAT
 */
public class PruevaPersona {
    public static void main(String[] args){
        persona persona = new persona ("Blanca");
       //persona.name ="nombre modificado";
       System.out.println(persona);
       persona.setName("nombre modificado");
       System.out.println(persona);
    }
}
