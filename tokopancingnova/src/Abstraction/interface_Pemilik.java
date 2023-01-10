/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

import Entity.Entity_Pemilik;
import java.util.ArrayList;
public interface interface_Pemilik {
    ArrayList<Entity_Pemilik> read();
    boolean create(Entity_Pemilik Pemilik);
    boolean update(Entity_Pemilik Pemilik, int idPemilik);
    boolean delete(int idPemilik);
    Entity_Pemilik search(int idPemilik);
}
