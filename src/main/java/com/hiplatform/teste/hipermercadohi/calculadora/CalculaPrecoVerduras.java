package com.hiplatform.teste.hipermercadohi.calculadora;

/**
 *
 * @author Jose
 */
public class CalculaPrecoVerduras implements CalculaPreco {

    @Override
    public double formulaMagica(double custo, int validade) {
        
        System.out.println("aplicando fórmula verduras");
        return custo + custo * 0.20 + validade * 0.10;
    }
    
}
