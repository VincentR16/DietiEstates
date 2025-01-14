package model.ricerca;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Ricerca")
public class RicercaController {

    private RicercaRepository ricercaRepository;

    @GetMapping
    public List<Ricerca> list(){return ricercaRepository.findAll();}

    @PostMapping
    public Ricerca create (@RequestBody Ricerca ricerca){return ricercaRepository.save(ricerca);}

    @GetMapping("/{id}")
    public Ricerca getbyId(@PathVariable Long id){return ricercaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ricercaRepository.deleteById(id);}

}
