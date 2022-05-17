/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nando
 */
public class FilaPedido {
    List<Pedido> pedido = new ArrayList<>();
    
    void insere(Pedido a){
        this.pedido.add(a);
    }
    
    Pedido remover(){
        return this.pedido.remove(0);
    }
    
    boolean filaVazia(){
        return this.pedido.isEmpty();
    }
    
    void imprimirFilaDePedidos(FilaPedido fila, Object obj){
        int tam;
        for(int i = 0; i < fila.pedido.size(); i++){
            System.out.println("--- Imprimindo a Fila de Pedidos ---");
            System.out.println("Imprimindo o pedido numero..: "+i);
            tam = fila.pedido.get(i).produtos.size();
            
            for(int j=0;j<tam;j++){
              obj = fila.pedido.get(i).produtos.get(j);  
            }
            
            if(obj instanceof Sandwich){
                      System.out.println("******* Pedido Fechado *******");
                      ((Sandwich) obj).imprimir();
            }
                      
                  
              
        }
    }
}
