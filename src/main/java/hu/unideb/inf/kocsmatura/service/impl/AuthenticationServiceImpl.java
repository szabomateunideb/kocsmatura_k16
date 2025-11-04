package hu.unideb.inf.kocsmatura.service.impl;

import hu.unideb.inf.kocsmatura.data.entity.FelhasznaloEntity;
import hu.unideb.inf.kocsmatura.data.entity.JogosultsagEntity;
import hu.unideb.inf.kocsmatura.data.repository.FelhasznaloRepository;
import hu.unideb.inf.kocsmatura.data.repository.JogosultsagRepository;
import hu.unideb.inf.kocsmatura.service.AuthenticationService;
import hu.unideb.inf.kocsmatura.service.dto.BejelentkezesDto;
import hu.unideb.inf.kocsmatura.service.dto.RegisztracioDto;
import hu.unideb.inf.kocsmatura.service.mapper.FelhasznaloMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final FelhasznaloMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final JogosultsagRepository jogRepo;
    private final FelhasznaloRepository felhRepo;
    private final AuthenticationManager authManager;

    public AuthenticationServiceImpl(FelhasznaloMapper mapper, PasswordEncoder passwordEncoder, JogosultsagRepository jogRepo, FelhasznaloRepository felhRepo, AuthenticationManager authManager) {
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
        this.jogRepo = jogRepo;
        this.felhRepo = felhRepo;
        this.authManager = authManager;
    }

    @Override
    public void regisztracio(RegisztracioDto dto) {
        FelhasznaloEntity e = mapper.dtoToEntity(dto);
        e.setJelszo(passwordEncoder.encode(e.getJelszo()));

        JogosultsagEntity jog = jogRepo.findByNev("FELHASZNALO");
        if(jog != null){
            e.setJogosultsagok(List.of(jog));
        } else {
            jog = new JogosultsagEntity();
            jog.setNev("FELHASZNALO");
            jog = jogRepo.save(jog);

            e.setJogosultsagok(List.of(jog));
        }
        felhRepo.save(e);
    }

    @Override
    public void bejelentkezes(BejelentkezesDto dto) {

        SecurityContext context =
                SecurityContextHolder.createEmptyContext();

        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getFelhasznalonev(),
                        dto.getJelszo()
                )
        );

        context.setAuthentication(auth);
        SecurityContextHolder.setContext(context);
    }
}
