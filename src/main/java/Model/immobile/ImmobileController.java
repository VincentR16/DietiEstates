package Model.immobile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Immobile")
public class ImmobileController {

    private ImmobileRepository immobileRepository;

    @GetMapping
    public List<Immobile> listaImmobili(){return immobileRepository.findAll();}

    @PostMapping
    public Immobile createImmobile (@RequestBody  Immobile immobile){return immobileRepository.save(immobile);}

    @GetMapping("/{id}")
    public Immobile getImmobilebyId(@PathVariable Long id){return immobileRepository.findImmobileById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }
    @DeleteMapping("/{id}")
    public void deleteImmobile(@PathVariable Long id){immobileRepository.deleteById(id);}
}
