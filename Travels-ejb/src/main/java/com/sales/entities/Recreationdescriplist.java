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
    @NamedQuery(name = "Recreationdescriplist.findAll", query = "SELECT r FROM Recreationdescriplist r"),
    @NamedQuery(name = "Recreationdescriplist.findByEanhotelid", query = "SELECT r FROM Recreationdescriplist r WHERE r.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Recreationdescriplist.findByLanguagecode", query = "SELECT r FROM Recreationdescriplist r WHERE r.languagecode = :languagecode"),
    @NamedQuery(name = "Recreationdescriplist.findByRecreationdescription", query = "SELECT r FROM Recreationdescriplist r WHERE r.recreationdescription = :recreationdescription")})
public class Recreationdescriplist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal eanhotelid;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 4000)
    @Column(length = 4000)
    private String recreationdescription;

    public Recreationdescriplist() {
    }

    public Recreationdescriplist(BigDecimal eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public BigDecimal getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigDecimal eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getRecreationdescription() {
        return recreationdescription;
    }

    public void setRecreationdescription(String recreationdescription) {
        this.recreationdescription = recreationdescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eanhotelid != null ? eanhotelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recreationdescriplist)) {
            return false;
        }
        Recreationdescriplist other = (Recreationdescriplist) object;
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Recreationdescriplist[ eanhotelid=" + eanhotelid + " ]";
    }
    
}
