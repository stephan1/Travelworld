package com.sales.entities;

import com.sales.entities.Aircraft;
import com.sales.entities.Customer;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(SeatsAircraft.class)
public class SeatsAircraft_ { 

    public static volatile SingularAttribute<SeatsAircraft, BigInteger> userseatrow;
    public static volatile SingularAttribute<SeatsAircraft, BigInteger> userrow;
    public static volatile SingularAttribute<SeatsAircraft, BigDecimal> idSeat;
    public static volatile SingularAttribute<SeatsAircraft, Aircraft> aircraft;
    public static volatile SingularAttribute<SeatsAircraft, Customer> customer;
    public static volatile SingularAttribute<SeatsAircraft, Character> reserved;

}