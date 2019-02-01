/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author 1710510
 */
import java.util.Random;

public class Lab02 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       
        // TODO code application logic here
        Random rand = new Random();

        double x = -3, a = 2, b = -1, c = 5.1;
        double y = (Math.exp(a * x - b)) / (Math.log10(Math.abs(x - c)));

        //double randNumber = 1 + (100 - 1) * rand.nextDouble();
        double x1 = 1 + (10 - 1) * rand.nextDouble();
        double a1 = 1 + (10 - 1) * rand.nextDouble();
        double b1 = 1 + (10 - 1) * rand.nextDouble();
        double c1 = 1 + (10 - 1) * rand.nextDouble();

        double y1 = (Math.exp(a1 * x1 - b1)) / (Math.log10(Math.abs(x1 - c1)));
        System.out.println(y);

        System.out.println(y1);
    }
    
}
