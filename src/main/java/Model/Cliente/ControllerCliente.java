package Model.Cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ControllerCliente {

    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getClienti(){
        return clienteRepository.findAll();
    }
    @PostMapping
    public Cliente createUser(@RequestBody Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getUserById(@PathVariable Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

}
