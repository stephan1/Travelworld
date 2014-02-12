/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citycoordinateslist.findAll", query = "SELECT c FROM Citycoordinateslist c"),
    @NamedQuery(name = "Citycoordinateslist.findByRegionid", query = "SELECT c FROM Citycoordinateslist c WHERE c.regionid = :regionid"),
    @NamedQuery(name = "Citycoordinateslist.findByRegionname", query = "SELECT c FROM Citycoordinateslist c WHERE c.regionname = :regionname"),
    @NamedQuery(name = "Citycoordinateslist.findByCoordinates", query = "SELECT c FROM Citycoordinateslist c WHERE c.coordinates = :coordinates")})
public class Citycoordinateslist implements Serializable {
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
    @OneToMany(mappedBy = "regionId")
    private List<Branches> branchesList;

    public Citycoordinateslist() {
    }

    public Citycoordinateslist(BigDecimal regionid) {
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

    @XmlTransient
    public List<Branches> getBranchesList() {
        return branchesList;
    }

    public void setBranchesList(List<Branches> branchesList) {
        this.branchesList = branchesList;
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
        if (!(object instanceof Citycoordinateslist)) {
            return false;
        }
        Citycoordinateslist other = (Citycoordinateslist) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Citycoordinateslist[ regionid=" + regionid + " ]";
    }
    
}
