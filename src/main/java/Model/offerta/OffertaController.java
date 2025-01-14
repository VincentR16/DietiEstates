package model.offerta;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Offerta")
public class OffertaController {

    private OffertaRepository offertaRepository;

    @GetMapping
    public List<Offerta> list(){return offertaRepository.findAll();}

    @PostMapping
    public Offerta create (@RequestBody Offerta offerta){return offertaRepository.save(offerta);}

    @GetMapping("/{id}")
    public Offerta getbyId(@PathVariable Long id){return offertaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){offertaRepository.deleteById(id);}
}
