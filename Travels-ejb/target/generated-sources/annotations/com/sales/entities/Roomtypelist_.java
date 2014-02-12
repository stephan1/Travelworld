package com.sales.entities;

import com.sales.entities.RoomtypelistPK;
import com.sales.entities.Services;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Roomtypelist.class)
public class Roomtypelist_ { 

    public static volatile SingularAttribute<Roomtypelist, BigInteger> pourcentage;
    public static volatile SingularAttribute<Roomtypelist, Services> serviceId;
    public static volatile SingularAttribute<Roomtypelist, String> roomtypedescription;
    public static volatile SingularAttribute<Roomtypelist, RoomtypelistPK> roomtypelistPK;
    public static volatile SingularAttribute<Roomtypelist, String> roomtypeimage;
    public static volatile SingularAttribute<Roomtypelist, String> roomtypename;
    public static volatile SingularAttribute<Roomtypelist, String> languagecode;

}