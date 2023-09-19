package com.example.condidatt;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Candidat implements Serializable {


@Id
@GeneratedValue
    private int id;
    private String nom,prenom,email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Candidat(){
        super();

    }
    public Candidat(int id ,String nom, String prenom,String email ){
        super();
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
    }
}
