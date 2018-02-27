/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author SURA
 */
@Stateless
public class ivabean implements ivabeanLocal {

    @Override
    
    
    public Double Calcular(double Iva, double Valor) {
        
        return (Valor*(Iva/100));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
}
