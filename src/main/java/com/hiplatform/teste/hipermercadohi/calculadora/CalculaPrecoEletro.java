package com.hiplatform.teste.hipermercadohi.calculadora;

/**
 *
 * @author Jose
 */
public class CalculaPrecoEletro implements CalculaPreco {

    @Override
    public double formulaMagica(double custo, int validade) {
        
        System.out.println("aplicando fórmula eletro");
        return custo + custo * 0.60 + validade * 0.10;
    }
    
}
