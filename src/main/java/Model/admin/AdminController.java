package model.admin;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    private AdminRepository adminRepository;

    @GetMapping
    public List<Admin> list(){return adminRepository.findAll();}

    @PostMapping
    public Admin create (@RequestBody Admin admin){return adminRepository.save(admin);}

    @GetMapping("/{id}")
    public Admin getbyId(@PathVariable Long id){return adminRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Admin not found")); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){adminRepository.deleteById(id);}
}
