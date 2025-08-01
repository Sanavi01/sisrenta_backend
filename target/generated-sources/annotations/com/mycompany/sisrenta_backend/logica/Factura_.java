package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.logica.Cliente;
import com.mycompany.sisrenta_backend.logica.Employee;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-08-01T16:45:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> rentValue;
    public static volatile SingularAttribute<Factura, String> description;
    public static volatile SingularAttribute<Factura, LocalDateTime> creationDate;
    public static volatile SingularAttribute<Factura, Employee> employee;
    public static volatile SingularAttribute<Factura, Integer> depositValue;
    public static volatile SingularAttribute<Factura, LocalDateTime> deliveredDate;
    public static volatile SingularAttribute<Factura, Cliente> cliente;
    public static volatile SingularAttribute<Factura, LocalDateTime> devolutionDate;
    public static volatile SingularAttribute<Factura, String> extraInfoRent;
    public static volatile SingularAttribute<Factura, LocalDateTime> deliverDate;
    public static volatile SingularAttribute<Factura, LocalDateTime> finishDate;
    public static volatile SingularAttribute<Factura, Integer> id;
    public static volatile SingularAttribute<Factura, String> state;
    public static volatile SingularAttribute<Factura, Integer> creditValue;

}