package com.hiplatform.teste.hipermercadohi;

/**
 *
 * @author Jose
 */
public class Main {
    
    public static void main(String[] args) {
        
        TipoItem tipo;
        double custo = 100;
        int validade = 30;
        double preco;
        
        tipo = TipoItem.VERDURAS;
        HiperMercado.Hi.escolheTipoItem(tipo);
        preco = HiperMercado.Hi.formulaMagica(custo, validade);
        System.out.println("O preço do item tipo " + tipo.name() + " é R$ " + preco);
        System.out.println();
        
        tipo = TipoItem.CARNES;
        HiperMercado.Hi.escolheTipoItem(tipo);
        preco = HiperMercado.Hi.formulaMagica(custo, validade);
        System.out.println("O preço do item tipo " + tipo.name() + " é R$ " + preco);
        System.out.println();
        
        tipo = TipoItem.ELETRODOMESTICOS;
        HiperMercado.Hi.escolheTipoItem(tipo);
        preco = HiperMercado.Hi.formulaMagica(custo, validade);
        System.out.println("O preço do item tipo " + tipo.name() + " é R$ " + preco);
    }
}
