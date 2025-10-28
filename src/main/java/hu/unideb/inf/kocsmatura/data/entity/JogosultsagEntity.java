package hu.unideb.inf.kocsmatura.data.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "Roles")
public class JogosultsagEntity implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "role_name")
    String nev;

    @Override
    public String getAuthority() {
        return nev;
    }
}
