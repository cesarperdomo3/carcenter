package com.proyecto.carcenter.Controller;

import com.proyecto.carcenter.Services.MecanicoDTO;
import com.proyecto.carcenter.Services.MecanicoService;
import com.proyecto.carcenter.Services.VehiculoDTO;
import com.proyecto.carcenter.Services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehiculos")

public class MecanicoController {

    private final MecanicoService mecanicoService;

    @Autowired
    public MecanicoController(MecanicoService mecanicoService) {
        this.mecanicoService = mecanicoService;
    }


    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("vehiculoDTO", new VehiculoDTO());
        return "vehiculos-form";
    }


    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("vehiculoDTO") MecanicoDTO mecanicoDTO) {
        mecanicoService.asignarMecanico(mecanicoDTO);
        return "redirect:/vehiculos";
    }
}
