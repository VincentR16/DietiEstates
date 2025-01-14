package model.agente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agent")
public class AgenteController {

    private AgenteRepository agenteRepository;

    @GetMapping
    public List<Agente> lista(){return agenteRepository.findAll();}

    @PostMapping
    public Agente create(@RequestBody Agente agente){return agenteRepository.save(agente);}

    @GetMapping("/{id}")
    public Agente getbyId(@PathVariable Long id){return agenteRepository.findAgenteById(id)
            .orElseThrow(() -> new RuntimeException("Agente not found")); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){agenteRepository.deleteById(id);}
}
