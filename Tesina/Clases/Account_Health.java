/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Account_Health {

    //    Personal Healt
    String NumSolSec, BloodType, Kg, Cm, Sex, Pedecimiento, Vaccine;

    @Override
    public String toString() {
        return this.NumSolSec;
    }

    public Account_Health(String NumSolSec, String BloodType, String Kg, String Cm, String Sex, String Pedecimiento, String Vaccine) {
        this.NumSolSec = NumSolSec;
        this.BloodType = BloodType;
        this.Kg = Kg;
        this.Cm = Cm;
        this.Sex = Sex;
        this.Pedecimiento = Pedecimiento;
        this.Vaccine = Vaccine;
    }

    public String getNumSolSec() {
        return NumSolSec;
    }

    public void setNumSolSec(String NumSolSec) {
        this.NumSolSec = NumSolSec;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getKg() {
        return Kg;
    }

    public void setKg(String Kg) {
        this.Kg = Kg;
    }

    public String getCm() {
        return Cm;
    }

    public void setCm(String Cm) {
        this.Cm = Cm;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getPedecimiento() {
        return Pedecimiento;
    }

    public void setPedecimiento(String Pedecimiento) {
        this.Pedecimiento = Pedecimiento;
    }

    public String getVaccine() {
        return Vaccine;
    }

    public void setVaccine(String Vaccine) {
        this.Vaccine = Vaccine;
    }

   
}
