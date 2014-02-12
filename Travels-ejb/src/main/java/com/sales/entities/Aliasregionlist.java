/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Aliasregionlist.findAll", query = "SELECT a FROM Aliasregionlist a"),
    @NamedQuery(name = "Aliasregionlist.findByRegionid", query = "SELECT a FROM Aliasregionlist a WHERE a.aliasregionlistPK.regionid = :regionid"),
    @NamedQuery(name = "Aliasregionlist.findByLanguagecode", query = "SELECT a FROM Aliasregionlist a WHERE a.aliasregionlistPK.languagecode = :languagecode"),
    @NamedQuery(name = "Aliasregionlist.findByAliasstring", query = "SELECT a FROM Aliasregionlist a WHERE a.aliasstring = :aliasstring")})
public class Aliasregionlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AliasregionlistPK aliasregionlistPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String aliasstring;

    public Aliasregionlist() {
    }

    public Aliasregionlist(AliasregionlistPK aliasregionlistPK) {
        this.aliasregionlistPK = aliasregionlistPK;
    }

    public Aliasregionlist(AliasregionlistPK aliasregionlistPK, String aliasstring) {
        this.aliasregionlistPK = aliasregionlistPK;
        this.aliasstring = aliasstring;
    }

    public Aliasregionlist(BigInteger regionid, String languagecode) {
        this.aliasregionlistPK = new AliasregionlistPK(regionid, languagecode);
    }

    public AliasregionlistPK getAliasregionlistPK() {
        return aliasregionlistPK;
    }

    public void setAliasregionlistPK(AliasregionlistPK aliasregionlistPK) {
        this.aliasregionlistPK = aliasregionlistPK;
    }

    public String getAliasstring() {
        return aliasstring;
    }

    public void setAliasstring(String aliasstring) {
        this.aliasstring = aliasstring;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aliasregionlistPK != null ? aliasregionlistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aliasregionlist)) {
            return false;
        }
        Aliasregionlist other = (Aliasregionlist) object;
        if ((this.aliasregionlistPK == null && other.aliasregionlistPK != null) || (this.aliasregionlistPK != null && !this.aliasregionlistPK.equals(other.aliasregionlistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Aliasregionlist[ aliasregionlistPK=" + aliasregionlistPK + " ]";
    }
    
}
