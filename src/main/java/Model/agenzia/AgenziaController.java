package Model.agenzia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Agenzia")
public class AgenziaController {

    @Autowired
    private AgenziaRepository agenziaRepository;

    @GetMapping
    public List<Agenzia> listaAgenzie(){return agenziaRepository.findAll();}

    @PostMapping
    public Agenzia createAgenzia(@RequestBody Agenzia agenzia){return agenziaRepository.save(agenzia);}

    @GetMapping("/{id}")
    public Agenzia getAgenziabyId(@PathVariable Long id){return agenziaRepository.findAgenziaById(id)
            .orElseThrow(() -> new RuntimeException("Agente not found")); }

    @DeleteMapping("/{id}")
    public void deleteAgenzia(@PathVariable Long id){agenziaRepository.deleteById(id);}
}
