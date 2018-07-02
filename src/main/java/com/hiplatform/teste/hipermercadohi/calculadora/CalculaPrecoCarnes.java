package com.hiplatform.teste.hipermercadohi.calculadora;

/**
 *
 * @author Jose
 */
public class CalculaPrecoCarnes implements CalculaPreco {

    @Override
    public double formulaMagica(double custo, int validade) {
        
        System.out.println("aplicando fórmula carnes");
        return custo + custo * 0.40 + validade * 0.10;
    }
    
}
