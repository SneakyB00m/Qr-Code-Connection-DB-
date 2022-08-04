/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tesina.Clases;

/**
 *
 * @author Alan_
 */
public class Account_Studies {
    //    Studies
    String id,Degree, Certification, Studying;

    public Account_Studies(String id, String Degree, String Certification, String Studying) {
        this.id = id;
        this.Degree = Degree;
        this.Certification = Certification;
        this.Studying = Studying;
    }

    @Override
    public String toString() {
        return this.id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getCertification() {
        return Certification;
    }

    public void setCertification(String Certification) {
        this.Certification = Certification;
    }

    public String getStudying() {
        return Studying;
    }

    public void setStudying(String Studying) {
        this.Studying = Studying;
    }
    
}
