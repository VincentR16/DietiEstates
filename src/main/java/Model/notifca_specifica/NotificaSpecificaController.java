package model.notifca_specifica;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/NotficaSpecifica")
public class NotificaSpecificaController {

    private NotificaSpecificaRepository notificaSRepository;

    @GetMapping
    public List<NotificaSpecifica> list(){return notificaSRepository.findAll();}

    @PostMapping
    public NotificaSpecifica create (@RequestBody NotificaSpecifica notifica){return notificaSRepository.save(notifica);}

    @GetMapping("/{id}")
    public NotificaSpecifica getbyId(@PathVariable Long id){return notificaSRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){notificaSRepository.deleteById(id);}
}
