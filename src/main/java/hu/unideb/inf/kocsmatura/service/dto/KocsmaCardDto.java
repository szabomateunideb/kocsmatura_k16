package hu.unideb.inf.kocsmatura.service.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class KocsmaCardDto {

    private Long id;
    private String nev;
    private String cim;
    private String nyitvatartas;
    private Integer arszint;
    private String elerhetoseg;
}
