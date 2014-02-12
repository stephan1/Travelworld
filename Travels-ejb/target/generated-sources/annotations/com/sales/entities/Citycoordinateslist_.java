package com.sales.entities;

import com.sales.entities.Branches;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Citycoordinateslist.class)
public class Citycoordinateslist_ { 

    public static volatile SingularAttribute<Citycoordinateslist, String> regionname;
    public static volatile SingularAttribute<Citycoordinateslist, BigDecimal> regionid;
    public static volatile ListAttribute<Citycoordinateslist, Branches> branchesList;
    public static volatile SingularAttribute<Citycoordinateslist, String> coordinates;

}