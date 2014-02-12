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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Roomtypelist.findAll", query = "SELECT r FROM Roomtypelist r"),
    @NamedQuery(name = "Roomtypelist.findByEanhotelid", query = "SELECT r FROM Roomtypelist r WHERE r.roomtypelistPK.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Roomtypelist.findByRoomtypeid", query = "SELECT r FROM Roomtypelist r WHERE r.roomtypelistPK.roomtypeid = :roomtypeid"),
    @NamedQuery(name = "Roomtypelist.findByLanguagecode", query = "SELECT r FROM Roomtypelist r WHERE r.languagecode = :languagecode"),
    @NamedQuery(name = "Roomtypelist.findByRoomtypeimage", query = "SELECT r FROM Roomtypelist r WHERE r.roomtypeimage = :roomtypeimage"),
    @NamedQuery(name = "Roomtypelist.findByRoomtypename", query = "SELECT r FROM Roomtypelist r WHERE r.roomtypename = :roomtypename"),
    @NamedQuery(name = "Roomtypelist.findByRoomtypedescription", query = "SELECT r FROM Roomtypelist r WHERE r.roomtypedescription = :roomtypedescription"),
    @NamedQuery(name = "Roomtypelist.findByPourcentage", query = "SELECT r FROM Roomtypelist r WHERE r.pourcentage = :pourcentage")})
public class Roomtypelist implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoomtypelistPK roomtypelistPK;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 256)
    @Column(length = 256)
    private String roomtypeimage;
    @Size(max = 200)
    @Column(length = 200)
    private String roomtypename;
    @Size(max = 4000)
    @Column(length = 4000)
    private String roomtypedescription;
    private BigInteger pourcentage;
    @JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID")
    @ManyToOne
    private Services serviceId;

    public Roomtypelist() {
    }

    public Roomtypelist(RoomtypelistPK roomtypelistPK) {
        this.roomtypelistPK = roomtypelistPK;
    }

    public Roomtypelist(BigInteger eanhotelid, BigInteger roomtypeid) {
        this.roomtypelistPK = new RoomtypelistPK(eanhotelid, roomtypeid);
    }

    public RoomtypelistPK getRoomtypelistPK() {
        return roomtypelistPK;
    }

    public void setRoomtypelistPK(RoomtypelistPK roomtypelistPK) {
        this.roomtypelistPK = roomtypelistPK;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getRoomtypeimage() {
        return roomtypeimage;
    }

    public void setRoomtypeimage(String roomtypeimage) {
        this.roomtypeimage = roomtypeimage;
    }

    public String getRoomtypename() {
        return roomtypename;
    }

    public void setRoomtypename(String roomtypename) {
        this.roomtypename = roomtypename;
    }

    public String getRoomtypedescription() {
        return roomtypedescription;
    }

    public void setRoomtypedescription(String roomtypedescription) {
        this.roomtypedescription = roomtypedescription;
    }

    public BigInteger getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(BigInteger pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Services getServiceId() {
        return serviceId;
    }

    public void setServiceId(Services serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomtypelistPK != null ? roomtypelistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomtypelist)) {
            return false;
        }
        Roomtypelist other = (Roomtypelist) object;
        if ((this.roomtypelistPK == null && other.roomtypelistPK != null) || (this.roomtypelistPK != null && !this.roomtypelistPK.equals(other.roomtypelistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Roomtypelist[ roomtypelistPK=" + roomtypelistPK + " ]";
    }
    
}
