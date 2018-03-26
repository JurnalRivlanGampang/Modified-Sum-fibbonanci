/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonanci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibbonanci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public static void main(String[] args) {
  
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       for (int i = 0; i <= n; i++) {
           System.out.print(fibonacci(i) + " ");
       }
   }

   public static int fibonacci(int n) {
       if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
}

//mantap gan
//eri ganteng
