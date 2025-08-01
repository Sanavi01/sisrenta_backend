package com.mycompany.sisrenta_backend.logica;

import com.mycompany.sisrenta_backend.persistence.PersistenceController;
import java.time.LocalDateTime;
import java.util.List;

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
        factura.setCreationDate(LocalDateTime.now());
        factura.setState("Apartado");
        persisController.createFactura(factura);
    }

    public List<Factura> findFacturasDelCliente(String phoneNumber) {
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

    public void switchFacturaStatus(int id) {
        Factura factura = findFacturaById(id);
        System.out.println(factura.getState());
        if(factura.getState().equals("Apartado")){
            factura.setState("Entregado");
            factura.setDeliveredDate(LocalDateTime.now());
            editFactura(factura);
        } else if(factura.getState().equals("Entregado")){
            factura.setState("Recibido");
            editFactura(factura);
        }

    }




    
    
}
