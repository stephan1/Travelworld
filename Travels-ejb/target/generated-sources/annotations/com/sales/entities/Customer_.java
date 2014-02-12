package com.sales.entities;

import com.sales.entities.Bookings;
import com.sales.entities.Countrylist;
import com.sales.entities.HotelBooked;
import com.sales.entities.SeatsAircraft;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Countrylist> countryId;
    public static volatile ListAttribute<Customer, HotelBooked> hotelBookedList;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile ListAttribute<Customer, SeatsAircraft> seatsAircraftList;
    public static volatile ListAttribute<Customer, Bookings> bookingsList;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> nationalities;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, BigInteger> age;
    public static volatile SingularAttribute<Customer, BigDecimal> idpass;
    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> telephone;

}