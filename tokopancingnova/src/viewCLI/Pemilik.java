/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewCLI;

import AllObject.modelAll;
import Controller.Controller_Pemilik;
import Entity.Entity_Pemilik;
import java.util.ArrayList;
import java.util.Scanner;
import viewCLI.Barang;
public class Pemilik {
    
    public static void view(){
        int i;
        System.out.println("Cetak Data Pemilik:");
        ArrayList<Entity_Pemilik> DPemilik= modelAll.controllerPemilik.read();
        if (DPemilik ==null){
           System.out.println("Data Not Found");
        }  
        
        else{
            for(i=0;i<DPemilik.size();i++){
              System.out.println("NAMA:"+DPemilik.get(i).getNama());  
              System.out.println("USER:"+DPemilik.get(i).getUser());
              System.out.println("PASS:"+DPemilik.get(i).getPass());
            }
        }
    }
    public static void create(){
        System.out.println("TAMBAH USER PEMILIK:");
        Scanner input=new Scanner(System.in);
        
        int user=0;
        String nama="";
        String pass="";
        
        try{
            
            System.out.println("USER ID:");
            user=input.nextInt();
            
            System.out.println("NAMA USER:");
            nama=input.next();
            
            System.out.println("PASSWORD:");
            pass=input.next();
            
            boolean err=modelAll.controllerPemilik.create(new Entity_Pemilik(nama,user,pass));  
            System.out.println("Input Successfull");
        }
        
        catch(Exception e){
            System.out.println(e);
            System.out.println("input Failed");
        }
        
               
                
    }
    
    public static void update(){
        System.out.println("UPDATE");
        Scanner input=new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("NAMA:");
        String nama=input.next();
        
        System.out.println("ID USER:");
        int user=input.nextInt();
        
        System.out.println("PASS:");
        String pass=input.next();
        
        Entity_Pemilik tempPemilik=new Entity_Pemilik(nama,user,pass);
        boolean err= modelAll.controllerPemilik.update(tempPemilik, user);
        
        if(err!= false){
            System.out.println("Update Successfully"); 
        }
        else{
            System.out.println("Update Failed");
        }
        
    }
    
    public static void login(){
        Scanner in=new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("LOGIN");
        System.out.println("------------------------------------");
                
        int user;
        String nama;
        String pass;
        
        System.out.println("ID:");
        user=in.nextInt();
        
        System.out.println("Pass:");
        user=in.nextInt();
       
        Entity_Pemilik Pemilik=modelAll.controllerPemilik.search(user);
        
        if(Pemilik != null){
            System.out.println("Invalid User or pass");
          login();
        }
        else{
            Barang.Menu();
        }
    }
    public static void masuk(){
        int in;
        Scanner input=new Scanner(System.in);
        do{
        System.out.println("Selamat Datang di GUDANG PANCING NOVA");
        System.out.println("=======================================");
        System.out.println("1. Login");
        System.out.println("2. Create user");
        System.out.println("3. Edit");
        System.out.println("4. view");
        System.out.println("5. EXIT");
        System.out.println("=======================================");
        in=input.nextInt();
        
        if (in==1){
            login();
        }
        else if(in==2){
            create();
        }
        else if(in==3){
            update();
        }
        else if(in==4){
           view(); 
        }
        else if(in==5){
            
        }
        else{
            System.out.println("Invalid Key");
        }
        }while (in != 5);
    }
}
