package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.logica.Factura;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-07-31T21:15:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Employee.class)
public class Employee_ extends Person_ {

    public static volatile SingularAttribute<Employee, String> password;
    public static volatile ListAttribute<Employee, Factura> listaFacturas;
    public static volatile SingularAttribute<Employee, Integer> employee_id;
    public static volatile SingularAttribute<Employee, String> identificationNumber;
    public static volatile SingularAttribute<Employee, String> username;

}