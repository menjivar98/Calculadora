/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import laboratorio01.AbstractyFactory.Operaciones;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements Operaciones {

    @Override
    public Aritmetica getAritmetica(String type) {
        switch (type) {
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        
        return null;
    }

    @Override
    public Converter getConvertor(String type) {
        return null;
    }

}
