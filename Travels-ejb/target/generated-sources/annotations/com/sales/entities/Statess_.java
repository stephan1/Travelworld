package com.sales.entities;

import com.sales.entities.Countrylist;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Statess.class)
public class Statess_ { 

    public static volatile SingularAttribute<Statess, BigDecimal> stid;
    public static volatile SingularAttribute<Statess, String> statename;
    public static volatile SingularAttribute<Statess, Countrylist> country;

}