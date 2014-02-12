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
    @UniqueConstraint(columnNames = {"EMAIL"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByIdpass", query = "SELECT c FROM Customer c WHERE c.idpass = :idpass"),
    @NamedQuery(name = "Customer.findByFirstName", query = "SELECT c FROM Customer c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c FROM Customer c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer.findByAge", query = "SELECT c FROM Customer c WHERE c.age = :age"),
    @NamedQuery(name = "Customer.findByNationalities", query = "SELECT c FROM Customer c WHERE c.nationalities = :nationalities"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByTelephone", query = "SELECT c FROM Customer c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address"),
    @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 38, scale = 0)
    private BigDecimal idpass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "FIRST_NAME", nullable = false, length = 32)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "LAST_NAME", nullable = false, length = 32)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private BigInteger age;
    @Size(max = 16)
    @Column(length = 16)
    private String nationalities;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(nullable = false, length = 32)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(nullable = false, length = 16)
    private String telephone;
    @Size(max = 56)
    @Column(length = 56)
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<HotelBooked> hotelBookedList;
    @OneToMany(mappedBy = "customer")
    private List<SeatsAircraft> seatsAircraftList;
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRYID", nullable = false)
    @ManyToOne(optional = false)
    private Countrylist countryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<Bookings> bookingsList;

    public Customer() {
    }

    public Customer(BigDecimal idpass) {
        this.idpass = idpass;
    }

    public Customer(BigDecimal idpass, String firstName, String lastName, BigInteger age, String email, String telephone, String password) {
        this.idpass = idpass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public BigDecimal getIdpass() {
        return idpass;
    }

    public void setIdpass(BigDecimal idpass) {
        this.idpass = idpass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public String getNationalities() {
        return nationalities;
    }

    public void setNationalities(String nationalities) {
        this.nationalities = nationalities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<HotelBooked> getHotelBookedList() {
        return hotelBookedList;
    }

    public void setHotelBookedList(List<HotelBooked> hotelBookedList) {
        this.hotelBookedList = hotelBookedList;
    }

    @XmlTransient
    public List<SeatsAircraft> getSeatsAircraftList() {
        return seatsAircraftList;
    }

    public void setSeatsAircraftList(List<SeatsAircraft> seatsAircraftList) {
        this.seatsAircraftList = seatsAircraftList;
    }

    public Countrylist getCountryId() {
        return countryId;
    }

    public void setCountryId(Countrylist countryId) {
        this.countryId = countryId;
    }

    @XmlTransient
    public List<Bookings> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Bookings> bookingsList) {
        this.bookingsList = bookingsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpass != null ? idpass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.idpass == null && other.idpass != null) || (this.idpass != null && !this.idpass.equals(other.idpass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sales.entities.Customer[ idpass=" + idpass + " ]";
    }
    
}
