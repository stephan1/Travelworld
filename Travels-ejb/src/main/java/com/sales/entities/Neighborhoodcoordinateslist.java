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
    @NamedQuery(name = "Neighborhoodcoordinateslist.findAll", query = "SELECT n FROM Neighborhoodcoordinateslist n"),
    @NamedQuery(name = "Neighborhoodcoordinateslist.findByRegionid", query = "SELECT n FROM Neighborhoodcoordinateslist n WHERE n.regionid = :regionid"),
    @NamedQuery(name = "Neighborhoodcoordinateslist.findByRegionname", query = "SELECT n FROM Neighborhoodcoordinateslist n WHERE n.regionname = :regionname"),
    @NamedQuery(name = "Neighborhoodcoordinateslist.findByCoordinates", query = "SELECT n FROM Neighborhoodcoordinateslist n WHERE n.coordinates = :coordinates")})
public class Neighborhoodcoordinateslist implements Serializable {
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
    @Size(max = 4000)
    @Column(length = 4000)
    private String coordinates;

    public Neighborhoodcoordinateslist() {
    }

    public Neighborhoodcoordinateslist(BigDecimal regionid) {
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

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
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
        if (!(object instanceof Neighborhoodcoordinateslist)) {
            return false;
        }
        Neighborhoodcoordinateslist other = (Neighborhoodcoordinateslist) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Neighborhoodcoordinateslist[ regionid=" + regionid + " ]";
    }
    
}
