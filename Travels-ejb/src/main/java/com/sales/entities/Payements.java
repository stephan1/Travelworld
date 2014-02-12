/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payements.findAll", query = "SELECT p FROM Payements p"),
    @NamedQuery(name = "Payements.findByPaymentid", query = "SELECT p FROM Payements p WHERE p.paymentid = :paymentid"),
    @NamedQuery(name = "Payements.findByPaymentAmount", query = "SELECT p FROM Payements p WHERE p.paymentAmount = :paymentAmount"),
    @NamedQuery(name = "Payements.findByPayementDate", query = "SELECT p FROM Payements p WHERE p.payementDate = :payementDate"),
    @NamedQuery(name = "Payements.findByCardNumber", query = "SELECT p FROM Payements p WHERE p.cardNumber = :cardNumber")})
public class Payements implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal paymentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_amount ", nullable = false)
    private BigInteger paymentAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYEMENT_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date payementDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "CARD_NUMBER", nullable = false, length = 32)
    private String cardNumber;
    @JoinColumn(name = "BOOKING_ID", referencedColumnName = "BOOKING_ID", nullable = false)
    @ManyToOne(optional = false)
    private Bookings bookingId;

    public Payements() {
    }

    public Payements(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public Payements(BigDecimal paymentid, BigInteger paymentAmount, Date payementDate, String cardNumber) {
        this.paymentid = paymentid;
        this.paymentAmount = paymentAmount;
        this.payementDate = payementDate;
        this.cardNumber = cardNumber;
    }

    public BigDecimal getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(BigDecimal paymentid) {
        this.paymentid = paymentid;
    }

    public BigInteger getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigInteger paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(Date payementDate) {
        this.payementDate = payementDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Bookings getBookingId() {
        return bookingId;
    }

    public void setBookingId(Bookings bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentid != null ? paymentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payements)) {
            return false;
        }
        Payements other = (Payements) object;
        if ((this.paymentid == null && other.paymentid != null) || (this.paymentid != null && !this.paymentid.equals(other.paymentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Payements[ paymentid=" + paymentid + " ]";
    }
    
}
