/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.io.*;
import java.util.*;
public class Details {
    //private static int i=0;
    private static ArrayList<Integer> AC=new ArrayList<Integer>();
     
   /* private String Name;
    private String Emailid;
    private String Phno;
    private String Username;
    private String Password;
    private int CurrentBalance;
    private int AccountNumber;
    public Details(){
        i++;
    }
    public void setName(String n){
        Name=n;
    }
    public void setEmailid(String n){
        Emailid=n;
    }
    public void setPhno(String n){
        Phno=n;
    }
    public void setUsername(String n){
        Username=n;
    }
    public void setPassword(String n){
        Password=n;
    }
    public String getName(){
        return Name;
    }
    public String getEmailid(){
        return Emailid;
    }
    public String getPhno(){
        return Phno;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public int getCurrentBalance(){
        return CurrentBalance;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }*/
    public static int generateAccountNumber(){
       boolean present=true;
       int n=0;
       while(present){
           n=(int)(Math.random()*10000);
           present=AC.contains(n);
       }
       AC.add(n);
       return(n+9760000);
    }
   /* public static int getCount(){
        return i;
    }
    Code for checking valid/available username*/
}
