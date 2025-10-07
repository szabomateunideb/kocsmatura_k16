package hu.unideb.inf.kocsmatura.controller;

import hu.unideb.inf.kocsmatura.service.KocsmaCardService;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pub")
public class KocsmaCardController {

    final KocsmaCardService kocsmaCardService;

    public KocsmaCardController(KocsmaCardService kocsmaCardService) {
        this.kocsmaCardService = kocsmaCardService;
    }

    void init(){
        KocsmaCardDto kocsmaCardDto = new KocsmaCardDto();
        kocsmaCardDto.setNev("xy");
        kocsmaCardDto.setCim("4032");
        kocsmaCardDto.setElerhetoseg("+36 30 ..");

        kocsmaCardService.save(kocsmaCardDto);
        kocsmaCardService.save(kocsmaCardDto);
        kocsmaCardService.save(kocsmaCardDto);


    }
}
