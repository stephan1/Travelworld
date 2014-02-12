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
    @NamedQuery(name = "Gdspropertyattributelink.findAll", query = "SELECT g FROM Gdspropertyattributelink g"),
    @NamedQuery(name = "Gdspropertyattributelink.findByEanhotelid", query = "SELECT g FROM Gdspropertyattributelink g WHERE g.gdspropertyattributelinkPK.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Gdspropertyattributelink.findByAttributeid", query = "SELECT g FROM Gdspropertyattributelink g WHERE g.gdspropertyattributelinkPK.attributeid = :attributeid"),
    @NamedQuery(name = "Gdspropertyattributelink.findByLanguagecode", query = "SELECT g FROM Gdspropertyattributelink g WHERE g.languagecode = :languagecode"),
    @NamedQuery(name = "Gdspropertyattributelink.findByAppendtxt", query = "SELECT g FROM Gdspropertyattributelink g WHERE g.appendtxt = :appendtxt")})
public class Gdspropertyattributelink implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GdspropertyattributelinkPK gdspropertyattributelinkPK;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 191)
    @Column(length = 191)
    private String appendtxt;

    public Gdspropertyattributelink() {
    }

    public Gdspropertyattributelink(GdspropertyattributelinkPK gdspropertyattributelinkPK) {
        this.gdspropertyattributelinkPK = gdspropertyattributelinkPK;
    }

    public Gdspropertyattributelink(BigInteger eanhotelid, BigInteger attributeid) {
        this.gdspropertyattributelinkPK = new GdspropertyattributelinkPK(eanhotelid, attributeid);
    }

    public GdspropertyattributelinkPK getGdspropertyattributelinkPK() {
        return gdspropertyattributelinkPK;
    }

    public void setGdspropertyattributelinkPK(GdspropertyattributelinkPK gdspropertyattributelinkPK) {
        this.gdspropertyattributelinkPK = gdspropertyattributelinkPK;
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
        hash += (gdspropertyattributelinkPK != null ? gdspropertyattributelinkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gdspropertyattributelink)) {
            return false;
        }
        Gdspropertyattributelink other = (Gdspropertyattributelink) object;
        if ((this.gdspropertyattributelinkPK == null && other.gdspropertyattributelinkPK != null) || (this.gdspropertyattributelinkPK != null && !this.gdspropertyattributelinkPK.equals(other.gdspropertyattributelinkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Gdspropertyattributelink[ gdspropertyattributelinkPK=" + gdspropertyattributelinkPK + " ]";
    }
    
}
