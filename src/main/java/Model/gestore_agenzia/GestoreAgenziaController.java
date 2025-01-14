package model.gestore_agenzia;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestoreAgenzia")
public class GestoreAgenziaController {

    private GestoreAgenziaRepository gestoreAgenziaRepository;

    @GetMapping
    public List<GestoreAgenzia> get(){
        return gestoreAgenziaRepository.findAll();
    }
    @PostMapping
    public GestoreAgenzia create(@RequestBody GestoreAgenzia gestore) {
        return gestoreAgenziaRepository.save(gestore);
    }

    @GetMapping("/{id}")
    public GestoreAgenzia getById(@PathVariable Long id) {
        return gestoreAgenziaRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        gestoreAgenziaRepository.deleteById(id);
    }
}
