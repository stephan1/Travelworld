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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Branches.findAll", query = "SELECT b FROM Branches b"),
    @NamedQuery(name = "Branches.findByBrid", query = "SELECT b FROM Branches b WHERE b.brid = :brid"),
    @NamedQuery(name = "Branches.findByCenter", query = "SELECT b FROM Branches b WHERE b.center = :center"),
    @NamedQuery(name = "Branches.findByAddress", query = "SELECT b FROM Branches b WHERE b.address = :address")})
public class Branches implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal brid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(nullable = false, length = 24)
    private String center;
    @Size(max = 32)
    @Column(length = 32)
    private String address;
    @JoinColumn(name = "REGION_ID", referencedColumnName = "REGIONID")
    @ManyToOne
    private Citycoordinateslist regionId;
    @OneToMany(mappedBy = "branch")
    private List<Employees> employeesList;

    public Branches() {
    }

    public Branches(BigDecimal brid) {
        this.brid = brid;
    }

    public Branches(BigDecimal brid, String center) {
        this.brid = brid;
        this.center = center;
    }

    public BigDecimal getBrid() {
        return brid;
    }

    public void setBrid(BigDecimal brid) {
        this.brid = brid;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Citycoordinateslist getRegionId() {
        return regionId;
    }

    public void setRegionId(Citycoordinateslist regionId) {
        this.regionId = regionId;
    }

    @XmlTransient
    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brid != null ? brid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branches)) {
            return false;
        }
        Branches other = (Branches) object;
        if ((this.brid == null && other.brid != null) || (this.brid != null && !this.brid.equals(other.brid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Branches[ brid=" + brid + " ]";
    }
    
}
