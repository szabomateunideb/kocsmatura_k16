package hu.unideb.inf.kocsmatura.service;

import hu.unideb.inf.kocsmatura.service.dto.BejelentkezesDto;
import hu.unideb.inf.kocsmatura.service.dto.RegisztracioDto;

public interface AuthenticationService {

    public void regisztracio(RegisztracioDto dto);
    public String bejelentkezes(BejelentkezesDto dto);
}
