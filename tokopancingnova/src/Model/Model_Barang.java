/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Entity_Barang;
import Abstraction.Interface_Barang;
import java.util.ArrayList;
        
public class Model_Barang implements Interface_Barang {
    ArrayList<Entity_Barang> DB_Barang=new ArrayList<Entity_Barang>();
   
    @Override
     public void create(Entity_Barang Barang) {
        this.DB_Barang.add(Barang);
    }
     
     private int getIndexById(int id_barang){
         for(int i=0;i<this.DB_Barang.size();i++){
             if(id_barang==this.DB_Barang.get(i).id_barang){
                 return i;
             }
         }
         return -1;
     }
     
    @Override
     public void update(Entity_Barang Barang,int id_barang){
         Entity_Barang Barang1 = search_by_id(id_barang);
         int index=getIndexById(id_barang);
         this.DB_Barang.get(index).nama_barang=Barang.nama_barang;
         this.DB_Barang.get(index).harga=Barang.harga;
         this.DB_Barang.get(index).stok=Barang.stok;
     }
     
    @Override
     public void delete(int id_barang){
         int index= this.getIndexById(id_barang);
         this.DB_Barang.remove(index);
         
     }@Override
    public ArrayList<Entity_Barang> read() {
        return this.DB_Barang;
    }
    
    
    @Override
    public Entity_Barang search_by_id(int id_barang){
        Entity_Barang Barang = null;
        for (Entity_Barang item:this.DB_Barang){
            if(item.id_barang==id_barang){
                return item;
            }
        }
        return Barang;
    }

     
}
