/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

import java.util.ArrayList;
import Entity.Entity_Barang;

public interface Interface_Barang {
   void create(Entity_Barang Barang);
   void update(Entity_Barang Barang, int id_barang);
   void delete(int id_barang);
   ArrayList<Entity_Barang> read();
   Entity_Barang search_by_id(int id_barang); 
    
}
