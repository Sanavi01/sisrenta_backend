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
    
    public void createEmployee(Employee employee) {
        persisController.createEmployee(employee);
    }

    public Employee findEmployeeByPhoneNumber(String phoneNumber) {
        return persisController.findEmployeeByPhoneNumber(phoneNumber);
    }

    public void editEmployee(Employee employeeFound) {
        persisController.editEmployee(employeeFound);
    }

    public void deleteEmployee(int employee_id) {
        persisController.deteteEmployee(employee_id);
    }

    // --------------------Factura Methods --------------------------
}
