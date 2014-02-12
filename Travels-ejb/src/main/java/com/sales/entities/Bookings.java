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
    @NamedQuery(name = "Bookings.findAll", query = "SELECT b FROM Bookings b"),
    @NamedQuery(name = "Bookings.findByBookingId", query = "SELECT b FROM Bookings b WHERE b.bookingId = :bookingId"),
    @NamedQuery(name = "Bookings.findByStatusCode", query = "SELECT b FROM Bookings b WHERE b.statusCode = :statusCode"),
    @NamedQuery(name = "Bookings.findByBookingsDate", query = "SELECT b FROM Bookings b WHERE b.bookingsDate = :bookingsDate")})
public class Bookings implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKING_ID", nullable = false, precision = 38, scale = 0)
    private BigDecimal bookingId;
    @Size(max = 20)
    @Column(name = "STATUS_CODE", length = 20)
    private String statusCode;
    @Column(name = "BOOKINGS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingsDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBooking")
    private List<AirlineBooked> airlineBookedList;
    @OneToMany(mappedBy = "idBookings")
    private List<HotelBooked> hotelBookedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookingId")
    private List<Payements> payementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookings")
    private List<ServiceBookings> serviceBookingsList;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "IDPASS", nullable = false)
    @ManyToOne(optional = false)
    private Customer customerId;

    public Bookings() {
    }

    public Bookings(BigDecimal bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getBookingId() {
        return bookingId;
    }

    public void setBookingId(BigDecimal bookingId) {
        this.bookingId = bookingId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Date getBookingsDate() {
        return bookingsDate;
    }

    public void setBookingsDate(Date bookingsDate) {
        this.bookingsDate = bookingsDate;
    }

    @XmlTransient
    public List<AirlineBooked> getAirlineBookedList() {
        return airlineBookedList;
    }

    public void setAirlineBookedList(List<AirlineBooked> airlineBookedList) {
        this.airlineBookedList = airlineBookedList;
    }

    @XmlTransient
    public List<HotelBooked> getHotelBookedList() {
        return hotelBookedList;
    }

    public void setHotelBookedList(List<HotelBooked> hotelBookedList) {
        this.hotelBookedList = hotelBookedList;
    }

    @XmlTransient
    public List<Payements> getPayementsList() {
        return payementsList;
    }

    public void setPayementsList(List<Payements> payementsList) {
        this.payementsList = payementsList;
    }

    @XmlTransient
    public List<ServiceBookings> getServiceBookingsList() {
        return serviceBookingsList;
    }

    public void setServiceBookingsList(List<ServiceBookings> serviceBookingsList) {
        this.serviceBookingsList = serviceBookingsList;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Bookings[ bookingId=" + bookingId + " ]";
    }
    
}
