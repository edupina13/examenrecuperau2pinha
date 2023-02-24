package mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino.Destino;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "viajes")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date salida;
    private Date regreso;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Destino destino;

}
