package com.sales.entities;

import com.sales.entities.Aircraft;
import com.sales.entities.Airfar;
import com.sales.entities.AirlineBooked;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(FlightSchedule.class)
public class FlightSchedule_ { 

    public static volatile SingularAttribute<FlightSchedule, BigDecimal> fiid;
    public static volatile SingularAttribute<FlightSchedule, Date> flightdate;
    public static volatile ListAttribute<FlightSchedule, AirlineBooked> airlineBookedList;
    public static volatile SingularAttribute<FlightSchedule, Aircraft> aircraft;
    public static volatile SingularAttribute<FlightSchedule, Date> departure;
    public static volatile SingularAttribute<FlightSchedule, Date> arrival;
    public static volatile SingularAttribute<FlightSchedule, Airfar> aifar;

}