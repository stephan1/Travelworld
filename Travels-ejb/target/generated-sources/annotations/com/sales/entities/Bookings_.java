package com.sales.entities;

import com.sales.entities.AirlineBooked;
import com.sales.entities.Customer;
import com.sales.entities.HotelBooked;
import com.sales.entities.Payements;
import com.sales.entities.ServiceBookings;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Bookings.class)
public class Bookings_ { 

    public static volatile SingularAttribute<Bookings, String> statusCode;
    public static volatile ListAttribute<Bookings, HotelBooked> hotelBookedList;
    public static volatile SingularAttribute<Bookings, BigDecimal> bookingId;
    public static volatile SingularAttribute<Bookings, Customer> customerId;
    public static volatile ListAttribute<Bookings, ServiceBookings> serviceBookingsList;
    public static volatile ListAttribute<Bookings, AirlineBooked> airlineBookedList;
    public static volatile ListAttribute<Bookings, Payements> payementsList;
    public static volatile SingularAttribute<Bookings, Date> bookingsDate;

}