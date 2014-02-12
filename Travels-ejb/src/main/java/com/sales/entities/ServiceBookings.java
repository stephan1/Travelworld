/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "SERVICE_BOOKINGS", catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceBookings.findAll", query = "SELECT s FROM ServiceBookings s"),
    @NamedQuery(name = "ServiceBookings.findByServiceId", query = "SELECT s FROM ServiceBookings s WHERE s.serviceBookingsPK.serviceId = :serviceId"),
    @NamedQuery(name = "ServiceBookings.findByBookingId", query = "SELECT s FROM ServiceBookings s WHERE s.serviceBookingsPK.bookingId = :bookingId"),
    @NamedQuery(name = "ServiceBookings.findByBookingStartDate", query = "SELECT s FROM ServiceBookings s WHERE s.bookingStartDate = :bookingStartDate"),
    @NamedQuery(name = "ServiceBookings.findByBookingEndDate", query = "SELECT s FROM ServiceBookings s WHERE s.bookingEndDate = :bookingEndDate")})
public class ServiceBookings implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServiceBookingsPK serviceBookingsPK;
    @Column(name = "BOOKING_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingStartDate;
    @Column(name = "BOOKING_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingEndDate;
    @JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Services services;
    @JoinColumn(name = "BOOKING_ID", referencedColumnName = "BOOKING_ID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bookings bookings;

    public ServiceBookings() {
    }

    public ServiceBookings(ServiceBookingsPK serviceBookingsPK) {
        this.serviceBookingsPK = serviceBookingsPK;
    }

    public ServiceBookings(BigInteger serviceId, BigInteger bookingId) {
        this.serviceBookingsPK = new ServiceBookingsPK(serviceId, bookingId);
    }

    public ServiceBookingsPK getServiceBookingsPK() {
        return serviceBookingsPK;
    }

    public void setServiceBookingsPK(ServiceBookingsPK serviceBookingsPK) {
        this.serviceBookingsPK = serviceBookingsPK;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(Date bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Bookings getBookings() {
        return bookings;
    }

    public void setBookings(Bookings bookings) {
        this.bookings = bookings;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceBookingsPK != null ? serviceBookingsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceBookings)) {
            return false;
        }
        ServiceBookings other = (ServiceBookings) object;
        if ((this.serviceBookingsPK == null && other.serviceBookingsPK != null) || (this.serviceBookingsPK != null && !this.serviceBookingsPK.equals(other.serviceBookingsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.ServiceBookings[ serviceBookingsPK=" + serviceBookingsPK + " ]";
    }
    
}
