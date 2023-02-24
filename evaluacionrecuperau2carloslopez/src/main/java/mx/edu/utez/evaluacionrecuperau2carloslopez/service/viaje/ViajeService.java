package mx.edu.utez.evaluacionrecuperau2carloslopez.service.viaje;

import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.Usuario;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.usuario.UsuarioRepository;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje.Viaje;
import mx.edu.utez.evaluacionrecuperau2carloslopez.model.viaje.ViajeRepository;
import mx.edu.utez.evaluacionrecuperau2carloslopez.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ViajeService {
    @Autowired
    private ViajeRepository repository;

    public Response getAll() {
        return new Response<List<Viaje>>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }

    public Response getOne(Long id) {
        if (this.repository.existsById(id))
            return new Response<Viaje>(
                    this.repository.findById(id).get(),
                    false,
                    200,
                    "OK"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este viaje"
        );
    }

    public Response insert(Viaje viaje) {
        return new Response(
                this.repository.saveAndFlush(viaje),
                false,
                200,
                "viaje registrado correctamente"
        );
    }

    public Response update(Viaje viaje) {
        if (this.repository.existsById(viaje.getId()))
            return new Response(
                    this.repository.saveAndFlush(viaje),
                    false,
                    200,
                    "viaje actualizado correctamente"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este viaje"
        );
    }

    public Response delete(Long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return new Response(
                    null,
                    false,
                    200,
                    "viaje eliminado correctamente"
            );
        }
        return new Response(
                null,
                true,
                200,
                "No existe este viaje"
        );
    }
}
