package model.visita;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Visita")
public class VisitaController {

    private VisitRepository visitRepository;

    @GetMapping
    public List<Visita> listaVisite() {return visitRepository.findAll();}

    @PostMapping
    public Visita createVisita(@RequestBody Visita visita){return visitRepository.save(visita);}

    @GetMapping("/{id}")
    public Visita getVisitabyId(@PathVariable Long id){return visitRepository.findVisitaById(id)
            .orElseThrow(() -> new RuntimeException("Visita not found"));}

    @DeleteMapping("/{id}")
    public void deleteVisita(@PathVariable Long id){visitRepository.deleteById(id);}
}