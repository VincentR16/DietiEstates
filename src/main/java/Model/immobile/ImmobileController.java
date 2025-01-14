package model.immobile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Immobile")
public class ImmobileController {

    private ImmobileRepository immobileRepository;

    @GetMapping
    public List<Immobile> list(){return immobileRepository.findAll();}

    @PostMapping
    public Immobile create (@RequestBody  Immobile immobile){return immobileRepository.save(immobile);}

    @GetMapping("/{id}")
    public Immobile getbyId(@PathVariable Long id){return immobileRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){immobileRepository.deleteById(id);}
}
