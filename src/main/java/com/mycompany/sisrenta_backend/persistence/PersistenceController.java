package com.mycompany.sisrenta_backend.persistence;

import com.mycompany.sisrenta_backend.logica.Cliente;
import com.mycompany.sisrenta_backend.persistence.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanavi
 */
public class PersistenceController {

    // --------------------ClienteJpaController--------------------------
    ClienteJpaController clienteJpa = new ClienteJpaController();

    public void createCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public Cliente findClienteByPhoneNumber(String phoneNumber) {
        return clienteJpa.findClienteByPhoneNumber(phoneNumber);
    }

    public void editCliente(Cliente clienteEncontrado) {
        try {
            clienteJpa.edit(clienteEncontrado);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCliente(int client_id) {
        try {
            clienteJpa.destroy(client_id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // --------------------Employee Jpa Controller --------------------------
    EmployeeJpaController employeeJpa = new EmployeeJpaController();

    // --------------------Factura Jpa Controller --------------------------
    FacturaJpaController facturaJpa = new FacturaJpaController();

}
