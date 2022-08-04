/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Family_Data {
    //    Family Data
    String Id,NameFather, NameMother, Ocupations, Status;

    public Family_Data(String Id, String NameFather, String NameMother, String Ocupations, String Status) {
        this.Id = Id;
        this.NameFather = NameFather;
        this.NameMother = NameMother;
        this.Ocupations = Ocupations;
        this.Status = Status;
    }

    @Override
    public String toString() {
        return this.Id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNameFather() {
        return NameFather;
    }

    public void setNameFather(String NameFather) {
        this.NameFather = NameFather;
    }

    public String getNameMother() {
        return NameMother;
    }

    public void setNameMother(String NameMother) {
        this.NameMother = NameMother;
    }

    public String getOcupations() {
        return Ocupations;
    }

    public void setOcupations(String Ocupations) {
        this.Ocupations = Ocupations;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

   
}
