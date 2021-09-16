/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;
import java.util.Scanner;
/**
 *
 * @author nzagame
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a First name.");
    String name = sc.next();
    System.out.println("Please enter a number 1-10.");
    int minion = sc.nextInt();
    System.out.println("Please enter a number with a decimal.");
    double millions = sc.nextDouble();
    System.out.println("What's your favorite number?");
    double favnum = sc.nextDouble();
    System.out.println("Enter a number two numbers to add together.");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    System.out.println("Enter 4 whole numbers");
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int num6 = sc.nextInt();
    System.out.println("There one was a Hero named " + name + ". They had " 
    + minion + " followers who "+ "worshiped them because of their " 
    + millions + "\n" + "million dollars, but were jealous of their " + favnum + " wives and husbands "
    + "but they supported" + "\n" + " them for saving the village " + (num1+num2) + 
    " times." + "The hero finally retired at the age of " + (num3+num4+num5+num6) + " and lived happily ever after. THE END.");
    
    
    
    
    
    
    
    
    }
    
}
