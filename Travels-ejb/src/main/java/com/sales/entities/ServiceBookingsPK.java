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
public class ServiceBookingsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICE_ID", nullable = false)
    private BigInteger serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKING_ID", nullable = false)
    private BigInteger bookingId;

    public ServiceBookingsPK() {
    }

    public ServiceBookingsPK(BigInteger serviceId, BigInteger bookingId) {
        this.serviceId = serviceId;
        this.bookingId = bookingId;
    }

    public BigInteger getServiceId() {
        return serviceId;
    }

    public void setServiceId(BigInteger serviceId) {
        this.serviceId = serviceId;
    }

    public BigInteger getBookingId() {
        return bookingId;
    }

    public void setBookingId(BigInteger bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceId != null ? serviceId.hashCode() : 0);
        hash += (bookingId != null ? bookingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceBookingsPK)) {
            return false;
        }
        ServiceBookingsPK other = (ServiceBookingsPK) object;
        if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
            return false;
        }
        if ((this.bookingId == null && other.bookingId != null) || (this.bookingId != null && !this.bookingId.equals(other.bookingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.ServiceBookingsPK[ serviceId=" + serviceId + ", bookingId=" + bookingId + " ]";
    }
    
}
