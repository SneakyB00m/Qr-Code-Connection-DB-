/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Account_Coms {

    String ID, Tel, Email;

    public Account_Coms(String ID, String Tel, String Email) {
        this.ID = ID;
        this.Tel = Tel;
        this.Email = Email;
    }

    @Override
    public String toString() {
        return this.ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
