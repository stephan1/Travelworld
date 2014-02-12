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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author steve
 */
@Embeddable
public class AliasregionlistPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger regionid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(nullable = false, length = 5)
    private String languagecode;

    public AliasregionlistPK() {
    }

    public AliasregionlistPK(BigInteger regionid, String languagecode) {
        this.regionid = regionid;
        this.languagecode = languagecode;
    }

    public BigInteger getRegionid() {
        return regionid;
    }

    public void setRegionid(BigInteger regionid) {
        this.regionid = regionid;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionid != null ? regionid.hashCode() : 0);
        hash += (languagecode != null ? languagecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AliasregionlistPK)) {
            return false;
        }
        AliasregionlistPK other = (AliasregionlistPK) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        if ((this.languagecode == null && other.languagecode != null) || (this.languagecode != null && !this.languagecode.equals(other.languagecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.AliasregionlistPK[ regionid=" + regionid + ", languagecode=" + languagecode + " ]";
    }
    
}
