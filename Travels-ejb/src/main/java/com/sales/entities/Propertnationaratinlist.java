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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Propertnationaratinlist.findAll", query = "SELECT p FROM Propertnationaratinlist p"),
    @NamedQuery(name = "Propertnationaratinlist.findByEanhotelid", query = "SELECT p FROM Propertnationaratinlist p WHERE p.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Propertnationaratinlist.findByLanguagecode", query = "SELECT p FROM Propertnationaratinlist p WHERE p.languagecode = :languagecode")})
public class Propertnationaratinlist implements Serializable {
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
    @Lob
    private String propernationratingdescrip;

    public Propertnationaratinlist() {
    }

    public Propertnationaratinlist(BigDecimal eanhotelid) {
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

    public String getPropernationratingdescrip() {
        return propernationratingdescrip;
    }

    public void setPropernationratingdescrip(String propernationratingdescrip) {
        this.propernationratingdescrip = propernationratingdescrip;
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
        if (!(object instanceof Propertnationaratinlist)) {
            return false;
        }
        Propertnationaratinlist other = (Propertnationaratinlist) object;
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Propertnationaratinlist[ eanhotelid=" + eanhotelid + " ]";
    }
    
}
