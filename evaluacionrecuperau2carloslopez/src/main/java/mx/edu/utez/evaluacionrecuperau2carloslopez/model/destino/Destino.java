package mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "destinos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Double calificacion;
    private boolean disponibilidad;


}

