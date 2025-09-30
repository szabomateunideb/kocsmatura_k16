package hu.unideb.inf.kocsmatura.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class FelhasznaloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String nev;
    @Column(name = "date_of_birth", nullable = false)
    private Date szuletesiDatum;
    @Column(name = "sex")
    private String nem;
    @Column(name = "username", unique = true)
    private String felhasznalonev;
    @Column(name = "password")
    private String jelszo;
}
