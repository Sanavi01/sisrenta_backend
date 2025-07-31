package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.persistence.PersistenceController;

/**
 *
 * @author sanavi
 */
public class LogicController {

    PersistenceController persisController = new PersistenceController();

    // --------------------Cliente methods --------------------------
    
    public void createCliente(Cliente cliente) {
        persisController.createCliente(cliente);
    }

    public Cliente findClienteByPhoneNumber(String phoneNumber) {
        Cliente clienteEncontrado = persisController.findClienteByPhoneNumber(phoneNumber);
        return clienteEncontrado;
    }

    public void editCliente(Cliente clienteEncontrado) {
        persisController.editCliente(clienteEncontrado);
    }

    public void deleteCliente(int client_id) {
        persisController.deleteCliente(client_id);
    }

    // --------------------Employee Methods --------------------------
    // --------------------Factura Methods --------------------------
}
