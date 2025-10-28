package hu.unideb.inf.kocsmatura.service.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class BejelentkezesDto {

    private String felhasznalonev;
    private String jelszo;
}
