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
    @NamedQuery(name = "Activepropertylist.findAll", query = "SELECT a FROM Activepropertylist a"),
    @NamedQuery(name = "Activepropertylist.findByEanhotelid", query = "SELECT a FROM Activepropertylist a WHERE a.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Activepropertylist.findBySequencenumber", query = "SELECT a FROM Activepropertylist a WHERE a.sequencenumber = :sequencenumber"),
    @NamedQuery(name = "Activepropertylist.findByNames", query = "SELECT a FROM Activepropertylist a WHERE a.names = :names"),
    @NamedQuery(name = "Activepropertylist.findByAdress1", query = "SELECT a FROM Activepropertylist a WHERE a.adress1 = :adress1"),
    @NamedQuery(name = "Activepropertylist.findByAdress2", query = "SELECT a FROM Activepropertylist a WHERE a.adress2 = :adress2"),
    @NamedQuery(name = "Activepropertylist.findByCity", query = "SELECT a FROM Activepropertylist a WHERE a.city = :city"),
    @NamedQuery(name = "Activepropertylist.findByStateprovince", query = "SELECT a FROM Activepropertylist a WHERE a.stateprovince = :stateprovince"),
    @NamedQuery(name = "Activepropertylist.findByPostalcode", query = "SELECT a FROM Activepropertylist a WHERE a.postalcode = :postalcode"),
    @NamedQuery(name = "Activepropertylist.findByCountry", query = "SELECT a FROM Activepropertylist a WHERE a.country = :country"),
    @NamedQuery(name = "Activepropertylist.findByLatitude", query = "SELECT a FROM Activepropertylist a WHERE a.latitude = :latitude"),
    @NamedQuery(name = "Activepropertylist.findByLongitude", query = "SELECT a FROM Activepropertylist a WHERE a.longitude = :longitude"),
    @NamedQuery(name = "Activepropertylist.findByAirportcode", query = "SELECT a FROM Activepropertylist a WHERE a.airportcode = :airportcode"),
    @NamedQuery(name = "Activepropertylist.findByPropertycategory", query = "SELECT a FROM Activepropertylist a WHERE a.propertycategory = :propertycategory"),
    @NamedQuery(name = "Activepropertylist.findByPropertycurrency", query = "SELECT a FROM Activepropertylist a WHERE a.propertycurrency = :propertycurrency"),
    @NamedQuery(name = "Activepropertylist.findByStarRating", query = "SELECT a FROM Activepropertylist a WHERE a.starRating = :starRating"),
    @NamedQuery(name = "Activepropertylist.findByConfidence", query = "SELECT a FROM Activepropertylist a WHERE a.confidence = :confidence"),
    @NamedQuery(name = "Activepropertylist.findBySuppliertype", query = "SELECT a FROM Activepropertylist a WHERE a.suppliertype = :suppliertype"),
    @NamedQuery(name = "Activepropertylist.findByLocations", query = "SELECT a FROM Activepropertylist a WHERE a.locations = :locations"),
    @NamedQuery(name = "Activepropertylist.findByChaincode", query = "SELECT a FROM Activepropertylist a WHERE a.chaincode = :chaincode"),
    @NamedQuery(name = "Activepropertylist.findByRegionid", query = "SELECT a FROM Activepropertylist a WHERE a.regionid = :regionid"),
    @NamedQuery(name = "Activepropertylist.findByHighrate", query = "SELECT a FROM Activepropertylist a WHERE a.highrate = :highrate"),
    @NamedQuery(name = "Activepropertylist.findByLowrate", query = "SELECT a FROM Activepropertylist a WHERE a.lowrate = :lowrate"),
    @NamedQuery(name = "Activepropertylist.findByCheckintime", query = "SELECT a FROM Activepropertylist a WHERE a.checkintime = :checkintime"),
    @NamedQuery(name = "Activepropertylist.findByCheckouttime", query = "SELECT a FROM Activepropertylist a WHERE a.checkouttime = :checkouttime")})
public class Activepropertylist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal eanhotelid;
    private BigInteger sequencenumber;
    @Size(max = 70)
    @Column(length = 70)
    private String names;
    @Size(max = 50)
    @Column(length = 50)
    private String adress1;
    @Size(max = 50)
    @Column(length = 50)
    private String adress2;
    @Size(max = 50)
    @Column(length = 50)
    private String city;
    @Size(max = 2)
    @Column(length = 2)
    private String stateprovince;
    @Size(max = 15)
    @Column(length = 15)
    private String postalcode;
    @Size(max = 2)
    @Column(length = 2)
    private String country;
    @Column(precision = 8, scale = 5)
    private BigDecimal latitude;
    @Column(precision = 8, scale = 5)
    private BigDecimal longitude;
    @Size(max = 3)
    @Column(length = 3)
    private String airportcode;
    private BigInteger propertycategory;
    @Size(max = 3)
    @Column(length = 3)
    private String propertycurrency;
    @Column(name = "StarRating ", precision = 2, scale = 1)
    private BigDecimal starRating;
    private BigInteger confidence;
    @Size(max = 3)
    @Column(length = 3)
    private String suppliertype;
    @Size(max = 80)
    @Column(length = 80)
    private String locations;
    @Size(max = 5)
    @Column(length = 5)
    private String chaincode;
    private BigInteger regionid;
    @Column(precision = 19, scale = 4)
    private BigDecimal highrate;
    @Column(precision = 19, scale = 4)
    private BigDecimal lowrate;
    @Size(max = 10)
    @Column(length = 10)
    private String checkintime;
    @Size(max = 10)
    @Column(length = 10)
    private String checkouttime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHotelBooked")
    private List<HotelBooked> hotelBookedList;

    public Activepropertylist() {
    }

    public Activepropertylist(BigDecimal eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public BigDecimal getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigDecimal eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public BigInteger getSequencenumber() {
        return sequencenumber;
    }

    public void setSequencenumber(BigInteger sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAdress1() {
        return adress1;
    }

    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    public String getAdress2() {
        return adress2;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateprovince() {
        return stateprovince;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode;
    }

    public BigInteger getPropertycategory() {
        return propertycategory;
    }

    public void setPropertycategory(BigInteger propertycategory) {
        this.propertycategory = propertycategory;
    }

    public String getPropertycurrency() {
        return propertycurrency;
    }

    public void setPropertycurrency(String propertycurrency) {
        this.propertycurrency = propertycurrency;
    }

    public BigDecimal getStarRating() {
        return starRating;
    }

    public void setStarRating(BigDecimal starRating) {
        this.starRating = starRating;
    }

    public BigInteger getConfidence() {
        return confidence;
    }

    public void setConfidence(BigInteger confidence) {
        this.confidence = confidence;
    }

    public String getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(String suppliertype) {
        this.suppliertype = suppliertype;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getChaincode() {
        return chaincode;
    }

    public void setChaincode(String chaincode) {
        this.chaincode = chaincode;
    }

    public BigInteger getRegionid() {
        return regionid;
    }

    public void setRegionid(BigInteger regionid) {
        this.regionid = regionid;
    }

    public BigDecimal getHighrate() {
        return highrate;
    }

    public void setHighrate(BigDecimal highrate) {
        this.highrate = highrate;
    }

    public BigDecimal getLowrate() {
        return lowrate;
    }

    public void setLowrate(BigDecimal lowrate) {
        this.lowrate = lowrate;
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    @XmlTransient
    public List<HotelBooked> getHotelBookedList() {
        return hotelBookedList;
    }

    public void setHotelBookedList(List<HotelBooked> hotelBookedList) {
        this.hotelBookedList = hotelBookedList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eanhotelid != null ? eanhotelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activepropertylist)) {
            return false;
        }
        Activepropertylist other = (Activepropertylist) object;
        if ((this.eanhotelid == null && other.eanhotelid != null) || (this.eanhotelid != null && !this.eanhotelid.equals(other.eanhotelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Activepropertylist[ eanhotelid=" + eanhotelid + " ]";
    }
    
}
