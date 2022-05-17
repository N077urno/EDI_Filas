/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava1;

/**
 *
 * @author nando
 */
public class Sandwich {
    int pao;
    int hamburguer;
    int qhamburguer;
    int queijo;
    float preco;
    int ID;
    
    public Sandwich(int p, int h, int qh, int q, float pr, int id){
        this.pao = p;
        this.hamburguer = h;
        this.qhamburguer = qh;
        this.queijo = q;
        this.preco = pr;
        this.ID = id;
    }
    
    void imprimir(){
        System.out.println("--------------");
        System.out.println("Pao..: "+this.pao);
        System.out.println("Hamburguer..: "+this.hamburguer);
        System.out.println("Quantidade..: "+this.qhamburguer);
        System.out.println("Queijo..: "+this.queijo);
        System.out.println("Preco..: "+this.preco);
        System.out.println("--------------");
    }
    
}
