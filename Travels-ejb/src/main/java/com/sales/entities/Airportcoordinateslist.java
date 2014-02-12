/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
    @NamedQuery(name = "Airportcoordinateslist.findAll", query = "SELECT a FROM Airportcoordinateslist a"),
    @NamedQuery(name = "Airportcoordinateslist.findByAirportid", query = "SELECT a FROM Airportcoordinateslist a WHERE a.airportid = :airportid"),
    @NamedQuery(name = "Airportcoordinateslist.findByAirportcode", query = "SELECT a FROM Airportcoordinateslist a WHERE a.airportcode = :airportcode"),
    @NamedQuery(name = "Airportcoordinateslist.findByAirportname", query = "SELECT a FROM Airportcoordinateslist a WHERE a.airportname = :airportname"),
    @NamedQuery(name = "Airportcoordinateslist.findByLatitude", query = "SELECT a FROM Airportcoordinateslist a WHERE a.latitude = :latitude"),
    @NamedQuery(name = "Airportcoordinateslist.findByLongitude", query = "SELECT a FROM Airportcoordinateslist a WHERE a.longitude = :longitude"),
    @NamedQuery(name = "Airportcoordinateslist.findByMaincityid", query = "SELECT a FROM Airportcoordinateslist a WHERE a.maincityid = :maincityid"),
    @NamedQuery(name = "Airportcoordinateslist.findByCountrycode", query = "SELECT a FROM Airportcoordinateslist a WHERE a.countrycode = :countrycode")})
public class Airportcoordinateslist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal airportid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String airportcode;
    @Size(max = 150)
    @Column(length = 150)
    private String airportname;
    @Column(precision = 9, scale = 6)
    private BigDecimal latitude;
    @Column(precision = 9, scale = 6)
    private BigDecimal longitude;
    private BigInteger maincityid;
    @Size(max = 2)
    @Column(length = 2)
    private String countrycode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destination")
    private List<Route> routeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airport")
    private List<Route> routeList1;

    public Airportcoordinateslist() {
    }

    public Airportcoordinateslist(BigDecimal airportid) {
        this.airportid = airportid;
    }

    public Airportcoordinateslist(BigDecimal airportid, String airportcode) {
        this.airportid = airportid;
        this.airportcode = airportcode;
    }

    public BigDecimal getAirportid() {
        return airportid;
    }

    public void setAirportid(BigDecimal airportid) {
        this.airportid = airportid;
    }

    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigInteger getMaincityid() {
        return maincityid;
    }

    public void setMaincityid(BigInteger maincityid) {
        this.maincityid = maincityid;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @XmlTransient
    public List<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<Route> routeList) {
        this.routeList = routeList;
    }

    @XmlTransient
    public List<Route> getRouteList1() {
        return routeList1;
    }

    public void setRouteList1(List<Route> routeList1) {
        this.routeList1 = routeList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (airportid != null ? airportid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Airportcoordinateslist)) {
            return false;
        }
        Airportcoordinateslist other = (Airportcoordinateslist) object;
        if ((this.airportid == null && other.airportid != null) || (this.airportid != null && !this.airportid.equals(other.airportid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Airportcoordinateslist[ airportid=" + airportid + " ]";
    }
    
}
