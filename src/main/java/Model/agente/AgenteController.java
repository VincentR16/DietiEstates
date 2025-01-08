package Model.agente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agent")
public class AgenteController {

    private AgenteRepository agenteRepository;

    @GetMapping
    public List<Agente> listaAgenti(){return agenteRepository.findAll();}

    @PostMapping
    public Agente createAgente(@RequestBody Agente agente){return agenteRepository.save(agente);}

    @GetMapping("/{id}")
    public Agente getAgentebyId(@PathVariable Long id){return agenteRepository.findAgenteById(id)
            .orElseThrow(() -> new RuntimeException("Agente not found")); }
    @DeleteMapping("/{id}")
    public void deleteAgente(@PathVariable Long id){agenteRepository.deleteById(id);}
}
