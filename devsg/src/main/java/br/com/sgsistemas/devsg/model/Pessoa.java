package br.com.sgsistemas.devsg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @ManyToOne
    @JsonIgnore
    private Equipe equipe;


}
