package com.sistemainformacion.VetCarePlus.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.annotation.PostConstruct;
import java.io.File;


@Controller
public class VetCarePlusController {

    @Value("${upload.dir}")
    private String uploadDir;

    @PostConstruct
    public void init() {
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "vistas/inicio";
    }

    @GetMapping("/olvidocontraseña")
    public String olvidocontraseña() {
        return "vistas/olvidocontraseña";
    }

    @GetMapping("/registrarse")
    public String registrarse() {
        return "vistas/registrarse";
    }

    @GetMapping("/principal")
    public String principal() {
        return "vistas/principal";
    }

    @GetMapping("/pawmonitor")
    public String pawmonitor() {
        return "vistas/pawmonitor";
    }

    @GetMapping("/historial")
    public String historial() {
        return "vistas/historial";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "vistas/dashboard";
    }

    @GetMapping("/vacunas")
    public String vacunas() {
        return "vistas/vacunas";
    }
    
    @GetMapping("/perfil")
    public String perfil() {
        return "vistas/perfil";
    }

    @GetMapping("/cambiocontraseña")
    public String cambiocontraseña() {
        return "vistas/cambiocontraseña";
    }

    @GetMapping("/nuevodash")
    public String nuevodash() {
        return "vistas/nuevodash";
    }

    @GetMapping("/nuevodash_firebase")
    public String nuevodash_firebase() {
        return "vistas/nuevodash_firebase";
    }


}
