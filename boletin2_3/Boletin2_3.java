package boletin2_3;

//@author irodriguezsteuerberg

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Introduce a cantidade de billetes de 100 euros");
int billetes_100=sc.nextInt();
System.out.println("Introduce a cantidade de billetes de 20 euros");
int billetes_20=sc.nextInt();
System.out.println("Introduce a cantidade de billetes de 5 euros");
int billetes_5=sc.nextInt();
System.out.println("Introduce a cantidade de moedas de 1 euro");
int moedas_1=sc.nextInt();
System.out.println("O total é de "+(billetes_100*100+billetes_20*20+billetes_5*5+moedas_1)+" euros");
        
    }
    
}
