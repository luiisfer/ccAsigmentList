/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corecore2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NewUser
 */
public class Casa {

    private String color;
    private int ventanas;
    private int puertas;
    private String direccion;
    private List<Integer> dormitorios;

    public Casa() {
        dormitorios = new LinkedList<>();
    }

    
    public Casa(String color, int ventanas) {
        this.color = color;
        this.ventanas = ventanas;
    }

    public Casa(String color, int ventanas, int puertas, String direccion, List<Integer> dormitorios) {
        this.color = color;
        this.ventanas = ventanas;
        this.puertas = puertas;
        this.direccion = direccion;
        this.dormitorios = dormitorios;
    }

    public void Mostrar() {
        System.out.println("Casa{" + "color=" + color + ", ventanas=" + ventanas + ", puertas=" + puertas + ", direccion=" + direccion + ", dormitorios=" + dormitorios + '}');
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Integer> getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(List<Integer> dormitorios) {
        this.dormitorios = dormitorios;
    }

    public void MostrarLista() {
        System.out.println("Lista Dormitorio" + dormitorios);
    }

    public void addToList(int dorms) {
        dormitorios.add(dorms);
    }

}
