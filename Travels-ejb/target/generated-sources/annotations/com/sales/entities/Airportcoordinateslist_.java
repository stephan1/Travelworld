package com.sales.entities;

import com.sales.entities.Route;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Airportcoordinateslist.class)
public class Airportcoordinateslist_ { 

    public static volatile SingularAttribute<Airportcoordinateslist, String> airportcode;
    public static volatile ListAttribute<Airportcoordinateslist, Route> routeList;
    public static volatile SingularAttribute<Airportcoordinateslist, String> airportname;
    public static volatile SingularAttribute<Airportcoordinateslist, String> countrycode;
    public static volatile SingularAttribute<Airportcoordinateslist, BigDecimal> airportid;
    public static volatile SingularAttribute<Airportcoordinateslist, BigInteger> maincityid;
    public static volatile ListAttribute<Airportcoordinateslist, Route> routeList1;
    public static volatile SingularAttribute<Airportcoordinateslist, BigDecimal> longitude;
    public static volatile SingularAttribute<Airportcoordinateslist, BigDecimal> latitude;

}