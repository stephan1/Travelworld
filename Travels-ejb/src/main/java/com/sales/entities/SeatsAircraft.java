/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "SEATS_AIRCRAFT", catalog = "", schema = "TRAVELWORLD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"USERSEATROW"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeatsAircraft.findAll", query = "SELECT s FROM SeatsAircraft s"),
    @NamedQuery(name = "SeatsAircraft.findByIdSeat", query = "SELECT s FROM SeatsAircraft s WHERE s.idSeat = :idSeat"),
    @NamedQuery(name = "SeatsAircraft.findByUserrow", query = "SELECT s FROM SeatsAircraft s WHERE s.userrow = :userrow"),
    @NamedQuery(name = "SeatsAircraft.findByUserseatrow", query = "SELECT s FROM SeatsAircraft s WHERE s.userseatrow = :userseatrow"),
    @NamedQuery(name = "SeatsAircraft.findByReserved", query = "SELECT s FROM SeatsAircraft s WHERE s.reserved = :reserved")})
public class SeatsAircraft implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SEAT", nullable = false, precision = 38, scale = 0)
    private BigDecimal idSeat;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger userrow;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger userseatrow;
    private Character reserved;
    @JoinColumn(name = "CUSTOMER", referencedColumnName = "IDPASS")
    @ManyToOne
    private Customer customer;
    @JoinColumn(name = "AIRCRAFT", referencedColumnName = "ACID", nullable = false)
    @ManyToOne(optional = false)
    private Aircraft aircraft;

    public SeatsAircraft() {
    }

    public SeatsAircraft(BigDecimal idSeat) {
        this.idSeat = idSeat;
    }

    public SeatsAircraft(BigDecimal idSeat, BigInteger userrow, BigInteger userseatrow) {
        this.idSeat = idSeat;
        this.userrow = userrow;
        this.userseatrow = userseatrow;
    }

    public BigDecimal getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(BigDecimal idSeat) {
        this.idSeat = idSeat;
    }

    public BigInteger getUserrow() {
        return userrow;
    }

    public void setUserrow(BigInteger userrow) {
        this.userrow = userrow;
    }

    public BigInteger getUserseatrow() {
        return userseatrow;
    }

    public void setUserseatrow(BigInteger userseatrow) {
        this.userseatrow = userseatrow;
    }

    public Character getReserved() {
        return reserved;
    }

    public void setReserved(Character reserved) {
        this.reserved = reserved;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeat != null ? idSeat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeatsAircraft)) {
            return false;
        }
        SeatsAircraft other = (SeatsAircraft) object;
        if ((this.idSeat == null && other.idSeat != null) || (this.idSeat != null && !this.idSeat.equals(other.idSeat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.SeatsAircraft[ idSeat=" + idSeat + " ]";
    }
    
}
