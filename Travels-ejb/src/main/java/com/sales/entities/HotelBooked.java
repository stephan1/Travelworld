/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HOTEL_BOOKED", catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HotelBooked.findAll", query = "SELECT h FROM HotelBooked h"),
    @NamedQuery(name = "HotelBooked.findById", query = "SELECT h FROM HotelBooked h WHERE h.id = :id"),
    @NamedQuery(name = "HotelBooked.findByDatesChoosed", query = "SELECT h FROM HotelBooked h WHERE h.datesChoosed = :datesChoosed")})
public class HotelBooked implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal id;
    @Column(name = "DATES_CHOOSED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datesChoosed;
    @JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID", nullable = false)
    @ManyToOne(optional = false)
    private Services serviceId;
    @JoinColumn(name = "CUSTOMER", referencedColumnName = "IDPASS", nullable = false)
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "ID_BOOKINGS", referencedColumnName = "BOOKING_ID")
    @ManyToOne
    private Bookings idBookings;
    @JoinColumn(name = "ID_HOTEL_BOOKED", referencedColumnName = "EANHOTELID", nullable = false)
    @ManyToOne(optional = false)
    private Activepropertylist idHotelBooked;

    public HotelBooked() {
    }

    public HotelBooked(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getDatesChoosed() {
        return datesChoosed;
    }

    public void setDatesChoosed(Date datesChoosed) {
        this.datesChoosed = datesChoosed;
    }

    public Services getServiceId() {
        return serviceId;
    }

    public void setServiceId(Services serviceId) {
        this.serviceId = serviceId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bookings getIdBookings() {
        return idBookings;
    }

    public void setIdBookings(Bookings idBookings) {
        this.idBookings = idBookings;
    }

    public Activepropertylist getIdHotelBooked() {
        return idHotelBooked;
    }

    public void setIdHotelBooked(Activepropertylist idHotelBooked) {
        this.idHotelBooked = idHotelBooked;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HotelBooked)) {
            return false;
        }
        HotelBooked other = (HotelBooked) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.HotelBooked[ id=" + id + " ]";
    }
    
}
