/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package sptv21game;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author user
 * 
 */
public class SPTV21Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Privet, gruppa SPTV21!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cash = 3;
        do{
            System.out.println("---- New run ----");
            System.out.println("cash = "+cash);
            int myNumber = random.nextInt(11);
            int n = 0;
            do{
                System.out.print("Zagadano chislo ot 0 do 10, ugadai: ");
                int yourNumber = scanner.nextInt();
                if(myNumber == yourNumber){
                    System.out.println("Ura! ti ugadal! tebe 1 evro v kosheljok");
                    cash++;
                    break;
                }else{
                    System.out.println("Net");
                }
                n++;
                if(n > 2){
                    System.out.println("Ti proigral, c tebja 1 evro :)");
                    cash--;
                    break;
                }
            }while(true);
            System.out.println("To exit press 0, continue - press ather enykey");
            int repeat = scanner.nextInt();
            if(repeat == 0 || cash == 0){
                System.out.printf("V tvojom koshelke %d EUR, By-by%n",cash);
                break;
            }
        }while(true);
        
    }
}
    

