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

/**
 *
 * @author steve
 */
@Embeddable
public class RegioneanhotelidmappingPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger regionid;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger eanhotelid;

    public RegioneanhotelidmappingPK() {
    }

    public RegioneanhotelidmappingPK(BigInteger regionid, BigInteger eanhotelid) {
        this.regionid = regionid;
        this.eanhotelid = eanhotelid;
    }

    public BigInteger getRegionid() {
        return regionid;
    }

    public void setRegionid(BigInteger regionid) {
        this.regionid = regionid;
    }

    public BigInteger getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigInteger eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionid != null ? regionid.hashCode() : 0);
        hash += (eanhotelid != null ? eanhotelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegioneanhotelidmappingPK)) {
            return false;
        }
        RegioneanhotelidmappingPK other = (RegioneanhotelidmappingPK) object;
        if ((this.regionid == null && other.regionid != null) || (this.regionid != null && !this.regionid.equals(other.regionid))) {
            return false;
        }
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.RegioneanhotelidmappingPK[ regionid=" + regionid + ", eanhotelid=" + eanhotelid + " ]";
    }
    
}
