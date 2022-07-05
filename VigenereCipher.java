/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vigenere.cipher;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class VigenereCipher {

  
     public static String encrypt(String plaintext,  String key)
    {
        String result = "";
       plaintext = plaintext.toUpperCase();
        for (int i = 0, k = 0; i < plaintext.length(); i++)
        {
            char c = plaintext.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            result =result+ (char) ((c + key.charAt(k) - 2 * 'A') % 26 + 'A');
            k = ++k % key.length();
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter text");
        String plaintext=sc.nextLine();
        System.out.println("please enter key");
        String key=sc.nextLine();
        
        String result=encrypt(plaintext,key);
        System.out.println("encrpted text is "+result);
        
        
        
        
        
    }
    
}
