/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewCLI;
import Entity.Entity_Barang;
import AllObject.modelAll;


import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    public static void view(){
        int i;
        System.out.println("BARANG");
        System.out.println("=======================");
        ArrayList<Entity_Barang>item=modelAll.DatabaseBarang.read();
        if(item==null){
            System.out.println("Belum input data");
        }
        else{
            for(i=0;i<item.size();i++){
                System.out.println("=================================");
                System.out.println("Nama Barang:"+item.get(i).nama_barang);
                System.out.println("ID:"+item.get(i).id_barang);
                System.out.println("Stok:"+item.get(i).stok);
                System.out.println("Harga:"+item.get(i).harga);
                System.out.println("==================================");
            }
        }
                
    }
    
    public static void create(){
        int id_barang=0;
        String nama_barang="";
        int harga;
        int stok;
        try{
        Scanner inp=new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("TAMBAH DATA BARANG");
        System.out.println("===================================");
        System.out.println("Nama Barang:");
        nama_barang=inp.next();
        
        System.out.println("ID barang:");
        id_barang=inp.nextInt();
        
        System.out.println("Stok:");
        stok=inp.nextInt();
        
        System.out.println("Harga");
        harga=inp.nextInt();
        System.out.println("====================================");
       // boolean err=modelAll.DatabaseBarang(new Entity_Barang(id_barang,nama_barang,stok,harga));
       System.out.println("Data Berhasil Dimasukan");
        } 
        catch(Exception e){
            System.out.println(e);
            System.out.println("DAta galagal dimasukan");
        }
    }
    public static void Update(){
        Scanner inp=new Scanner(System.in);
        System.out.println("===================================");
       System.out.println("TAMBAH DATA BARANG");
        System.out.println("===================================");
       System.out.println("Nama Barang:");
       String nama_barang=inp.next(); 
        
      System.out.println("ID barang:");
       int id_barang=inp.nextInt();
        
      System.out.println("Stok:");
     int stok=inp.nextInt();
        
       System.out.println("Harga");
      int harga=inp.nextInt();
       System.out.println("====================================");
    //boolean p=modelAll.DatabaseBarang.update(Barang, id_barang);
      // if(p!=false){
       //     System.out.println("Data berhasil dimasukan");
       // }
        
       // else{
       //     System.out.println("Data gagal masuk");
       // }
    }
    
    
    public static void Menu(){
    Scanner input=new Scanner(System.in);
    int inp;
    do{
    System.out.println("================================");
    System.out.println("Menu");
    System.out.println("================================");
    System.out.println("1.Tambah data");
    System.out.println("2.Update");
    System.out.println("3.View");
    System.out.println("4.Exit");
    System.out.println("==================================");
    inp=input.nextInt();
    
        switch (inp) {
            case 1:
                create();
                break;
            case 2:
                Update();
                break;
            case 3:
                view();
                break;
            case 4:
                System.out.println("Thx telah menggunakan program ini");
                break;
            default:
                break;
        }
    }while(inp !=4);        
}

    
}
