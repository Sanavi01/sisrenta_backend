package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.persistence.PersistenceController;
import java.util.LinkedList;

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

    public void createFactura(Factura factura) {
        persisController.createFactura(factura);
    }

    public LinkedList<Factura> findFacturasDelCliente(String phoneNumber) {
        Cliente cliente = findClienteByPhoneNumber(phoneNumber);
        return cliente.getListaFacturas();
    }

    public Factura findFacturaById(int id) {
        return persisController.findFacturaById(id);
    }

    public void editFactura(Factura facturaEncontrada) {
        persisController.editFactura(facturaEncontrada);
    }

    public void deleteFactura(int id) {
        persisController.deleteFactura(id);
    }




    
    
}
