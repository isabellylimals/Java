/* 
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.  */

import java.util.Scanner;

public class ex16 {

public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
   int cont1=0;
    int cont2=0;
    int cont3=0;
  System.out.println("Menu\n 1-Álcool\n 2-Gasolina \n 3-Diesel\n 4-Fim");
  
  do { 
    System.out.print("Selecione o tipo de combustivel que deseja abastecer:");
    int tipo= sc.nextInt();
    if(tipo!= 1 && tipo!=2 && tipo!=3 &&tipo !=4){
        System.out.println("Escolha invalida, tente novamente.");
    }
    if(tipo==1){
         cont1++;
        System.out.println("Voce escolheu Alcool.");
    }
    if(tipo==2){
        cont2++;
        System.out.println("Voce escolheu Gasolina.");
    }
    if (tipo==3){
        cont3++;
        System.out.println("Voce escolheu Diesel.");
    }
    if(tipo==4){
        System.out.println("Saindo do programa.Muito Obrigada!!");
        break;
    }
    
  } while (true);

System.out.printf("Estatiticas: \n Alcool: %d pessoa(s) \n Gasolina %d pessoa(s)\n Diesel %d pessoa(s)", cont1,cont2,cont3);

    sc.close();
}

    }
