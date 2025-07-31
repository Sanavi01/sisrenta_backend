package com.mycompany.sisrenta_backend.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String description;
    private String state;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date devolutionDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliverDate;
    
    @Basic
    private String extraInfoRent;
    private int rentValue;
    private int creditValue;
    private int depositValue;

    public Factura() {
    }

    public Factura(int id, String description, String state, Date creationDate, Date devolutionDate, Date deliverDate, String extraInfoRent, int rentValue, int creditValue, int depositValue) {
        this.id = id;
        this.description = description;
        this.state = state;
        this.creationDate = creationDate;
        this.devolutionDate = devolutionDate;
        this.deliverDate = deliverDate;
        this.extraInfoRent = extraInfoRent;
        this.rentValue = rentValue;
        this.creditValue = creditValue;
        this.depositValue = depositValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getExtraInfoRent() {
        return extraInfoRent;
    }

    public void setExtraInfoRent(String extraInfoRent) {
        this.extraInfoRent = extraInfoRent;
    }

    public int getRentValue() {
        return rentValue;
    }

    public void setRentValue(int rentValue) {
        this.rentValue = rentValue;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    public int getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(int depositValue) {
        this.depositValue = depositValue;
    }
    
    

}
