/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pointsintercoordilist.findAll", query = "SELECT p FROM Pointsintercoordilist p"),
    @NamedQuery(name = "Pointsintercoordilist.findByRegionid", query = "SELECT p FROM Pointsintercoordilist p WHERE p.regionid = :regionid"),
    @NamedQuery(name = "Pointsintercoordilist.findByRegionname", query = "SELECT p FROM Pointsintercoordilist p WHERE p.regionname = :regionname"),
    @NamedQuery(name = "Pointsintercoordilist.findByRegionnamelong", query = "SELECT p FROM Pointsintercoordilist p WHERE p.regionnamelong = :regionnamelong"),
    @NamedQuery(name = "Pointsintercoordilist.findByLatitude", query = "SELECT p FROM Pointsintercoordilist p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "Pointsintercoordilist.findByLongitude", query = "SELECT p FROM Pointsintercoordilist p WHERE p.longitude = :longitude"),
    @NamedQuery(name = "Pointsintercoordilist.findBySubclassification", query = "SELECT p FROM Pointsintercoordilist p WHERE p.subclassification = :subclassification")})
public class Pointsintercoordilist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger regionid;
    @Size(max = 255)
    @Column(length = 255)
    private String regionname;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 191)
    @Column(nullable = false, length = 191)
    private String regionnamelong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 9, scale = 6)
    private BigDecimal latitude;
    @Column(precision = 9, scale = 6)
    private BigDecimal longitude;
    @Size(max = 20)
    @Column(length = 20)
    private String subclassification;

    public Pointsintercoordilist() {
    }

    public Pointsintercoordilist(String regionnamelong) {
        this.regionnamelong = regionnamelong;
    }

    public Pointsintercoordilist(String regionnamelong, BigInteger regionid) {
        this.regionnamelong = regionnamelong;
        this.regionid = regionid;
    }

    public BigInteger getRegionid() {
        return regionid;
    }

    public void setRegionid(BigInteger regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    public String getRegionnamelong() {
        return regionnamelong;
    }

    public void setRegionnamelong(String regionnamelong) {
        this.regionnamelong = regionnamelong;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getSubclassification() {
        return subclassification;
    }

    public void setSubclassification(String subclassification) {
        this.subclassification = subclassification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionnamelong != null ? regionnamelong.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pointsintercoordilist)) {
            return false;
        }
        Pointsintercoordilist other = (Pointsintercoordilist) object;
        if ((this.regionnamelong == null && other.regionnamelong != null) || (this.regionnamelong != null && !this.regionnamelong.equals(other.regionnamelong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Pointsintercoordilist[ regionnamelong=" + regionnamelong + " ]";
    }
    
}
