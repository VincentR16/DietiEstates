package model.agenzia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Agenzia")
public class AgenziaController {

    @Autowired
    private AgenziaRepository agenziaRepository;

    @GetMapping
    public List<Agenzia> list(){return agenziaRepository.findAll();}

    @PostMapping
    public Agenzia create(@RequestBody Agenzia agenzia){return agenziaRepository.save(agenzia);}

    @GetMapping("/{id}")
    public Agenzia getbyId(@PathVariable Long id){return agenziaRepository.findAgenziaById(id)
            .orElseThrow(() -> new RuntimeException("Agente not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){agenziaRepository.deleteById(id);}
}
