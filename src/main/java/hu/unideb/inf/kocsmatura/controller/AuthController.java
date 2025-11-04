package hu.unideb.inf.kocsmatura.controller;

import hu.unideb.inf.kocsmatura.service.AuthenticationService;
import hu.unideb.inf.kocsmatura.service.dto.BejelentkezesDto;
import hu.unideb.inf.kocsmatura.service.dto.RegisztracioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    private final AuthenticationService authService;

    public AuthController(AuthenticationService authService) {
        this.authService = authService;
    }

    @PostMapping("/regisztracio")
    public void regisztracio(@RequestBody RegisztracioDto dto){
        authService.regisztracio(dto);
    }

    @PostMapping("/bejelentkezes")
    public void bejelentkezes(@RequestBody BejelentkezesDto dto){
        authService.bejelentkezes(dto);
    }
}
