package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalle", columnDefinition = "TEXT")
    private String detalle;
}
