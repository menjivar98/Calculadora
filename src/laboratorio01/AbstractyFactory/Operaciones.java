/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio01.AbstractyFactory;

import Aritmetica.Aritmetica;

/**
 *
 * @author LN710Q
 */
public interface Operaciones {
     Aritmetica getAritmetica(String type);
     Convertor getConvertor(String type);
}
