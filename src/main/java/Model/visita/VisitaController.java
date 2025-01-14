package model.visita;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Visita")
public class VisitaController {

    private VisitRepository visitRepository;

    @GetMapping
    public List<Visita> list() {return visitRepository.findAll();}

    @PostMapping
    public Visita create(@RequestBody Visita visita){return visitRepository.save(visita);}

    @GetMapping("/{id}")
    public Visita getbyId(@PathVariable Long id){return visitRepository.findVisitaById(id)
            .orElseThrow(() -> new RuntimeException("Visita not found"));}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){visitRepository.deleteById(id);}
}