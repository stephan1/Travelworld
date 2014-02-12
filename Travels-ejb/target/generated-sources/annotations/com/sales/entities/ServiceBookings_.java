package com.sales.entities;

import com.sales.entities.Bookings;
import com.sales.entities.ServiceBookingsPK;
import com.sales.entities.Services;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(ServiceBookings.class)
public class ServiceBookings_ { 

    public static volatile SingularAttribute<ServiceBookings, Services> services;
    public static volatile SingularAttribute<ServiceBookings, Date> bookingEndDate;
    public static volatile SingularAttribute<ServiceBookings, Bookings> bookings;
    public static volatile SingularAttribute<ServiceBookings, ServiceBookingsPK> serviceBookingsPK;
    public static volatile SingularAttribute<ServiceBookings, Date> bookingStartDate;

}