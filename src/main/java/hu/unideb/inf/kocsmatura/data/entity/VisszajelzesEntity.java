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
@Table(name = "feedback")
public class VisszajelzesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "clean")
    private Integer tisztasag;
    @Column(name = "prices")
    private Integer arak;
    @Column(name = "feeling")
    private Integer hangulat;
    @Column(name = "service")
    private Integer kiszolgalas;
    @Column(name = "description")
    private String leiras;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private FelhasznaloEntity felhasznalo;
    @ManyToOne
    @JoinColumn(name = "kocsma_id")
    private KocsmaEntity kocsma;

}