package com.hiplatform.teste.hipermercadohi.calculadora;

/**
 *
 * @author Jose
 */
public class CalculaPrecoPadrao implements CalculaPreco {

    @Override
    public double formulaMagica(double custo, int validade) {
        
        System.out.println("aplicando fórmula padrão");
        return custo + custo * 0.10 + validade * 0.10;
    }
    
}
