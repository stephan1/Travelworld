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
public class PropertyattributelinkPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger eanhotelid;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger attributeid;

    public PropertyattributelinkPK() {
    }

    public PropertyattributelinkPK(BigInteger eanhotelid, BigInteger attributeid) {
        this.eanhotelid = eanhotelid;
        this.attributeid = attributeid;
    }

    public BigInteger getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigInteger eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public BigInteger getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(BigInteger attributeid) {
        this.attributeid = attributeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eanhotelid != null ? eanhotelid.hashCode() : 0);
        hash += (attributeid != null ? attributeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertyattributelinkPK)) {
            return false;
        }
        PropertyattributelinkPK other = (PropertyattributelinkPK) object;
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        if ((this.attributeid == null && other.attributeid != null) || (this.attributeid != null && !this.attributeid.equals(other.attributeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.PropertyattributelinkPK[ eanhotelid=" + eanhotelid + ", attributeid=" + attributeid + " ]";
    }
    
}
