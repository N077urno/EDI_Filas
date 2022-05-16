/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava1;

/**
 *
 * @author nando
 */
public class FilaJava1 {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno c = new Aluno();
        Aluno d = new Aluno();
        Aluno e = new Aluno();
        
        Aluno resp = new Aluno();
        
        a.nome = "Ana";
        a.matricula = 1001;
        a.idade = 20;
        a.curso = "BCC";
        a.semestre = 2;
        
        b.nome = "Jose";
        b.matricula = 1002;
        b.idade = 18;
        b.curso = "TSI";
        b.semestre = 1;
        
        c.nome = "Joao";
        c.matricula = 1003;
        c.idade = 25;
        c.curso = "Agro";
        c.semestre = 5;
        
        d.nome = "Rafa";
        d.matricula = 1004;
        d.idade = 19;
        d.curso = "zoo";
        d.semestre = 3;
        
        e.nome = "Maria";
        e.idade = 21;
        e.matricula = 1005;
        e.curso = "ali";
        e.semestre = 4;
        
        Fila filaAlunos = new Fila();
        
        filaAlunos.insere(d);
        filaAlunos.insere(e);
        filaAlunos.insere(b);
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        filaAlunos.insere(a);
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        filaAlunos.insere(c);
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
        
        if(!filaAlunos.filaVazia()){
            resp = filaAlunos.remover();
            System.out.println("O almoco sera servido para o aluno:");
            System.out.println("Nome..: "+resp.nome+" Matricula..: "+resp.matricula);
        }
    }
}
