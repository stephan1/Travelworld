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
    @NamedQuery(name = "Parentregionlist.findAll", query = "SELECT p FROM Parentregionlist p"),
    @NamedQuery(name = "Parentregionlist.findByRegionid", query = "SELECT p FROM Parentregionlist p WHERE p.regionid = :regionid"),
    @NamedQuery(name = "Parentregionlist.findByRegiontype", query = "SELECT p FROM Parentregionlist p WHERE p.regiontype = :regiontype"),
    @NamedQuery(name = "Parentregionlist.findByRelativesignificance", query = "SELECT p FROM Parentregionlist p WHERE p.relativesignificance = :relativesignificance"),
    @NamedQuery(name = "Parentregionlist.findBySubclass", query = "SELECT p FROM Parentregionlist p WHERE p.subclass = :subclass"),
    @NamedQuery(name = "Parentregionlist.findByRegionname", query = "SELECT p FROM Parentregionlist p WHERE p.regionname = :regionname"),
    @NamedQuery(name = "Parentregionlist.findByRegionnamelong", query = "SELECT p FROM Parentregionlist p WHERE p.regionnamelong = :regionnamelong"),
    @NamedQuery(name = "Parentregionlist.findByParentregionid", query = "SELECT p FROM Parentregionlist p WHERE p.parentregionid = :parentregionid"),
    @NamedQuery(name = "Parentregionlist.findByParentregiontype", query = "SELECT p FROM Parentregionlist p WHERE p.parentregiontype = :parentregiontype"),
    @NamedQuery(name = "Parentregionlist.findByParentregionname", query = "SELECT p FROM Parentregionlist p WHERE p.parentregionname = :parentregionname"),
    @NamedQuery(name = "Parentregionlist.findByParentregionnamelong", query = "SELECT p FROM Parentregionlist p WHERE p.parentregionnamelong = :parentregionnamelong")})
public class Parentregionlist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal regionid;
    @Size(max = 50)
    @Column(length = 50)
    private String regiontype;
    @Size(max = 3)
    @Column(length = 3)
    private String relativesignificance;
    @Size(max = 50)
    @Column(length = 50)
    private String subclass;
    @Size(max = 255)
    @Column(length = 255)
    private String regionname;
    @Size(max = 510)
    @Column(length = 510)
    private String regionnamelong;
    private BigInteger parentregionid;
    @Size(max = 50)
    @Column(length = 50)
    private String parentregiontype;
    @Size(max = 255)
    @Column(length = 255)
    private String parentregionname;
    @Size(max = 510)
    @Column(length = 510)
    private String parentregionnamelong;

    public Parentregionlist() {
    }

    public Parentregionlist(BigDecimal regionid) {
        this.regionid = regionid;
    }

    public BigDecimal getRegionid() {
        return regionid;
    }

    public void setRegionid(BigDecimal regionid) {
        this.regionid = regionid;
    }

    public String getRegiontype() {
        return regiontype;
    }

    public void setRegiontype(String regiontype) {
        this.regiontype = regiontype;
    }

    public String getRelativesignificance() {
        return relativesignificance;
    }

    public void setRelativesignificance(String relativesignificance) {
        this.relativesignificance = relativesignificance;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
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

    public BigInteger getParentregionid() {
        return parentregionid;
    }

    public void setParentregionid(BigInteger parentregionid) {
        this.parentregionid = parentregionid;
    }

    public String getParentregiontype() {
        return parentregiontype;
    }

    public void setParentregiontype(String parentregiontype) {
        this.parentregiontype = parentregiontype;
    }

    public String getParentregionname() {
        return parentregionname;
    }

    public void setParentregionname(String parentregionname) {
        this.parentregionname = parentregionname;
    }

    public String getParentregionnamelong() {
        return parentregionnamelong;
    }

    public void setParentregionnamelong(String parentregionnamelong) {
        this.parentregionnamelong = parentregionnamelong;
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
        if (!(object instanceof Parentregionlist)) {
            return false;
        }
        Parentregionlist other = (Parentregionlist) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Parentregionlist[ regionid=" + regionid + " ]";
    }
    
}
