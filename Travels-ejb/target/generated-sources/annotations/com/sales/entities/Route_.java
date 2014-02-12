package com.sales.entities;

import com.sales.entities.Airfar;
import com.sales.entities.Airportcoordinateslist;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Route.class)
public class Route_ { 

    public static volatile SingularAttribute<Route, Airportcoordinateslist> airport;
    public static volatile SingularAttribute<Route, String> routecode;
    public static volatile ListAttribute<Route, Airfar> airfarList;
    public static volatile SingularAttribute<Route, BigDecimal> rtid;
    public static volatile SingularAttribute<Route, Airportcoordinateslist> destination;

}