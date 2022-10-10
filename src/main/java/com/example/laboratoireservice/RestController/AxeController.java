package com.example.laboratoireservice.RestController;

import com.example.laboratoireservice.entities.Axe;
import com.example.laboratoireservice.entities.Labo;
import com.example.laboratoireservice.repository.AxeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AxeController {

    private AxeRepository axeRepository;

    public AxeController(AxeRepository axeRepository) {
        this.axeRepository = axeRepository;
    }

    @GetMapping(path = "/axes")
    public List<Axe> listAxes()
    {
        return axeRepository.findAll();
    }

    @PostMapping("addAxe")
    public Axe addLabo(@RequestBody Axe axe ){

        return axeRepository.save(axe);

    }

    @PutMapping("updateAxe")
    public Axe addAxe(@RequestBody Axe axe) {

        return axeRepository.save(axe);
    }
    @DeleteMapping(path = "axe/{code}")
    public void deleteAxe(@PathVariable (name = "code") long code ) {

        axeRepository.deleteById(code);
    }

}
