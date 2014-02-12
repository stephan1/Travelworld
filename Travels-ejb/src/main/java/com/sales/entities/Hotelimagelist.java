/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
    @NamedQuery(name = "Hotelimagelist.findAll", query = "SELECT h FROM Hotelimagelist h"),
    @NamedQuery(name = "Hotelimagelist.findByEanhotelid", query = "SELECT h FROM Hotelimagelist h WHERE h.eanhotelid = :eanhotelid"),
    @NamedQuery(name = "Hotelimagelist.findByCaption", query = "SELECT h FROM Hotelimagelist h WHERE h.caption = :caption"),
    @NamedQuery(name = "Hotelimagelist.findByUrl", query = "SELECT h FROM Hotelimagelist h WHERE h.url = :url"),
    @NamedQuery(name = "Hotelimagelist.findByWidth", query = "SELECT h FROM Hotelimagelist h WHERE h.width = :width"),
    @NamedQuery(name = "Hotelimagelist.findByHeight", query = "SELECT h FROM Hotelimagelist h WHERE h.height = :height"),
    @NamedQuery(name = "Hotelimagelist.findByBytesize", query = "SELECT h FROM Hotelimagelist h WHERE h.bytesize = :bytesize"),
    @NamedQuery(name = "Hotelimagelist.findByThumbnailurl", query = "SELECT h FROM Hotelimagelist h WHERE h.thumbnailurl = :thumbnailurl"),
    @NamedQuery(name = "Hotelimagelist.findByDefaultimage", query = "SELECT h FROM Hotelimagelist h WHERE h.defaultimage = :defaultimage")})
public class Hotelimagelist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger eanhotelid;
    @Size(max = 70)
    @Column(length = 70)
    private String caption;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(nullable = false, length = 150)
    private String url;
    private BigInteger width;
    private BigInteger height;
    private BigInteger bytesize;
    @Size(max = 300)
    @Column(length = 300)
    private String thumbnailurl;
    @Size(max = 4000)
    @Column(length = 4000)
    private String defaultimage;

    public Hotelimagelist() {
    }

    public Hotelimagelist(String url) {
        this.url = url;
    }

    public Hotelimagelist(String url, BigInteger eanhotelid) {
        this.url = url;
        this.eanhotelid = eanhotelid;
    }

    public BigInteger getEanhotelid() {
        return eanhotelid;
    }

    public void setEanhotelid(BigInteger eanhotelid) {
        this.eanhotelid = eanhotelid;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigInteger getWidth() {
        return width;
    }

    public void setWidth(BigInteger width) {
        this.width = width;
    }

    public BigInteger getHeight() {
        return height;
    }

    public void setHeight(BigInteger height) {
        this.height = height;
    }

    public BigInteger getBytesize() {
        return bytesize;
    }

    public void setBytesize(BigInteger bytesize) {
        this.bytesize = bytesize;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getDefaultimage() {
        return defaultimage;
    }

    public void setDefaultimage(String defaultimage) {
        this.defaultimage = defaultimage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (url != null ? url.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotelimagelist)) {
            return false;
        }
        Hotelimagelist other = (Hotelimagelist) object;
        if ((this.url == null && other.url != null) || (this.url != null && !this.url.equals(other.url))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Hotelimagelist[ url=" + url + " ]";
    }
    
}
