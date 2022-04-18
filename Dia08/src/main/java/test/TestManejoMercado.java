package test;

import com.mycompany.dia8.Models.Cliente;
import com.mycompany.dia8.Models.ClienteDao;
import java.util.List;

public class TestManejoMercado {
    public static void main(String[] args) {
        ClienteDao personaDao = new ClienteDao();
        List<Cliente> clientes = personaDao.listar();
        for(Cliente cliente : clientes){
            System.out.println("cliente = " + cliente);
        }
    }
}
