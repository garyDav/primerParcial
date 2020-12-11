/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primertest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Gary Guzmán
 */
@RunWith(Parameterized.class)
public class NumComplejoTest {
    
    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            {1,2,3,2},{3,5,4,6},{0,4,3,5},{8,4,34,1},{1,3,1,6},{12,5,7,23},{18,8,5,8},{11,2,4,7},{23,7,1,9},{2,38,0,1}
        });
    }
    
    private int v1;
    private int v2;
    private int v3;
    private int v4;
    private NumComplejo nc1;
    private NumComplejo nc2;
    
    public NumComplejoTest(int va1, int va2,int va3, int va4) {
        v1 = va1;
        v2 = va2;
        v3 = va3;
        v4 = va4;
    }

    @Test
    public void testSuma() {
        //System.out.println("Los parametros son: v1="+v1+" "+"v2="+v2);
        nc1 = new NumComplejo(v1,v2);
        nc2 = new NumComplejo(v3,v4);
        NumComplejo resultado = nc1.sumar(nc2);
        NumComplejo prueba = new NumComplejo(v1+v3,v2+v4);
        assertEquals("Las sumas no son iguales en la parte real", prueba.getParteReal(), resultado.getParteReal());
        assertEquals("Las sumas no son iguales en la parte imaginaria", prueba.getParteImaginaria(), resultado.getParteImaginaria());
    }
    
    @Test
    public void testResta() {
        //System.out.println("Los parametros son: v1="+v1+" "+"v2="+v2);
        nc1 = new NumComplejo(v1,v2);
        nc2 = new NumComplejo(v3,v4);
        NumComplejo resultado = nc1.restar(nc2);
        NumComplejo prueba = new NumComplejo(v1-v3,v2-v4);
        assertEquals("Las sumas no son iguales en la parte real", prueba.getParteReal(), resultado.getParteReal());
        assertEquals("Las sumas no son iguales en la parte imaginaria", prueba.getParteImaginaria(), resultado.getParteImaginaria());
    }
    
}
