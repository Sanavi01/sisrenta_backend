package com.mycompany.sisrenta_backend.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-07-31T11:24:51", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> rentValue;
    public static volatile SingularAttribute<Factura, Date> devolutionDate;
    public static volatile SingularAttribute<Factura, String> extraInfoRent;
    public static volatile SingularAttribute<Factura, String> description;
    public static volatile SingularAttribute<Factura, Date> deliverDate;
    public static volatile SingularAttribute<Factura, Integer> id;
    public static volatile SingularAttribute<Factura, String> state;
    public static volatile SingularAttribute<Factura, Date> creationDate;
    public static volatile SingularAttribute<Factura, Integer> creditValue;
    public static volatile SingularAttribute<Factura, Integer> depositValue;

}