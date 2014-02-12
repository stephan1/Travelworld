package com.sales.entities;

import com.sales.entities.Customer;
import com.sales.entities.Statess;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Countrylist.class)
public class Countrylist_ { 

    public static volatile SingularAttribute<Countrylist, String> countrycode;
    public static volatile ListAttribute<Countrylist, Statess> statessList;
    public static volatile SingularAttribute<Countrylist, String> transliteration;
    public static volatile SingularAttribute<Countrylist, BigInteger> continentid;
    public static volatile SingularAttribute<Countrylist, String> countryname;
    public static volatile SingularAttribute<Countrylist, String> languagecode;
    public static volatile ListAttribute<Countrylist, Customer> customerList;
    public static volatile SingularAttribute<Countrylist, BigDecimal> countryid;

}