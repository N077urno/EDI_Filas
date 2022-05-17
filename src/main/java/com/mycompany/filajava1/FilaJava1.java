/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava1;

import java.util.Random;

/**
 *
 * @author nando
 */
public class FilaJava1 {

    public static void main(String[] args) {
        int tipoFila; //variável para determinar em qual fila será inserido o objedo
        int qsandwich,qbebidas,qgrelhados,qsobremesa; //quantidade de produtos em cada pedido
        Random gerador = new Random(); // gerador de número aleatório
        
        Object obj = new Object();  //Objeto auxiliar para impressão das filas e dos itens das filas
        
        Pedido pedido = new Pedido(); //Pedido criado
        
        FilaPedido filaPedido = new FilaPedido();   //fila de pedido criada    
        
        FilaPreparacao filaPreparacao = new FilaPreparacao(); //fila de preparacao criada
        
        Entrega entrega = new Entrega(); // fila de entrega criada
        
      for(int i=0; i<10; i++){ // laço de repetição para a criação de itens e pedidos para as filas
          tipoFila = gerador.nextInt(10);
          
          if(tipoFila <= 5){
              
              pedido.produtos.clear(); //limpa a lista de produtos para iniciar um novo pedido
             
              qsandwich = gerador.nextInt(5); // Nesse exemplo, um pedido pode ter até 5 itens de cada produto
              qbebidas = gerador.nextInt(5);
              qgrelhados = gerador.nextInt(5);
              qsobremesa = gerador.nextInt(5);
              
              for(int j = 0; j < qsandwich; j++){ //Laço para a quantidade de sandwichs do pedido
                  pedido.insere(new Sandwich(gerador.nextInt(5),gerador.nextInt(5),gerador.nextInt(5),gerador.nextInt(5),5,gerador.nextInt(5))); //Os indices do construtor são só exemplos
              }
            
            for(int j = 0; j < pedido.produtos.size(); j++){ //Laço para imprimir um pedido
                  obj = pedido.produtos.get(j); //Pega cada produto de um pedido
                  
                  if(obj instanceof Sandwich){ //Verifica se o produto é uma instância de sandwich
                      System.out.println("******* Pedido Fechado *******");
                      ((Sandwich) obj).imprimir(); //imprime os dados do sandwich
                  }
            }
            
              
            filaPedido.insere(pedido); // Insere o pedido na fila de pedidos
                        
            filaPedido.imprimirFilaDePedidos(filaPedido, obj); //imprime a fila de pedidos
              
          }else if((tipoFila>5)&&(tipoFila<=8)){ //sere o pedido na fila de preparação
              
            if(!filaPedido.filaVazia()) // verifica se a fila de pedidos não está vazia
              filaPreparacao.insere(filaPedido.remover()); //remove o pedido da fila de pedidos e insere na fila de preparação
                                   
              
          }else{ // insere o pedido na fila de Entrega;
             
            if(!filaPreparacao.filaVazia()) //verifica se a fila de entrega não está vazia           
              entrega.insere(filaPreparacao.remover()); //remove o pedido da fila de preparação e insere na fila de entrega
            
          }
          
      }
    }
}
