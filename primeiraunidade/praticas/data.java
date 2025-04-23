package primeiraunidade.praticas;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("dia:\n");
        int dia= sc.nextInt();
        System.out.print("mes:\n");
        int mes= sc.nextInt();                  
        System.out.print("ano:\n");     
        int ano= sc.nextInt();
        String mesextenso= "Meses";
        int diasDoMes=0;
        if(mes==1){
            System.out.println("Janeiro");
        }else if(mes==1){           
         mesextenso= "Janeiro";
         System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==2){
            mesextenso= "Fevereiro";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==3){
            mesextenso= "Março";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==4){
            mesextenso= "Abril";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==5){
            mesextenso= "Maio";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==6){
            mesextenso= "Junho";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==7){
            mesextenso= "Julho";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==8){
            mesextenso= "Agosto";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==9){
            mesextenso= "Setembro";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==10){
            mesextenso= "Outubro";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==11){
            mesextenso= "Novembro";
            System.out.println(dia +" de " + mesextenso + " de " + ano);
        }else if(mes==12){
            mesextenso= "Dezembro";
            System.out.println(dia +" de " + mesextenso + " de " + ano);

        }
        
switch (mes) {
 
    case 1 :
    case 3:
    case 5:
    case 7:     
    case 8:
    case 10:
    case 12:
        diasDoMes= 31; 
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        diasDoMes= 30; 
        break;
    case 2:

     diasDoMes= 28;
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasDoMes = 29;
        }   

        break;
    default:
        throw new AssertionError();

       
    }
    System.out.println("O mes informado tem " + diasDoMes + " dias.");
    sc.close();
}}
