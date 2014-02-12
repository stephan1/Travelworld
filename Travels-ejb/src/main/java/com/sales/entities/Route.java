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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ROUTECODE"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Route.findAll", query = "SELECT r FROM Route r"),
    @NamedQuery(name = "Route.findByRtid", query = "SELECT r FROM Route r WHERE r.rtid = :rtid"),
    @NamedQuery(name = "Route.findByRoutecode", query = "SELECT r FROM Route r WHERE r.routecode = :routecode")})
public class Route implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal rtid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(nullable = false, length = 16)
    private String routecode;
    @JoinColumn(name = "DESTINATION", referencedColumnName = "AIRPORTID", nullable = false)
    @ManyToOne(optional = false)
    private Airportcoordinateslist destination;
    @JoinColumn(name = "AIRPORT", referencedColumnName = "AIRPORTID", nullable = false)
    @ManyToOne(optional = false)
    private Airportcoordinateslist airport;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "route")
    private List<Airfar> airfarList;

    public Route() {
    }

    public Route(BigDecimal rtid) {
        this.rtid = rtid;
    }

    public Route(BigDecimal rtid, String routecode) {
        this.rtid = rtid;
        this.routecode = routecode;
    }

    public BigDecimal getRtid() {
        return rtid;
    }

    public void setRtid(BigDecimal rtid) {
        this.rtid = rtid;
    }

    public String getRoutecode() {
        return routecode;
    }

    public void setRoutecode(String routecode) {
        this.routecode = routecode;
    }

    public Airportcoordinateslist getDestination() {
        return destination;
    }

    public void setDestination(Airportcoordinateslist destination) {
        this.destination = destination;
    }

    public Airportcoordinateslist getAirport() {
        return airport;
    }

    public void setAirport(Airportcoordinateslist airport) {
        this.airport = airport;
    }

    @XmlTransient
    public List<Airfar> getAirfarList() {
        return airfarList;
    }

    public void setAirfarList(List<Airfar> airfarList) {
        this.airfarList = airfarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtid != null ? rtid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Route)) {
            return false;
        }
        Route other = (Route) object;
        if ((this.rtid == null && other.rtid != null) || (this.rtid != null && !this.rtid.equals(other.rtid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Route[ rtid=" + rtid + " ]";
    }
    
}
