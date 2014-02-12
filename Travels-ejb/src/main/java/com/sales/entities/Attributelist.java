/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Attributelist.findAll", query = "SELECT a FROM Attributelist a"),
    @NamedQuery(name = "Attributelist.findByAttributeid", query = "SELECT a FROM Attributelist a WHERE a.attributeid = :attributeid"),
    @NamedQuery(name = "Attributelist.findByLanguagecode", query = "SELECT a FROM Attributelist a WHERE a.languagecode = :languagecode"),
    @NamedQuery(name = "Attributelist.findByAttributedesc", query = "SELECT a FROM Attributelist a WHERE a.attributedesc = :attributedesc"),
    @NamedQuery(name = "Attributelist.findByType", query = "SELECT a FROM Attributelist a WHERE a.type = :type"),
    @NamedQuery(name = "Attributelist.findBySubtype", query = "SELECT a FROM Attributelist a WHERE a.subtype = :subtype")})
public class Attributelist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal attributeid;
    @Size(max = 5)
    @Column(length = 5)
    private String languagecode;
    @Size(max = 255)
    @Column(length = 255)
    private String attributedesc;
    @Size(max = 15)
    @Column(length = 15)
    private String type;
    @Size(max = 15)
    @Column(length = 15)
    private String subtype;

    public Attributelist() {
    }

    public Attributelist(BigDecimal attributeid) {
        this.attributeid = attributeid;
    }

    public BigDecimal getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(BigDecimal attributeid) {
        this.attributeid = attributeid;
    }

    public String getLanguagecode() {
        return languagecode;
    }

    public void setLanguagecode(String languagecode) {
        this.languagecode = languagecode;
    }

    public String getAttributedesc() {
        return attributedesc;
    }

    public void setAttributedesc(String attributedesc) {
        this.attributedesc = attributedesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attributeid != null ? attributeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Attributelist)) {
            return false;
        }
        Attributelist other = (Attributelist) object;
        if ((this.attributeid == null && other.attributeid != null) || (this.attributeid != null && !this.attributeid.equals(other.attributeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Attributelist[ attributeid=" + attributeid + " ]";
    }
    
}
