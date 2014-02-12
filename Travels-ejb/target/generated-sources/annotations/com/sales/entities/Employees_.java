package com.sales.entities;

import com.sales.entities.Branches;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-09T14:57:55")
@StaticMetamodel(Employees.class)
public class Employees_ { 

    public static volatile SingularAttribute<Employees, BigDecimal> empid;
    public static volatile SingularAttribute<Employees, String> lastName;
    public static volatile SingularAttribute<Employees, String> email;
    public static volatile SingularAttribute<Employees, String> designation;
    public static volatile SingularAttribute<Employees, Branches> branch;
    public static volatile SingularAttribute<Employees, String> firstName;
    public static volatile SingularAttribute<Employees, String> telephone;
    public static volatile SingularAttribute<Employees, String> adressEmp;

}