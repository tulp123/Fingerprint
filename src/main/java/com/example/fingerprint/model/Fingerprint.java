package com.example.fingerprint.model;

import javax.persistence.*;

@Entity
@Table(name="fingerprint")
public class Fingerprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "Serial_Number")
    private int serialNumber;

    @Column(name = "Name")
    private String name;

    public Fingerprint() {
    }

    public Fingerprint(int id, int serialNumber, String name){
        this.id = id;
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
