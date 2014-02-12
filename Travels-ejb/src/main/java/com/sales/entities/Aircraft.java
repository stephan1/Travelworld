/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aircraft.findAll", query = "SELECT a FROM Aircraft a"),
    @NamedQuery(name = "Aircraft.findByAcid", query = "SELECT a FROM Aircraft a WHERE a.acid = :acid"),
    @NamedQuery(name = "Aircraft.findByAcnumber", query = "SELECT a FROM Aircraft a WHERE a.acnumber = :acnumber"),
    @NamedQuery(name = "Aircraft.findByCapacity", query = "SELECT a FROM Aircraft a WHERE a.capacity = :capacity"),
    @NamedQuery(name = "Aircraft.findByMdfby", query = "SELECT a FROM Aircraft a WHERE a.mdfby = :mdfby"),
    @NamedQuery(name = "Aircraft.findByMfdon", query = "SELECT a FROM Aircraft a WHERE a.mfdon = :mfdon")})
public class Aircraft implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal acid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(nullable = false, length = 32)
    private String acnumber;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger capacity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(nullable = false, length = 128)
    private String mdfby;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date mfdon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aircraft")
    private List<FlightSchedule> flightScheduleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aircraft")
    private List<SeatsAircraft> seatsAircraftList;

    public Aircraft() {
    }

    public Aircraft(BigDecimal acid) {
        this.acid = acid;
    }

    public Aircraft(BigDecimal acid, String acnumber, BigInteger capacity, String mdfby, Date mfdon) {
        this.acid = acid;
        this.acnumber = acnumber;
        this.capacity = capacity;
        this.mdfby = mdfby;
        this.mfdon = mfdon;
    }

    public BigDecimal getAcid() {
        return acid;
    }

    public void setAcid(BigDecimal acid) {
        this.acid = acid;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber;
    }

    public BigInteger getCapacity() {
        return capacity;
    }

    public void setCapacity(BigInteger capacity) {
        this.capacity = capacity;
    }

    public String getMdfby() {
        return mdfby;
    }

    public void setMdfby(String mdfby) {
        this.mdfby = mdfby;
    }

    public Date getMfdon() {
        return mfdon;
    }

    public void setMfdon(Date mfdon) {
        this.mfdon = mfdon;
    }

    @XmlTransient
    public List<FlightSchedule> getFlightScheduleList() {
        return flightScheduleList;
    }

    public void setFlightScheduleList(List<FlightSchedule> flightScheduleList) {
        this.flightScheduleList = flightScheduleList;
    }

    @XmlTransient
    public List<SeatsAircraft> getSeatsAircraftList() {
        return seatsAircraftList;
    }

    public void setSeatsAircraftList(List<SeatsAircraft> seatsAircraftList) {
        this.seatsAircraftList = seatsAircraftList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acid != null ? acid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aircraft)) {
            return false;
        }
        Aircraft other = (Aircraft) object;
        if ((this.acid == null && other.acid != null) || (this.acid != null && !this.acid.equals(other.acid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Aircraft[ acid=" + acid + " ]";
    }
    
}
