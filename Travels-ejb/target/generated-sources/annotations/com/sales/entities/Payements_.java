package com.sales.entities;

import com.sales.entities.Bookings;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Payements.class)
public class Payements_ { 

    public static volatile SingularAttribute<Payements, BigInteger> paymentAmount;
    public static volatile SingularAttribute<Payements, Date> payementDate;
    public static volatile SingularAttribute<Payements, Bookings> bookingId;
    public static volatile SingularAttribute<Payements, BigDecimal> paymentid;
    public static volatile SingularAttribute<Payements, String> cardNumber;

}