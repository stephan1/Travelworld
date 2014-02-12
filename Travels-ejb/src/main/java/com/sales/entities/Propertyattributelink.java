/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Propertyattributelink.findAll", query = "SELECT p FROM Propertyattributelink p"),
    @NamedQuery(name = "Propertyattributelink.findByEanhotelid", query = "SELECT p FROM Propertyattributelink p WHERE p.propertyattributelinkPK.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Propertyattributelink.findByAttributeid", query = "SELECT p FROM Propertyattributelink p WHERE p.propertyattributelinkPK.attributeid = :attributeid"),
    @NamedQuery(name = "Propertyattributelink.findByLanguagecode", query = "SELECT p FROM Propertyattributelink p WHERE p.languagecode = :languagecode"),
    @NamedQuery(name = "Propertyattributelink.findByAppendtxt", query = "SELECT p FROM Propertyattributelink p WHERE p.appendtxt = :appendtxt")})
public class Propertyattributelink implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropertyattributelinkPK propertyattributelinkPK;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 191)
    @Column(length = 191)
    private String appendtxt;

    public Propertyattributelink() {
    }

    public Propertyattributelink(PropertyattributelinkPK propertyattributelinkPK) {
        this.propertyattributelinkPK = propertyattributelinkPK;
    }

    public Propertyattributelink(BigInteger eanhotelid, BigInteger attributeid) {
        this.propertyattributelinkPK = new PropertyattributelinkPK(eanhotelid, attributeid);
    }

    public PropertyattributelinkPK getPropertyattributelinkPK() {
        return propertyattributelinkPK;
    }

    public void setPropertyattributelinkPK(PropertyattributelinkPK propertyattributelinkPK) {
        this.propertyattributelinkPK = propertyattributelinkPK;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getAppendtxt() {
        return appendtxt;
    }

    public void setAppendtxt(String appendtxt) {
        this.appendtxt = appendtxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyattributelinkPK != null ? propertyattributelinkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propertyattributelink)) {
            return false;
        }
        Propertyattributelink other = (Propertyattributelink) object;
        if ((this.propertyattributelinkPK == null && other.propertyattributelinkPK != null) || (this.propertyattributelinkPK != null && !this.propertyattributelinkPK.equals(other.propertyattributelinkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Propertyattributelink[ propertyattributelinkPK=" + propertyattributelinkPK + " ]";
    }
    
}
