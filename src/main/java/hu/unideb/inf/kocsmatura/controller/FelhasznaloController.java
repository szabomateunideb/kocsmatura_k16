package hu.unideb.inf.kocsmatura.controller;

import hu.unideb.inf.kocsmatura.data.entity.FelhasznaloEntity;
import hu.unideb.inf.kocsmatura.data.repository.FelhasznaloRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
@RequestMapping("api/users")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloRepository felhasznaloRepository;

    @GetMapping("/insert")
    public FelhasznaloEntity insertMock(){
        FelhasznaloEntity f = new FelhasznaloEntity(
                null,
                "Elek",
                Date.from(Instant.now()),
                "N",
                "Elek1",
                "pw1",
                null);
        f = felhasznaloRepository.save(f);
        return f;
    }
}
