/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Entity_Pemilik;
import Helper.helper;
import java.util.ArrayList;
public class Model_Pemilik {
    private ArrayList<Entity_Pemilik> data_pemilik;
    
    public Model_Pemilik(){
        data_pemilik= new ArrayList<Entity_Pemilik>();
    }
    
    public void create(Entity_Pemilik Pemilik){
        this.data_pemilik.add(Pemilik);
    }
    
    public ArrayList<Entity_Pemilik> read(){
        return data_pemilik;
    }
    
    public helper search(int user){
        int idPemilik = -1;
        boolean cek =false;
        for(int i=0;i<this.data_pemilik.size();i++){
            if(user == this.data_pemilik.get(i).getUser()){
                
               idPemilik=i ;
               cek=true;
            }
        }
     helper helper=new helper(cek,idPemilik);
     return helper;
    }
    
    public boolean update(int user,String nama, String pass){
     helper helper=  search(user);
     if(helper.cek==true){
         this.data_pemilik.get(user).getPass();
         this.data_pemilik.get(user).getNama();
         return true;
     }
     return false;
     
    }
    
    public void delete(int user){
      //  int index= this.search(user);
      //if(index==-1){
       //     System.out.println("Data Tak Ditemukan");
        //}
        
       // else{
         //   this.data_pemilik.remove(index);
           // System.out.println("Data :"+index+"Terdelete");
        //}
    }
    
    private int cek_login(int user,String pass){
        
        for(int i=0;i<this.data_pemilik.size();i++){
            if(user==this.data_pemilik.get(i).getUser()){
                if(pass.equals(this.data_pemilik.get(i).getPass())){
                    return this.data_pemilik.get(i).getUser();
                }
            }
        }
        return -1;
    }
    
    public int login(int user , String pass){
        
        int userpemilik = this.cek_login(user, pass);
        if(userpemilik==-1){
            System.out.println("User:"+user+"Login Failed");
        }
        
        else{
            System.out.println("User:"+user+"Login Success");
        }
         return userpemilik;       
    }
}
