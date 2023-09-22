package com.proyecto.carcenter.Controller;

import com.proyecto.carcenter.Services.MantenimientoDTO;
import com.proyecto.carcenter.Services.MantenimientoService;
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
@RequestMapping("/mantenimiento")
public class MantenimientoController {

    private final MantenimientoService mantenimientoService;

    @Autowired
    public MantenimientoController(MantenimientoService mantenimientoService) {
        this.mantenimientoService = mantenimientoService;
    }


    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("vehiculoDTO", new VehiculoDTO());
        return "vehiculos-form";
    }


    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("vehiculoDTO") MantenimientoDTO mantenimientoDTO) {
        mantenimientoService.registrarMantenimiento(mantenimientoDTO);
        return "redirect:/vehiculos";
    }
}
