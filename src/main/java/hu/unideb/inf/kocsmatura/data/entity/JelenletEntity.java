package hu.unideb.inf.kocsmatura.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attendance")
public class JelenletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private FelhasznaloEntity felhasznalo;
    @OneToOne
    @JoinColumn(name = "pub_id", referencedColumnName = "id")
    private KocsmaEntity kocsma;
}
