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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "AIRLINE_BOOKED", catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AirlineBooked.findAll", query = "SELECT a FROM AirlineBooked a"),
    @NamedQuery(name = "AirlineBooked.findByIdAirlinebooked", query = "SELECT a FROM AirlineBooked a WHERE a.idAirlinebooked = :idAirlinebooked"),
    @NamedQuery(name = "AirlineBooked.findByServiceId", query = "SELECT a FROM AirlineBooked a WHERE a.serviceId = :serviceId"),
    @NamedQuery(name = "AirlineBooked.findByIdCustomer", query = "SELECT a FROM AirlineBooked a WHERE a.idCustomer = :idCustomer"),
    @NamedQuery(name = "AirlineBooked.findByDateBookedAirline", query = "SELECT a FROM AirlineBooked a WHERE a.dateBookedAirline = :dateBookedAirline"),
    @NamedQuery(name = "AirlineBooked.findByNumSeat", query = "SELECT a FROM AirlineBooked a WHERE a.numSeat = :numSeat")})
public class AirlineBooked implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AIRLINEBOOKED", nullable = false, precision = 38, scale = 0)
    private BigDecimal idAirlinebooked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICE_ID", nullable = false)
    private BigInteger serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CUSTOMER", nullable = false)
    private BigInteger idCustomer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_BOOKED_AIRLINE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBookedAirline;
    @Column(name = "NUM_SEAT")
    private BigInteger numSeat;
    @JoinColumn(name = "FLIGHT_SCHEDULE", referencedColumnName = "FIID", nullable = false)
    @ManyToOne(optional = false)
    private FlightSchedule flightSchedule;
    @JoinColumn(name = "ID_BOOKING", referencedColumnName = "BOOKING_ID", nullable = false)
    @ManyToOne(optional = false)
    private Bookings idBooking;

    public AirlineBooked() {
    }

    public AirlineBooked(BigDecimal idAirlinebooked) {
        this.idAirlinebooked = idAirlinebooked;
    }

    public AirlineBooked(BigDecimal idAirlinebooked, BigInteger serviceId, BigInteger idCustomer, Date dateBookedAirline) {
        this.idAirlinebooked = idAirlinebooked;
        this.serviceId = serviceId;
        this.idCustomer = idCustomer;
        this.dateBookedAirline = dateBookedAirline;
    }

    public BigDecimal getIdAirlinebooked() {
        return idAirlinebooked;
    }

    public void setIdAirlinebooked(BigDecimal idAirlinebooked) {
        this.idAirlinebooked = idAirlinebooked;
    }

    public BigInteger getServiceId() {
        return serviceId;
    }

    public void setServiceId(BigInteger serviceId) {
        this.serviceId = serviceId;
    }

    public BigInteger getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(BigInteger idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getDateBookedAirline() {
        return dateBookedAirline;
    }

    public void setDateBookedAirline(Date dateBookedAirline) {
        this.dateBookedAirline = dateBookedAirline;
    }

    public BigInteger getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(BigInteger numSeat) {
        this.numSeat = numSeat;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public Bookings getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Bookings idBooking) {
        this.idBooking = idBooking;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAirlinebooked != null ? idAirlinebooked.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AirlineBooked)) {
            return false;
        }
        AirlineBooked other = (AirlineBooked) object;
        if ((this.idAirlinebooked == null && other.idAirlinebooked != null) || (this.idAirlinebooked != null && !this.idAirlinebooked.equals(other.idAirlinebooked))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.AirlineBooked[ idAirlinebooked=" + idAirlinebooked + " ]";
    }
    
}
