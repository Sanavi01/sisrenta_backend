
package com.mycompany.sisrenta_backend.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee extends Person implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int employee_id;
    @Basic
    private String username;
    private String password;
    private String identificationNumber;

    private LinkedList<Factura> listaFacturas;

    public Employee() {
    }

    public Employee(int employee_id, String username, String password, String identificationNumber, LinkedList<Factura> listaFacturas, String name, String lastName, String phoneNumber, String homeAddress) {
        super(name, lastName, phoneNumber, homeAddress);
        this.employee_id = employee_id;
        this.username = username;
        this.password = password;
        this.identificationNumber = identificationNumber;
        this.listaFacturas = listaFacturas;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public LinkedList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(LinkedList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    
    
    
    
}
