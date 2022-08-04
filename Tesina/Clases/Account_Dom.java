/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Account_Dom {

    //    Persoanl Dom
    String IDPerDom, NumInt, NumExt, Ref, Zp, Street, Building;

    public Account_Dom(String IDPerDom, String NumInt, String NumExt, String Ref, String Zp, String Street, String Building) {
        this.IDPerDom = IDPerDom;
        this.NumInt = NumInt;
        this.NumExt = NumExt;
        this.Ref = Ref;
        this.Zp = Zp;
        this.Street = Street;
        this.Building = Building;
    }

    @Override
    public String toString() {
        return this.IDPerDom;
    }
    
    public String getIDPerDom() {
        return IDPerDom;
    }

    public void setIDPerDom(String IDPerDom) {
        this.IDPerDom = IDPerDom;
    }

    public String getNumInt() {
        return NumInt;
    }

    public void setNumInt(String NumInt) {
        this.NumInt = NumInt;
    }

    public String getNumExt() {
        return NumExt;
    }

    public void setNumExt(String NumExt) {
        this.NumExt = NumExt;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    public String getZp() {
        return Zp;
    }

    public void setZp(String Zp) {
        this.Zp = Zp;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String Building) {
        this.Building = Building;
    }
    

}
