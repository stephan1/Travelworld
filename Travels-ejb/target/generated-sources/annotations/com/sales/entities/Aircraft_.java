package com.sales.entities;

import com.sales.entities.FlightSchedule;
import com.sales.entities.SeatsAircraft;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Aircraft.class)
public class Aircraft_ { 

    public static volatile SingularAttribute<Aircraft, Date> mfdon;
    public static volatile ListAttribute<Aircraft, FlightSchedule> flightScheduleList;
    public static volatile ListAttribute<Aircraft, SeatsAircraft> seatsAircraftList;
    public static volatile SingularAttribute<Aircraft, BigDecimal> acid;
    public static volatile SingularAttribute<Aircraft, String> mdfby;
    public static volatile SingularAttribute<Aircraft, BigInteger> capacity;
    public static volatile SingularAttribute<Aircraft, String> acnumber;

}