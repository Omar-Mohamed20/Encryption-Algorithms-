/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceaser.cipher;

/**
 *
 * @author Samsung
 */


import java.util.Scanner;

public class CeaserCipher {

    /**
     * @param args the command line arguments
     * @return 
     */
    
   
    public static String encrypt(String plaintext, int key ){
        
      

        int y= plaintext.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<plaintext.length();i++){
            if(Character.isUpperCase(plaintext.charAt(i))){
               char ch= (char) ((plaintext.charAt(i)+x-64)%26)+64);
               result.append(ch);
            }
            else{
                char ch= (char) (((plaintext.charAt(i)+x-96)%26)+96);
               result.append(ch);
                
            }
            
            
        }
        return result.toString();
        
    }
    
    
    
    
    
    
    
     public static String decrpt(String plaintext, String key ){
        
        int x=Integer.parseInt(key);

        int y= plaintext.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<plaintext.length();i++){
            if(Character.isUpperCase(plaintext.charAt(i))){
               char ch= (char) (((plaintext.charAt(i)-x-64)%26)+64);
               result.append(ch);
            }
            else{
                char ch= (char) (((plaintext.charAt(i)-x-96)%26)+96);
               result.append(ch);
                
            }
            
            
        }
        return result.toString();
        
    }
    
    

    
    public static void main(String[] args) {
       System.out.println("please enter 1 for encrypt or 2 for decrpt");  
   Scanner sc=new Scanner(System.in);    
    int x=sc.nextInt();
   
        if(x==1){
            String plaintext=sc.nextLine();
            String key=sc.nextLine();
            
            encrypt(plaintext,key);
        }
        
        
        
        
        
        
        /*
        else if(x==2)
        decrpt("abc","ccd");
        
    }
    */
    }}   

