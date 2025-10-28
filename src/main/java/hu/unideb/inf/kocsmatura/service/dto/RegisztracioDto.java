package hu.unideb.inf.kocsmatura.service.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class RegisztracioDto {
    private String nev;
    private LocalDate szuletesiDatum;
    private String felhasznalonev;
    private String jelszo;
}
