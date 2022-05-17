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
public class Pedido {
    List<Object> produtos = new ArrayList();
    
    void insere(Object a){
        this.produtos.add(a);
    }
    
    Object remover(){
        return this.produtos.remove(0);
    }
    
    boolean filaVazia(){
        return this.produtos.isEmpty();
    }
}
