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
public class Fila {
    List<Aluno> alunos = new ArrayList<>();
    
    void insere(Aluno a){
        this.alunos.add(a);
    }
    
    Aluno remover(){
        return this.alunos.remove(0);
    }
    
    boolean filaVazia(){
        return this.alunos.isEmpty();
    }
}
