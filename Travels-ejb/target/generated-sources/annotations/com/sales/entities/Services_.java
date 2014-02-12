package com.sales.entities;

import com.sales.entities.HotelBooked;
import com.sales.entities.Roomtypelist;
import com.sales.entities.ServiceBookings;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Services.class)
public class Services_ { 

    public static volatile ListAttribute<Services, HotelBooked> hotelBookedList;
    public static volatile ListAttribute<Services, Roomtypelist> roomtypelistList;
    public static volatile SingularAttribute<Services, BigDecimal> serviceId;
    public static volatile SingularAttribute<Services, String> serviceDetails;
    public static volatile ListAttribute<Services, ServiceBookings> serviceBookingsList;

}