package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.logica.Factura;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-08-01T16:45:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Person_ {

    public static volatile ListAttribute<Cliente, Factura> listaFacturas;
    public static volatile SingularAttribute<Cliente, Integer> client_id;

}