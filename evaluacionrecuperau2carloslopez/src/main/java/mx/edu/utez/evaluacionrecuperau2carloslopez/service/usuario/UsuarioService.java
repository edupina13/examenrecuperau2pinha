package mx.edu.utez.evaluacionrecuperau2carloslopez.service.usuario;

import mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino.Destino;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.destino.DestinoRepository;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.UsuarioRepository;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje.Viaje;
import mx.edu.utez.evaluacionrecuperau2carloslopez.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UsuarioService {



    @Autowired
    private UsuarioRepository repository;

    public Response getAll() {
        return new Response<List<Usuario>>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }

    public Response getOne(Long id) {
        if (this.repository.existsById(id))
            return new Response<Usuario>(
                    this.repository.findById(id).get(),
                    false,
                    200,
                    "OK"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este usuario"
        );
    }

    public Response insert(Usuario usuario) {
        if (this.repository.existsByNombre(usuario.getNombre()))
            return new Response(
                    null,
                    true,
                    200,
                    "Usuario existente"
            );
        return new Response(
                this.repository.saveAndFlush(usuario),
                false,
                200,
                "usuario registrado correctamente"
        );
    }

    public Response update(Usuario usuario) {
        if (this.repository.existsById(usuario.getId()))
            return new Response(
                    this.repository.saveAndFlush(usuario),
                    false,
                    200,
                    "usuario actualizado correctamente"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este entrenador"
        );
    }

    public Response delete(Long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return new Response(
                    null,
                    false,
                    200,
                    "Usuario eliminado correctamente"
            );
        }
        return new Response(
                null,
                true,
                200,
                "No existe este usuario"
        );
    }
}
