/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regioneanhotelidmapping.findAll", query = "SELECT r FROM Regioneanhotelidmapping r"),
    @NamedQuery(name = "Regioneanhotelidmapping.findByRegionid", query = "SELECT r FROM Regioneanhotelidmapping r WHERE r.regioneanhotelidmappingPK.regionid = :regionid"),
    @NamedQuery(name = "Regioneanhotelidmapping.findByEanhotelid", query = "SELECT r FROM Regioneanhotelidmapping r WHERE r.regioneanhotelidmappingPK.eanhotelid = :eanhotelid")})
public class Regioneanhotelidmapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegioneanhotelidmappingPK regioneanhotelidmappingPK;

    public Regioneanhotelidmapping() {
    }

    public Regioneanhotelidmapping(RegioneanhotelidmappingPK regioneanhotelidmappingPK) {
        this.regioneanhotelidmappingPK = regioneanhotelidmappingPK;
    }

    public Regioneanhotelidmapping(BigInteger regionid, BigInteger eanhotelid) {
        this.regioneanhotelidmappingPK = new RegioneanhotelidmappingPK(regionid, eanhotelid);
    }

    public RegioneanhotelidmappingPK getRegioneanhotelidmappingPK() {
        return regioneanhotelidmappingPK;
    }

    public void setRegioneanhotelidmappingPK(RegioneanhotelidmappingPK regioneanhotelidmappingPK) {
        this.regioneanhotelidmappingPK = regioneanhotelidmappingPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regioneanhotelidmappingPK != null ? regioneanhotelidmappingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regioneanhotelidmapping)) {
            return false;
        }
        Regioneanhotelidmapping other = (Regioneanhotelidmapping) object;
        if ((this.regioneanhotelidmappingPK == null && other.regioneanhotelidmappingPK != null) || (this.regioneanhotelidmappingPK != null && !this.regioneanhotelidmappingPK.equals(other.regioneanhotelidmappingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Regioneanhotelidmapping[ regioneanhotelidmappingPK=" + regioneanhotelidmappingPK + " ]";
    }
    
}
