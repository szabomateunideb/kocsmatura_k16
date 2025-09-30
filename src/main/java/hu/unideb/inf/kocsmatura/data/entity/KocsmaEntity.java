package hu.unideb.inf.kocsmatura.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pub")
public class KocsmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String nev;
    @Column(name = "address")
    private String cim;
    @Column(name = "lat")
    private Double lat;
    @Column(name = "lon")
    private Double lon;
    @Column(name = "description")
    private String leiras;
    @Column(name = "open_hours")
    private String nyitvatartas;
    @Column(name = "price")
    private Integer arszint;
    @Column(name = "contact")
    private String elerhetoseg;
}
