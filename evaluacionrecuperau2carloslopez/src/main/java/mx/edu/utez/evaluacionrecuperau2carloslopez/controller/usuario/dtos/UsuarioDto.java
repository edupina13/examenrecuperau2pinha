package mx.edu.utez.evaluacionrecuperau2carloslopez.controller.usuario.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuarioDto {

    private Long id;
    private String nombre;
    private String correo;
    private Date fecha;

    public Usuario parseToUsuario() {
        return new Usuario(
                getId(),
                getNombre(),
                getCorreo(),
                getFecha()
        );
    }
}
