package academy.atl.customers.services;


import academy.atl.customers.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImp implements CustomerService {

    private final List<Customer> list = new ArrayList<>();

    public CustomerServiceImp() {
        Customer c1 = new Customer();
        c1.setId(1);
        c1.setFirstname("Lucas");
        c1.setLastname("Moy");
        c1.setEmail("lucasmoy@gmail.com");
        c1.setAddress("Siempre viva 34");
        list.add(c1);


        Customer c2 = new Customer();
        c2.setId(2);
        c2.setFirstname("Marcos");
        c2.setLastname("Tor");
        c2.setEmail("mator@hotmail.com");
        c2.setAddress("Siempre viva 55");
        list.add(c2);
    }

   // Traer un cliente especifico
    public Customer getCustomer( Integer id) {
        for (Customer customer : list) {
            if (Objects.equals(customer.getId(), id)) {
                return customer;
            }

        }
        return null;
    }

 // Traer todos los clientes
    public List<Customer> getAllCustomers() {
        return list;
    }

// Eliminar un cliente
    public void removeCustomer( Integer id) {
        for (Customer customer : list) {
            if (Objects.equals(customer.getId(), id)) {
                list.remove(customer);
            }
            break;
        }

    }

 // Agregar cliente
    public void addCustomer( Customer customer) {
        list.add(customer);
    }

// Modificar cliente
    public void updateCustomer( Integer id, Customer updateCustomer) {
        for (Customer customer : list) {
            if (Objects.equals(customer.getId(), id)) {
                list.remove(customer);
                updateCustomer.setId(id);
                list.add(updateCustomer);
                break;
            }
        }
    }

// Busqueda
    public List<Customer> searchCustomer(String email) {
        List<Customer> searchResult = new ArrayList<>();

        for (Customer customer : list) {
            if (customer.getEmail().contains(email)) {
                searchResult.add(customer);
            }

        }
        return searchResult;
    }
}
