/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author SURA
 */
@Local
public interface ivabeanLocal {

    Double Calcular(double Iva, double Valor);
    
}
