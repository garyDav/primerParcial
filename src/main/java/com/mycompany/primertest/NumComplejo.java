/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primertest;

/**
 *
 * @author Gary Guzmán
 */
public class NumComplejo {
    private int _parteReal;
    private int _parteImaginaria;
    
    public NumComplejo() {}

    public NumComplejo(int _parteReal,int _parteImaginaria) {
        this._parteReal = _parteReal;
        this._parteImaginaria = _parteImaginaria;
    }

    public int getParteReal() {
        return _parteReal;
    }

    public int getParteImaginaria() {
        return _parteImaginaria;
    }
    /**
     * 
     * @param c
     * @return 
     */
    public NumComplejo sumar(NumComplejo c){
        return new NumComplejo(this.getParteReal()+c.getParteReal(),this.getParteImaginaria()+c.getParteImaginaria());
    }
    public NumComplejo restar(NumComplejo c){
        return new NumComplejo(this.getParteReal()-c.getParteReal(),this.getParteImaginaria()-c.getParteImaginaria());
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    public int sumaNumeros(int a, int b) {
        return a+b;
    }
}
