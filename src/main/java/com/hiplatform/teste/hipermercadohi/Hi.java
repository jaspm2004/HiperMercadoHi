package com.hiplatform.teste.hipermercadohi;

import com.hiplatform.teste.hipermercadohi.calculadora.CalculaPreco;
import com.hiplatform.teste.hipermercadohi.calculadora.CalculaPrecoCarnes;
import com.hiplatform.teste.hipermercadohi.calculadora.CalculaPrecoEletro;
import com.hiplatform.teste.hipermercadohi.calculadora.CalculaPrecoPadrao;
import com.hiplatform.teste.hipermercadohi.calculadora.CalculaPrecoVerduras;

/**
 *
 * @author Jose
 */
public class Hi {
    
    private TipoItem tipo;
    
    public double formulaMagica (double custo, int validade) {
        CalculaPreco calculadora;
        
        switch(tipo) {
            case CARNES :
                calculadora = new CalculaPrecoCarnes();
                break;
                
            case ELETRODOMESTICOS :
                calculadora = new CalculaPrecoEletro();
                break;
                
            case VERDURAS :
                calculadora = new CalculaPrecoVerduras();
                break;   
                
            default :
                calculadora = new CalculaPrecoPadrao();
        }
        
        return calculadora.formulaMagica(custo, validade);
    }
    
    public void escolheTipoItem(TipoItem tipo) {
        this.tipo = tipo;
    }
}
