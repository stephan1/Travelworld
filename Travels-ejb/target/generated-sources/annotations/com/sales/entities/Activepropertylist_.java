package com.sales.entities;

import com.sales.entities.HotelBooked;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Activepropertylist.class)
public class Activepropertylist_ { 

    public static volatile ListAttribute<Activepropertylist, HotelBooked> hotelBookedList;
    public static volatile SingularAttribute<Activepropertylist, String> postalcode;
    public static volatile SingularAttribute<Activepropertylist, String> suppliertype;
    public static volatile SingularAttribute<Activepropertylist, BigInteger> sequencenumber;
    public static volatile SingularAttribute<Activepropertylist, BigInteger> confidence;
    public static volatile SingularAttribute<Activepropertylist, String> chaincode;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> lowrate;
    public static volatile SingularAttribute<Activepropertylist, String> checkintime;
    public static volatile SingularAttribute<Activepropertylist, String> city;
    public static volatile SingularAttribute<Activepropertylist, String> country;
    public static volatile SingularAttribute<Activepropertylist, String> airportcode;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> starRating;
    public static volatile SingularAttribute<Activepropertylist, String> checkouttime;
    public static volatile SingularAttribute<Activepropertylist, String> locations;
    public static volatile SingularAttribute<Activepropertylist, BigInteger> regionid;
    public static volatile SingularAttribute<Activepropertylist, String> names;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> highrate;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> longitude;
    public static volatile SingularAttribute<Activepropertylist, BigInteger> propertycategory;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> latitude;
    public static volatile SingularAttribute<Activepropertylist, String> stateprovince;
    public static volatile SingularAttribute<Activepropertylist, String> adress2;
    public static volatile SingularAttribute<Activepropertylist, String> adress1;
    public static volatile SingularAttribute<Activepropertylist, String> propertycurrency;
    public static volatile SingularAttribute<Activepropertylist, BigDecimal> eanhotelid;

}