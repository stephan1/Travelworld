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
public class RoomtypelistPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger eanhotelid;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger roomtypeid;

    public RoomtypelistPK() {
    }

    public RoomtypelistPK(BigInteger eanhotelid, BigInteger roomtypeid) {
        this.eanhotelid = eanhotelid;
        this.roomtypeid = roomtypeid;
    }

    public BigInteger getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigInteger eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public BigInteger getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(BigInteger roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eanhotelid != null ? eanhotelid.hashCode() : 0);
        hash += (roomtypeid != null ? roomtypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomtypelistPK)) {
            return false;
        }
        RoomtypelistPK other = (RoomtypelistPK) object;
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        if ((this.roomtypeid == null && other.roomtypeid != null) || (this.roomtypeid != null && !this.roomtypeid.equals(other.roomtypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.RoomtypelistPK[ eanhotelid=" + eanhotelid + ", roomtypeid=" + roomtypeid + " ]";
    }
    
}
