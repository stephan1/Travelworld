/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "FLIGHT_SCHEDULE", catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FlightSchedule.findAll", query = "SELECT f FROM FlightSchedule f"),
    @NamedQuery(name = "FlightSchedule.findByFiid", query = "SELECT f FROM FlightSchedule f WHERE f.fiid = :fiid"),
    @NamedQuery(name = "FlightSchedule.findByFlightdate", query = "SELECT f FROM FlightSchedule f WHERE f.flightdate = :flightdate"),
    @NamedQuery(name = "FlightSchedule.findByDeparture", query = "SELECT f FROM FlightSchedule f WHERE f.departure = :departure"),
    @NamedQuery(name = "FlightSchedule.findByArrival", query = "SELECT f FROM FlightSchedule f WHERE f.arrival = :arrival")})
public class FlightSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal fiid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date flightdate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date departure;
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrival;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flightSchedule")
    private List<AirlineBooked> airlineBookedList;
    @JoinColumn(name = "AIFAR", referencedColumnName = "AFID", nullable = false)
    @ManyToOne(optional = false)
    private Airfar aifar;
    @JoinColumn(name = "AIRCRAFT", referencedColumnName = "ACID", nullable = false)
    @ManyToOne(optional = false)
    private Aircraft aircraft;

    public FlightSchedule() {
    }

    public FlightSchedule(BigDecimal fiid) {
        this.fiid = fiid;
    }

    public BigDecimal getFiid() {
        return fiid;
    }

    public void setFiid(BigDecimal fiid) {
        this.fiid = fiid;
    }

    public Date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(Date flightdate) {
        this.flightdate = flightdate;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    @XmlTransient
    public List<AirlineBooked> getAirlineBookedList() {
        return airlineBookedList;
    }

    public void setAirlineBookedList(List<AirlineBooked> airlineBookedList) {
        this.airlineBookedList = airlineBookedList;
    }

    public Airfar getAifar() {
        return aifar;
    }

    public void setAifar(Airfar aifar) {
        this.aifar = aifar;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fiid != null ? fiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlightSchedule)) {
            return false;
        }
        FlightSchedule other = (FlightSchedule) object;
        if ((this.fiid == null && other.fiid != null) || (this.fiid != null && !this.fiid.equals(other.fiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.FlightSchedule[ fiid=" + fiid + " ]";
    }
    
}
