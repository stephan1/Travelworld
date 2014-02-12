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
    @NamedQuery(name = "Chainlist.findAll", query = "SELECT c FROM Chainlist c"),
    @NamedQuery(name = "Chainlist.findByChaincodeid", query = "SELECT c FROM Chainlist c WHERE c.chaincodeid = :chaincodeid"),
    @NamedQuery(name = "Chainlist.findByChainname", query = "SELECT c FROM Chainlist c WHERE c.chainname = :chainname")})
public class Chainlist implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 0, scale = -127)
    private BigDecimal chaincodeid;
    @Size(max = 30)
    @Column(length = 30)
    private String chainname;

    public Chainlist() {
    }

    public Chainlist(BigDecimal chaincodeid) {
        this.chaincodeid = chaincodeid;
    }

    public BigDecimal getChaincodeid() {
        return chaincodeid;
    }

    public void setChaincodeid(BigDecimal chaincodeid) {
        this.chaincodeid = chaincodeid;
    }

    public String getChainname() {
        return chainname;
    }

    public void setChainname(String chainname) {
        this.chainname = chainname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chaincodeid != null ? chaincodeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chainlist)) {
            return false;
        }
        Chainlist other = (Chainlist) object;
        if ((this.chaincodeid == null && other.chaincodeid != null) || (this.chaincodeid != null && !this.chaincodeid.equals(other.chaincodeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Chainlist[ chaincodeid=" + chaincodeid + " ]";
    }
    
}
