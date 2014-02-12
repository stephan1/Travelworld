package com.sales.entities;

import com.sales.entities.Activepropertylist;
import com.sales.entities.Bookings;
import com.sales.entities.Customer;
import com.sales.entities.Services;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(HotelBooked.class)
public class HotelBooked_ { 

    public static volatile SingularAttribute<HotelBooked, BigDecimal> id;
    public static volatile SingularAttribute<HotelBooked, Services> serviceId;
    public static volatile SingularAttribute<HotelBooked, Bookings> idBookings;
    public static volatile SingularAttribute<HotelBooked, Activepropertylist> idHotelBooked;
    public static volatile SingularAttribute<HotelBooked, Customer> customer;
    public static volatile SingularAttribute<HotelBooked, Date> datesChoosed;

}