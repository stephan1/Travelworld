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
    @NamedQuery(name = "Propertytypelist.findAll", query = "SELECT p FROM Propertytypelist p"),
    @NamedQuery(name = "Propertytypelist.findByPropertycategory", query = "SELECT p FROM Propertytypelist p WHERE p.propertycategory = :propertycategory"),
    @NamedQuery(name = "Propertytypelist.findByLanguagecode", query = "SELECT p FROM Propertytypelist p WHERE p.languagecode = :languagecode"),
    @NamedQuery(name = "Propertytypelist.findByPropertycategorydesc", query = "SELECT p FROM Propertytypelist p WHERE p.propertycategorydesc = :propertycategorydesc")})
public class Propertytypelist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal propertycategory;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 256)
    @Column(length = 256)
    private String propertycategorydesc;

    public Propertytypelist() {
    }

    public Propertytypelist(BigDecimal propertycategory) {
        this.propertycategory = propertycategory;
    }

    public BigDecimal getPropertycategory() {
        return propertycategory;
    }

    public void setPropertycategory(BigDecimal propertycategory) {
        this.propertycategory = propertycategory;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getPropertycategorydesc() {
        return propertycategorydesc;
    }

    public void setPropertycategorydesc(String propertycategorydesc) {
        this.propertycategorydesc = propertycategorydesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertycategory != null ? propertycategory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propertytypelist)) {
            return false;
        }
        Propertytypelist other = (Propertytypelist) object;
        if ((this.propertycategory == null && other.propertycategory != null) || (this.propertycategory != null && !this.propertycategory.equals(other.propertycategory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Propertytypelist[ propertycategory=" + propertycategory + " ]";
    }
    
}
