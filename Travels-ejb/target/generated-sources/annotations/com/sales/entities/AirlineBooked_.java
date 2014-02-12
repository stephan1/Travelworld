package com.sales.entities;

import com.sales.entities.Bookings;
import com.sales.entities.FlightSchedule;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(AirlineBooked.class)
public class AirlineBooked_ { 

    public static volatile SingularAttribute<AirlineBooked, Date> dateBookedAirline;
    public static volatile SingularAttribute<AirlineBooked, BigInteger> numSeat;
    public static volatile SingularAttribute<AirlineBooked, BigDecimal> idAirlinebooked;
    public static volatile SingularAttribute<AirlineBooked, BigInteger> idCustomer;
    public static volatile SingularAttribute<AirlineBooked, BigInteger> serviceId;
    public static volatile SingularAttribute<AirlineBooked, Bookings> idBooking;
    public static volatile SingularAttribute<AirlineBooked, FlightSchedule> flightSchedule;

}