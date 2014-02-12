/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s"),
    @NamedQuery(name = "Services.findByServiceId", query = "SELECT s FROM Services s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "Services.findByServiceDetails", query = "SELECT s FROM Services s WHERE s.serviceDetails = :serviceDetails")})
public class Services implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICE_ID", nullable = false, precision = 38, scale = 0)
    private BigDecimal serviceId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 164)
    @Column(name = "SERVICE_DETAILS", nullable = false, length = 164)
    private String serviceDetails;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceId")
    private List<HotelBooked> hotelBookedList;
    @OneToMany(mappedBy = "serviceId")
    private List<Roomtypelist> roomtypelistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "services")
    private List<ServiceBookings> serviceBookingsList;

    public Services() {
    }

    public Services(BigDecimal serviceId) {
        this.serviceId = serviceId;
    }

    public Services(BigDecimal serviceId, String serviceDetails) {
        this.serviceId = serviceId;
        this.serviceDetails = serviceDetails;
    }

    public BigDecimal getServiceId() {
        return serviceId;
    }

    public void setServiceId(BigDecimal serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(String serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    @XmlTransient
    public List<HotelBooked> getHotelBookedList() {
        return hotelBookedList;
    }

    public void setHotelBookedList(List<HotelBooked> hotelBookedList) {
        this.hotelBookedList = hotelBookedList;
    }

    @XmlTransient
    public List<Roomtypelist> getRoomtypelistList() {
        return roomtypelistList;
    }

    public void setRoomtypelistList(List<Roomtypelist> roomtypelistList) {
        this.roomtypelistList = roomtypelistList;
    }

    @XmlTransient
    public List<ServiceBookings> getServiceBookingsList() {
        return serviceBookingsList;
    }

    public void setServiceBookingsList(List<ServiceBookings> serviceBookingsList) {
        this.serviceBookingsList = serviceBookingsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceId != null ? serviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Services[ serviceId=" + serviceId + " ]";
    }
    
}
