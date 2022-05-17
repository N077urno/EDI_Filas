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
public class FilaPreparacao {
    List<Pedido> preparacao = new ArrayList<>();
    
    void insere(Pedido a){
        this.preparacao.add(a);
    }
    
    Pedido remover(){
        return this.preparacao.remove(0);
    }
    
    boolean filaVazia(){
        return this.preparacao.isEmpty();
    }
}
