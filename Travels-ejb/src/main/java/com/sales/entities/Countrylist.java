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
    @NamedQuery(name = "Countrylist.findAll", query = "SELECT c FROM Countrylist c"),
    @NamedQuery(name = "Countrylist.findByCountryid", query = "SELECT c FROM Countrylist c WHERE c.countryid = :countryid"),
    @NamedQuery(name = "Countrylist.findByLanguagecode", query = "SELECT c FROM Countrylist c WHERE c.languagecode = :languagecode"),
    @NamedQuery(name = "Countrylist.findByCountryname", query = "SELECT c FROM Countrylist c WHERE c.countryname = :countryname"),
    @NamedQuery(name = "Countrylist.findByCountrycode", query = "SELECT c FROM Countrylist c WHERE c.countrycode = :countrycode"),
    @NamedQuery(name = "Countrylist.findByTransliteration", query = "SELECT c FROM Countrylist c WHERE c.transliteration = :transliteration"),
    @NamedQuery(name = "Countrylist.findByContinentid", query = "SELECT c FROM Countrylist c WHERE c.continentid = :continentid")})
public class Countrylist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal countryid;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 256)
    @Column(length = 256)
    private String countryname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(nullable = false, length = 24)
    private String countrycode;
    @Size(max = 256)
    @Column(length = 256)
    private String transliteration;
    private BigInteger continentid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private List<Statess> statessList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryId")
    private List<Customer> customerList;

    public Countrylist() {
    }

    public Countrylist(BigDecimal countryid) {
        this.countryid = countryid;
    }

    public Countrylist(BigDecimal countryid, String countrycode) {
        this.countryid = countryid;
        this.countrycode = countrycode;
    }

    public BigDecimal getCountryid() {
        return countryid;
    }

    public void setCountryid(BigDecimal countryid) {
        this.countryid = countryid;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public BigInteger getContinentid() {
        return continentid;
    }

    public void setContinentid(BigInteger continentid) {
        this.continentid = continentid;
    }

    @XmlTransient
    public List<Statess> getStatessList() {
        return statessList;
    }

    public void setStatessList(List<Statess> statessList) {
        this.statessList = statessList;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryid != null ? countryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countrylist)) {
            return false;
        }
        Countrylist other = (Countrylist) object;
        if ((this.countryid == null && other.countryid != null) || (this.countryid != null && !this.countryid.equals(other.countryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Countrylist[ countryid=" + countryid + " ]";
    }
    
}
