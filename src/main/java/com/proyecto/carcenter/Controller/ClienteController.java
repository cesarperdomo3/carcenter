package com.proyecto.carcenter.Controller;

import com.proyecto.carcenter.Model.Cliente;
import com.proyecto.carcenter.Services.ClienteDTO;
import com.proyecto.carcenter.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Mostrar el formulario de registro
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("clienteDTO", new ClienteDTO());
        return "cliente-form";
    }

    // Procesar el formulario de registro
    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("clienteDTO") ClienteDTO clienteDTO) {
        clienteService.registrarCliente(clienteDTO);
        return "redirect:/clientes"; // Redireccionar de vuelta a la lista de clientes después de agregar uno nuevo.
    }
}