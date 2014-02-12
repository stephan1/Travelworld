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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Airfar.findAll", query = "SELECT a FROM Airfar a"),
    @NamedQuery(name = "Airfar.findByAfid", query = "SELECT a FROM Airfar a WHERE a.afid = :afid"),
    @NamedQuery(name = "Airfar.findByFare", query = "SELECT a FROM Airfar a WHERE a.fare = :fare"),
    @NamedQuery(name = "Airfar.findByFsc", query = "SELECT a FROM Airfar a WHERE a.fsc = :fsc")})
public class Airfar implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal afid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String fare;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String fsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aifar")
    private List<FlightSchedule> flightScheduleList;
    @JoinColumn(name = "ROUTE", referencedColumnName = "RTID", nullable = false)
    @ManyToOne(optional = false)
    private Route route;

    public Airfar() {
    }

    public Airfar(BigDecimal afid) {
        this.afid = afid;
    }

    public Airfar(BigDecimal afid, String fare, String fsc) {
        this.afid = afid;
        this.fare = fare;
        this.fsc = fsc;
    }

    public BigDecimal getAfid() {
        return afid;
    }

    public void setAfid(BigDecimal afid) {
        this.afid = afid;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFsc() {
        return fsc;
    }

    public void setFsc(String fsc) {
        this.fsc = fsc;
    }

    @XmlTransient
    public List<FlightSchedule> getFlightScheduleList() {
        return flightScheduleList;
    }

    public void setFlightScheduleList(List<FlightSchedule> flightScheduleList) {
        this.flightScheduleList = flightScheduleList;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afid != null ? afid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Airfar)) {
            return false;
        }
        Airfar other = (Airfar) object;
        if ((this.afid == null && other.afid != null) || (this.afid != null && !this.afid.equals(other.afid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Airfar[ afid=" + afid + " ]";
    }
    
}
