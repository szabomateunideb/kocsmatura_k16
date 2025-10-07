package hu.unideb.inf.kocsmatura.controller;

import hu.unideb.inf.kocsmatura.service.KocsmaCardService;
import hu.unideb.inf.kocsmatura.service.dto.KocsmaCardDto;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pub")
public class KocsmaCardController {

    final KocsmaCardService kocsmaCardService;

    public KocsmaCardController(KocsmaCardService kocsmaCardService) {
        this.kocsmaCardService = kocsmaCardService;
    }

    @GetMapping("/init")
    void init(){
        KocsmaCardDto kocsmaCardDto = new KocsmaCardDto();
        kocsmaCardDto.setNev("xy");
        kocsmaCardDto.setCim("4032");
        kocsmaCardDto.setElerhetoseg("+36 30 ..");

        kocsmaCardService.save(kocsmaCardDto);
        kocsmaCardDto.setNev("zzs");
        kocsmaCardService.save(kocsmaCardDto);
        kocsmaCardDto.setNev("ab");
        kocsmaCardService.save(kocsmaCardDto);
    }

    //localhost:9090/api/pub/byId
    @GetMapping("/byId")
    KocsmaCardDto findById(@RequestParam Long id){
        return kocsmaCardService.findById(id);
    }

    //localhost:9090/api/byName/xy
    @GetMapping("/byName/{name}")
    KocsmaCardDto findByName(@PathVariable String name) {
        return kocsmaCardService.findByName(name);
    }

}
