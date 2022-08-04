/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Family_Dom {

    //    Family Dom
    String IDFamDom, NumIntFam, NumExtFam, RefFam, ZpFam, StreetFam, BuildingFam;

    @Override
    public String toString() {
        return this.IDFamDom; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Family_Dom(String IDFamDom, String NumIntFam, String NumExtFam, String RefFam, String ZpFam, String StreetFam, String BuildingFam) {
        this.IDFamDom = IDFamDom;
        this.NumIntFam = NumIntFam;
        this.NumExtFam = NumExtFam;
        this.RefFam = RefFam;
        this.ZpFam = ZpFam;
        this.StreetFam = StreetFam;
        this.BuildingFam = BuildingFam;
    }

    public String getIDFamDom() {
        return IDFamDom;
    }

    public void setIDFamDom(String IDFamDom) {
        this.IDFamDom = IDFamDom;
    }

    public String getNumIntFam() {
        return NumIntFam;
    }

    public void setNumIntFam(String NumIntFam) {
        this.NumIntFam = NumIntFam;
    }

    public String getNumExtFam() {
        return NumExtFam;
    }

    public void setNumExtFam(String NumExtFam) {
        this.NumExtFam = NumExtFam;
    }

    public String getRef() {
        return RefFam;
    }

    public void setRef(String RefFam) {
        this.RefFam = RefFam;
    }

    public String getZpFam() {
        return ZpFam;
    }

    public void setZpFam(String ZpFam) {
        this.ZpFam = ZpFam;
    }

    public String getStreetFam() {
        return StreetFam;
    }

    public void setStreetFam(String StreetFam) {
        this.StreetFam = StreetFam;
    }

    public String getBuildingFam() {
        return BuildingFam;
    }

    public void setBuildingFam(String BuildingFam) {
        this.BuildingFam = BuildingFam;
    }
}
