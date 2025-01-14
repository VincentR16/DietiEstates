package model.notifica_promozionale;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/NotificaPromozionale")
public class NotificaPromozionaleController {

    private NotificaPromozionaleRepository notificaPRepository;

    @GetMapping
    public List<NotificaPromozionale> list(){return notificaPRepository.findAll();}

    @PostMapping
    public NotificaPromozionale create (@RequestBody NotificaPromozionale notifica){return notificaPRepository.save(notifica);}

    @GetMapping("/{id}")
    public NotificaPromozionale getbyId(@PathVariable Long id){return notificaPRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Immobile not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){notificaPRepository.deleteById(id);}
}
