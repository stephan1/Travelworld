/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(catalog = "", schema = "TRAVELWORLD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grouptable.findAll", query = "SELECT g FROM Grouptable g"),
    @NamedQuery(name = "Grouptable.findByUsername", query = "SELECT g FROM Grouptable g WHERE g.grouptablePK.username = :username"),
    @NamedQuery(name = "Grouptable.findByGroupid", query = "SELECT g FROM Grouptable g WHERE g.grouptablePK.groupid = :groupid")})
public class Grouptable implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrouptablePK grouptablePK;

    public Grouptable() {
    }

    public Grouptable(GrouptablePK grouptablePK) {
        this.grouptablePK = grouptablePK;
    }

    public Grouptable(String username, String groupid) {
        this.grouptablePK = new GrouptablePK(username, groupid);
    }

    public GrouptablePK getGrouptablePK() {
        return grouptablePK;
    }

    public void setGrouptablePK(GrouptablePK grouptablePK) {
        this.grouptablePK = grouptablePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grouptablePK != null ? grouptablePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grouptable)) {
            return false;
        }
        Grouptable other = (Grouptable) object;
        if ((this.grouptablePK == null && other.grouptablePK != null) || (this.grouptablePK != null && !this.grouptablePK.equals(other.grouptablePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Grouptable[ grouptablePK=" + grouptablePK + " ]";
    }
    
}
