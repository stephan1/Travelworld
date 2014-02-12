/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "Regioncentercoordinateslist.findAll", query = "SELECT r FROM Regioncentercoordinateslist r"),
    @NamedQuery(name = "Regioncentercoordinateslist.findByRegionid", query = "SELECT r FROM Regioncentercoordinateslist r WHERE r.regionid = :regionid"),
    @NamedQuery(name = "Regioncentercoordinateslist.findByRegionname", query = "SELECT r FROM Regioncentercoordinateslist r WHERE r.regionname = :regionname"),
    @NamedQuery(name = "Regioncentercoordinateslist.findByCenterlatitude", query = "SELECT r FROM Regioncentercoordinateslist r WHERE r.centerlatitude = :centerlatitude"),
    @NamedQuery(name = "Regioncentercoordinateslist.findByCenterlongitude", query = "SELECT r FROM Regioncentercoordinateslist r WHERE r.centerlongitude = :centerlongitude")})
public class Regioncentercoordinateslist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal regionid;
    @Size(max = 255)
    @Column(length = 255)
    private String regionname;
    @Column(precision = 9, scale = 6)
    private BigDecimal centerlatitude;
    @Column(precision = 9, scale = 6)
    private BigDecimal centerlongitude;

    public Regioncentercoordinateslist() {
    }

    public Regioncentercoordinateslist(BigDecimal regionid) {
        this.regionid = regionid;
    }

    public BigDecimal getRegionid() {
        return regionid;
    }

    public void setRegionid(BigDecimal regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    public BigDecimal getCenterlatitude() {
        return centerlatitude;
    }

    public void setCenterlatitude(BigDecimal centerlatitude) {
        this.centerlatitude = centerlatitude;
    }

    public BigDecimal getCenterlongitude() {
        return centerlongitude;
    }

    public void setCenterlongitude(BigDecimal centerlongitude) {
        this.centerlongitude = centerlongitude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionid != null ? regionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regioncentercoordinateslist)) {
            return false;
        }
        Regioncentercoordinateslist other = (Regioncentercoordinateslist) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Regioncentercoordinateslist[ regionid=" + regionid + " ]";
    }
    
}
