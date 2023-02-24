package mx.edu.utez.evaluacionrecuperau2carloslopez.controller.viaje.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino.Destino;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje.Viaje;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ViajeDto {

    private Long id;
    private Date salida;
    private Date regreso;
    private Usuario usuario;
    private Destino destino;

    public Viaje parseToViaje() {
        return new Viaje(
                getId(),
                getSalida(),
                getRegreso(),
                getUsuario(),
                getDestino()

        );
    }
}

