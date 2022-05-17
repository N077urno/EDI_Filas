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
public class Entrega {
    List<Pedido> entrega = new ArrayList<>();
    
    void insere(Pedido a){
        this.entrega.add(a);
    }
    
    Pedido remover(){
        return this.entrega.remove(0);
    }
    
    boolean filaVazia(){
        return this.entrega.isEmpty();
    }
}
