/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Abstraction.interface_Pemilik;
import Entity.Entity_Pemilik;
import java.util.ArrayList;
import AllObject.*;
import Helper.helper;
public class Controller_Pemilik implements interface_Pemilik{

    @Override
    public ArrayList<Entity_Pemilik> read() {
        return modelAll.DatabasePemilik.read();
    }

    @Override
    public boolean create(Entity_Pemilik Pemilik) {
        try{
            modelAll.DatabasePemilik.create(Pemilik);
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean update(Entity_Pemilik Pemilik, int idPemilik) {
        boolean cek= modelAll.DatabasePemilik.update(Pemilik.getUser(),Pemilik.getNama(),Pemilik.getPass());
        return cek;
    }

    @Override
    public boolean delete(int idPemilik) {
    boolean cek =false;
    if(true){
        return true;
    }
    else{
        return false;
    }
    }

    @Override
    public Entity_Pemilik search(int idPemilik) {
        Entity_Pemilik tempPemilik=null;
        helper search= modelAll.DatabasePemilik.search(idPemilik);
        if(search.cek){
            tempPemilik= modelAll.DatabasePemilik.read().get(search.index);
        }
        return tempPemilik;
    }
    
}
