/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Account {

//    Personal Data
    String ID, Contra, FirstName, SecondName, LastName,
            Nation, Curp, BDay, Age, IdDom, SegSos, IdIRS, IdEdu, Type = "Account";

    public Account(String ID, String Contra, String FirstName, String SecondName, String LastName, String Nation, String Curp, String BDay, String Age, String IdDom, String SegSos, String IdIRS, String IdEdu) {
        this.ID = ID;
        this.Contra = Contra;
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.LastName = LastName;
        this.Nation = Nation;
        this.Curp = Curp;
        this.BDay = BDay;
        this.Age = Age;
        this.IdDom = IdDom;
        this.SegSos = SegSos;
        this.IdIRS = IdIRS;
        this.IdEdu = IdEdu;
    }

    public String getIdDom() {
        return IdDom;
    }

    public void setIdDom(String IdDom) {
        this.IdDom = IdDom;
    }

    public String getSegSos() {
        return SegSos;
    }

    public void setSegSos(String SegSos) {
        this.SegSos = SegSos;
    }

    public String getIdIRS() {
        return IdIRS;
    }

    public void setIdIRS(String IdIRS) {
        this.IdIRS = IdIRS;
    }

    public String getIdEdu() {
        return IdEdu;
    }

    public void setIdEdu(String IdEdu) {
        this.IdEdu = IdEdu;
    }

    @Override
    public String toString() {
        return this.ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public String getBDay() {
        return BDay;
    }

    public void setBDay(String BDay) {
        this.BDay = BDay;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
}
