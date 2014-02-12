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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Statess.findAll", query = "SELECT s FROM Statess s"),
    @NamedQuery(name = "Statess.findByStid", query = "SELECT s FROM Statess s WHERE s.stid = :stid"),
    @NamedQuery(name = "Statess.findByStatename", query = "SELECT s FROM Statess s WHERE s.statename = :statename")})
public class Statess implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal stid;
    @Size(max = 32)
    @Column(length = 32)
    private String statename;
    @JoinColumn(name = "COUNTRY", referencedColumnName = "COUNTRYID", nullable = false)
    @ManyToOne(optional = false)
    private Countrylist country;

    public Statess() {
    }

    public Statess(BigDecimal stid) {
        this.stid = stid;
    }

    public BigDecimal getStid() {
        return stid;
    }

    public void setStid(BigDecimal stid) {
        this.stid = stid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public Countrylist getCountry() {
        return country;
    }

    public void setCountry(Countrylist country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stid != null ? stid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statess)) {
            return false;
        }
        Statess other = (Statess) object;
        if ((this.stid == null && other.stid != null) || (this.stid != null && !this.stid.equals(other.stid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Statess[ stid=" + stid + " ]";
    }
    
}
