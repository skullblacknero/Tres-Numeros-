import java.util.Scanner;
public class tresnumeros{
 public static void main(String[]args){
     Scanner obj = new Scanner (System.in);
     Scanner leer = new Scanner (System.in);
     double opcion1,opcion2,opcion3;
     opcion1=1;
     opcion2=2;
     opcion3=3;
         int N1,N2,N3;
 System.out.println ("*Este programa evalua de tres numeros a escibir cual es mayor **");
        System.out.println ("Gonzalez Piñon Oscar Zair Grupo:501 N:L17 ");
        do{
            System.out.print ("Proporciona la primera cifra ----->");
            N1=obj.nextInt();
             System.out.print ("Proporciona la segunda  cifra ----->");
            N2=obj.nextInt();
             System.out.print ("Proporciona la  tecer cifra ----->");
            N3=obj.nextInt();
      if (N1 == N2 && N2 == N3){
            System.out.println("");
           System.out.print("Los  tres numeros son iguales  ");
           System.out.println ("Gonzalez Piñon Oscar Zair Grupo:501 N:L17 ");
            System.out.println("**Teclea 1 para volver a INICIAR el programa si no presiona otra tecla para CERRAR**");
             System.out.print("----->");
             
        } else if (N1> N2 && N1 >N3);{
             System.out.println("");
           System.out.print("La primer cifra es mayor ------>" + N1);
        }if  (N2> N1 && N2 >N3);{
           System.out.print("La segunda cifra es mayor ------>" + N2);
        }if   (N3> N2 && N3 >N1){
            System.out.print("La tercer cifra es mayor ------>" + N3);
            System.out.println ("Gonzalez Piñon Oscar Zair Grupo:501 N:L17 ");
            System.out.println("**Teclea 1 para volver a INICIAR el programa si no presiona otra tecla para CERRAR**");
             System.out.print("----->");
              opcion1=leer.nextInt();
        }
        while (opcion1==1);
        } 
          while (opcion1==1);
  } 
}
 
