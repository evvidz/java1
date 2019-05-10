/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.*; 
  
public class Lab03 
{ 
    
    public static double findAverage(int a[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++)  
            sum += a[i]; 
      
        return (double)sum / (double)n; 
    } 
  
   
    public static double findMedian(int a[], int n) 
    { 
       
        Arrays.sort(a); 
        if (n % 2 != 0) 
        return (double)a[n / 2]; 
      
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
    } 
  
   
    public static void main(String args[]) 
    { 
        int a[] = { 1, 5, 7, 10, 15, 22 }; 
        int n = a.length; 
        System.out.println("Average = " + findAverage(a, n));  
        System.out.println("Median = " + findMedian(a, n));  
    } 
} 
  