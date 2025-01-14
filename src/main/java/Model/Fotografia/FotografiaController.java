package model.fotografia;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Fotografia")
public class FotografiaController {

    private FotografiaRepository fotografiaRepository;

    @GetMapping
    public List<Fotografia> get(){return fotografiaRepository.findAll();}
    @PostMapping
    public Fotografia create(@RequestBody Fotografia fotografia) {
        return fotografiaRepository.save(fotografia);
    }

    @GetMapping("/{id}")
    public Fotografia getById(@PathVariable Long id) {
        return fotografiaRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        fotografiaRepository.deleteById(id);
    }
}
