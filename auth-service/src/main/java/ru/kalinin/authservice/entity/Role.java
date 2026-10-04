package ru.kalinin.authservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kalinin.authservice.entity.enums.RoleType;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
@NoArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 50, nullable = false, unique = true)
    private RoleType type;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

}
