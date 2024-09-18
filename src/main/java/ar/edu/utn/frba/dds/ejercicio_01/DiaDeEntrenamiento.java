package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name= "dia_entrenamiento")
public class DiaDeEntrenamiento {
  @Id
  @GeneratedValue(generator = "uuid")
  private UUID id;
  @OneToMany
  @JoinColumn(name = "dia_entrenamiento_id")
  private List<Ejercicio> ejercicios;
@Column(name = "numero")
  private Integer numero; // representa el orden en la duracion de la rutina.
  @OneToOne
  @JoinColumn(name = "siguiente_dia_id")
  private DiaDeEntrenamiento siguienteDia;

  public DiaDeEntrenamiento() {
    this.ejercicios = new ArrayList<>();
  }
  public void agregarEjercicio(Ejercicio ejercicio) {
    this.ejercicios.add(ejercicio);
  }
}
