package com.sales.entities;

import com.sales.entities.Citycoordinateslist;
import com.sales.entities.Employees;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Branches.class)
public class Branches_ { 

    public static volatile SingularAttribute<Branches, String> center;
    public static volatile SingularAttribute<Branches, String> address;
    public static volatile SingularAttribute<Branches, BigDecimal> brid;
    public static volatile SingularAttribute<Branches, Citycoordinateslist> regionId;
    public static volatile ListAttribute<Branches, Employees> employeesList;

}